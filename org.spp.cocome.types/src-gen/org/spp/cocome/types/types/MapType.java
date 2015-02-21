/**
 */
package org.spp.cocome.types.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.MapType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.MapType#getMapType <em>Map Type</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.MapType#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.types.types.TypesPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends Type, DeclarationTypeReference
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(TypeReference)
   * @see org.spp.cocome.types.types.TypesPackage#getMapType_Reference()
   * @model containment="true"
   * @generated
   */
  TypeReference getReference();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.MapType#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(TypeReference value);

  /**
   * Returns the value of the '<em><b>Map Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Type</em>' containment reference.
   * @see #setMapType(TypeReference)
   * @see org.spp.cocome.types.types.TypesPackage#getMapType_MapType()
   * @model containment="true"
   * @generated
   */
  TypeReference getMapType();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.MapType#getMapType <em>Map Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Type</em>' containment reference.
   * @see #getMapType()
   * @generated
   */
  void setMapType(TypeReference value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(int)
   * @see org.spp.cocome.types.types.TypesPackage#getMapType_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.MapType#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

} // MapType
