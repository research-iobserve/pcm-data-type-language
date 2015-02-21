/*
 * Science Blog 
 *
 * http://www.se.informatik.uni-kiel.de
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Software Engineering Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package org.spp.cocome.types.typing;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.spp.cocome.types.types.PrimitiveType;
import org.spp.cocome.types.types.Type;
import org.spp.cocome.types.types.TypesFactory;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * This interface is a derivative of
 * org.eclipse.xtext.common.types.xtext.ui.JdtBasedSimpleTypeScope JdtBasedSimpleTypeScope.
 * 
 * @author Christian Schneider
 */
public class PrimitiveTypeScope extends AbstractScope {

	private final ITypeProvider typeProvider;

	private final IQualifiedNameConverter qualifiedNameConverter;

	private final Predicate<IEObjectDescription> filter;

	// TODO should be protected again, need better integration in PCM stuff in behavior
	public PrimitiveTypeScope(final ITypeProvider typeProvider, final IQualifiedNameConverter qualifiedNameConverter,
			final Predicate<IEObjectDescription> filter) {
		super(IScope.NULLSCOPE, false);
		this.typeProvider = typeProvider;
		this.qualifiedNameConverter = qualifiedNameConverter;
		this.filter = filter;
	}

	@Override
	public IEObjectDescription getSingleElement(final QualifiedName name) {
		try {
			final Type type = this.typeProvider.findTypeByName(this.qualifiedNameConverter.toString(name));
			if (type == null) {
				return null;
			}
			final IEObjectDescription result = EObjectDescription.create(name, type);
			if ((this.filter != null) && !this.filter.apply(result)) {
				return null;
			}
			return result;
		} catch (final IllegalArgumentException e) {
			return null;
		}
	}

	@Override
	public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
		final IEObjectDescription result = this.getSingleElement(name);
		if (result != null) {
			return Collections.singleton(result);
		}
		return Collections.emptySet();
	}

	@Override
	public Iterable<IEObjectDescription> getElements(final EObject object) {
		if (object instanceof JvmIdentifiableElement) {
			final Set<IEObjectDescription> result = Collections.singleton(EObjectDescription.create(
					this.qualifiedNameConverter.toQualifiedName(((JvmIdentifiableElement) object).getQualifiedName()),
					object));
			return this.filterResult(result);
		}
		return Collections.emptySet();
	}

	protected Iterable<IEObjectDescription> filterResult(final Iterable<IEObjectDescription> unfiltered) {
		if (this.filter == null) {
			return unfiltered;
		}
		return Iterables.filter(unfiltered, this.filter);
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {
		return this.filterResult(this.internalGetAllElements());
	}

	protected Iterable<IEObjectDescription> internalGetAllElements() {
		final List<IEObjectDescription> types = Lists.newArrayList();

		// this is à la org.eclipse.xtext.common.types.xtext.ui.JdtBasedSimpleTypeScope line 53ff
		for (final PrimitiveType t : this.typeProvider.getAllTypes()) {
			types.add(this.createScopedElement(t.getName()));
		}

		return types;
	}

	protected IEObjectDescription createScopedElement(final String fullyQualifiedName) {
		final InternalEObject proxy = this.createProxy(fullyQualifiedName);
		final IEObjectDescription eObjectDescription = EObjectDescription.create(
				this.qualifiedNameConverter.toQualifiedName(fullyQualifiedName), proxy);
		return eObjectDescription;
	}

	protected InternalEObject createProxy(final String fullyQualifiedName) {
		final URI uri = this.typeProvider.getTypeUriHelper().getFullURIForClass(fullyQualifiedName);
		final InternalEObject proxy = (InternalEObject) TypesFactory.eINSTANCE.createPrimitiveType();
		proxy.eSetProxyURI(uri);
		return proxy;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
