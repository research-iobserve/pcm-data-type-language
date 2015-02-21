/*
 * Science Blog 
 * 
 * http://www.se.informatik.uni-kiel.de
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package org.spp.cocome.types.typing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.common.types.access.jdt.TypeURIHelper;

/**
 * @author Christian Schneider
 */
public class DTLTypeURIHelper extends TypeURIHelper {
	
    static String PRIMITIVES = "/Primitives"; //$NON-NLS-1$
    static String PROTOCOL = "dtl"; //$NON-NLS-1$

    public URI createResourceURI() {
        return URI.createURI(PROTOCOL + ':' + PRIMITIVES);
    }
    
}
