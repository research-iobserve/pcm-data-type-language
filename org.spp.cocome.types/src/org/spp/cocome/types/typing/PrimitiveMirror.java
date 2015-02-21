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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IFragmentProvider;
import org.spp.cocome.types.types.PrimitiveType;
import org.spp.cocome.types.types.TypesFactory;
import org.spp.cocome.types.types.TypesPackage;

/**
 * @author Christian Schneider - Initial contribution
 */
public class PrimitiveMirror {

	/**
	 * Constructs the primitive mirror. It requires a type factory for primitive types described
	 * with strings.
	 * 
	 * @param typeFactory
	 *            The type factory
	 */
	public PrimitiveMirror() {}

	/**
	 * Searches for an object in a resource described by a fragment.
	 * 
	 * @param resource
	 * @param fragment
	 * @param fallback
	 * @return
	 */
	public EObject getEObject(final Resource resource, final String fragment,
			final IFragmentProvider.Fallback fallback) {
		for (final EObject obj : resource.getContents()) {
			final String otherFragment = this.getFragment(obj, fallback);
			if (fragment.equals(otherFragment)) {
				return obj;
			}
		}
		return fallback.getEObject(fragment);
	}

	// TODO Why do we need to hide something we do not inherit?
	/**
	 * This specialisation is introduced to hide the JVMType filtering. {@inheritDoc}
	 */
	public String getFragment(final EObject obj, final IFragmentProvider.Fallback fallback) {
		if (TypesPackage.eINSTANCE.getPrimitiveType().isInstance(obj)) {
			return ((PrimitiveType) obj).getName();
		} else {
			return fallback.getFragment(obj);
		}
	}

	/**
	 * Initialises a given type resource with the primitive types from the type enumeration.
	 * 
	 * @param typeResource
	 *            the type resource to be initialised
	 * 
	 */
	public void initialize(final TypeResource typeResource) {
		for (final PrimitiveTypes primitiveType : PrimitiveTypes.values()) {
			final PrimitiveType type = TypesFactory.eINSTANCE.createPrimitiveType();
			type.setName(primitiveType.getName());
			typeResource.getContents().add(type);
		}
	}
}
