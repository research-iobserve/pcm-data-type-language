/**
 */
package org.spp.cocome.types.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.ComplexType#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.types.types.TypesPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends NamedType
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(ComplexType)
   * @see org.spp.cocome.types.types.TypesPackage#getComplexType_Parent()
   * @model
   * @generated
   */
  ComplexType getParent();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.ComplexType#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ComplexType value);

} // ComplexType
