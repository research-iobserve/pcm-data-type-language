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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.spp.cocome.types.types.TypesPackage;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

/**
 * Scope provider for the primitive types.
 * 
 * @author Reiner Jung
 * 
 */
public class TypeGlobalScopeProvider extends DefaultGlobalScopeProvider {
	@Inject
	private TypeProviderFactory typeProviderFactory;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public IScope getScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter) {
		final IScope parentTypeScope = this.getParentTypeScope(resource, reference, filter, reference.getEReferenceType());
		return super.getScope(parentTypeScope, resource, false, reference.getEReferenceType(), filter);
	}

	protected IScope getParentTypeScope(final Resource resource, final EReference reference,
			final Predicate<IEObjectDescription> filter, final EClass referenceType) {
		if (EcoreUtil2.isAssignableFrom(TypesPackage.Literals.TYPE, referenceType)) {
			if (resource == null) {
				throw new IllegalStateException("context must be contained in a resource");
			}
			final ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet == null) {
				throw new IllegalStateException("context must be contained in a resource set");
			}
			final ITypeProvider typeProvider = this.typeProviderFactory.getTypeProvider(resourceSet);
			return new PrimitiveTypeScope(typeProvider, this.qualifiedNameConverter, filter);
		} else {
			return IScope.NULLSCOPE;
		}
	}

}
