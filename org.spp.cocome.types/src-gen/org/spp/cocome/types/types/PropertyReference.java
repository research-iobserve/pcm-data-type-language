/**
 */
package org.spp.cocome.types.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.PropertyReference#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.types.types.TypesPackage#getPropertyReference()
 * @model
 * @generated
 */
public interface PropertyReference extends Literal
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Property)
   * @see org.spp.cocome.types.types.TypesPackage#getPropertyReference_Reference()
   * @model
   * @generated
   */
  Property getReference();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.PropertyReference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Property value);

} // PropertyReference
