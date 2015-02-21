/**
 */
package org.spp.cocome.types.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.EnumerationType#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.types.types.TypesPackage#getEnumerationType()
 * @model
 * @generated
 */
public interface EnumerationType extends ComplexType
{
  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link org.spp.cocome.types.types.EnumerationLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see org.spp.cocome.types.types.TypesPackage#getEnumerationType_Literals()
   * @model containment="true"
   * @generated
   */
  EList<EnumerationLiteral> getLiterals();

} // EnumerationType
