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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.spp.cocome.types.types.PrimitiveType;

/**
 * The type provider allows to retrieve a list of all primitive types and provides type name lookup.
 * 
 * @author Christian Schneider - Initial contribution
 * @author Reiner Jung - Cleanup and commentary
 * 
 */
public class TypeProvider implements Resource.Factory, ITypeProvider {

	private final DTLTypeURIHelper typeUriHelper;

	private final ResourceSet resourceSet;

	/**
	 * @param resourceSet
	 */
	public TypeProvider(final ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
		this.typeUriHelper = new DTLTypeURIHelper();
	}

	/**
	 * Provides a list of all primitive types.
	 * 
	 * @return Returns an iterable with all primitive types.
	 */
	@Override
	public Iterable<PrimitiveType> getAllTypes() {
		/*
		 * Get the (already created) types from the helper resource and cast the list to a list of
		 * types.
		 */
		return IterableExtensions.map(
				this.resourceSet.getResource(
						URI.createURI(DTLTypeURIHelper.PROTOCOL + ":"
								+ DTLTypeURIHelper.PRIMITIVES), true).getContents(),
				new Function1<EObject, PrimitiveType>() {
					@Override
					public PrimitiveType apply(final EObject p) {
						return (PrimitiveType) p;
					}
				});
	}

	/**
	 * Find the type for a given name and return it.
	 * 
	 * @param name
	 *            The name of the type.
	 * @return Returns the primitive type for a given type name, or null.
	 */
	@Override
	public PrimitiveType findTypeByName(final String name) {
		if (Strings.isEmpty(name)) {
			throw new IllegalArgumentException("null");
		}
		final URI resourceURI = this.typeUriHelper.createResourceURI();
		final TypeResource resource = (TypeResource) this.resourceSet.getResource(resourceURI, true);
		return (PrimitiveType) resource.getEObject(name);
	}

	/**
	 * Create a type resource for a given URI and assign a PrimitiveMirror to it.
	 * 
	 * @param uri
	 *            The URI for the resource
	 */
	@Override
	public TypeResource createResource(final URI uri) {
		return new TypeResource(uri, this.createPrimitiveMirror(uri));
	}

	/**
	 * @returns Returns the URI helper for the type system.
	 */
	@Override
	public DTLTypeURIHelper getTypeUriHelper() {
		return this.typeUriHelper;
	}

	/**
	 * Create a mirror only for primitive types. Throws errors for URIs with a fragment (the stuff
	 * after the # in the URI) and for URIs which are neither references to primitive or object
	 * types.
	 * 
	 * @param resourceURI
	 *            The URI the mirror is created for.
	 * @return Returns the mirror for primitive types and null for object-types.
	 */
	private PrimitiveMirror createPrimitiveMirror(final URI resourceURI) {
		if (resourceURI.hasFragment()) {
			throw new IllegalArgumentException("Cannot create mirror for uri '"
					+ resourceURI.toString() + "'");
		}
		final String name = resourceURI.path();
		if (DTLTypeURIHelper.PRIMITIVES.equals(name)) {
			return new PrimitiveMirror();
		} else {
			throw new IllegalArgumentException("Invalid resource uri '" + resourceURI.toString()
					+ "'");
		}
	}

}
