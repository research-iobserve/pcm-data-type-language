/*
 * generated by Xtext
 */
package org.spp.cocome.types.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractTypesValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.spp.cocome.types.types.TypesPackage.eINSTANCE);
		return result;
	}
}