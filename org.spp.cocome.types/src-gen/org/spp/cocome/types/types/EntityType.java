/**
 */
package org.spp.cocome.types.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.EntityType#getStorageModifier <em>Storage Modifier</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.EntityType#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.types.types.TypesPackage#getEntityType()
 * @model
 * @generated
 */
public interface EntityType extends ComplexType
{
  /**
   * Returns the value of the '<em><b>Storage Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link org.spp.cocome.types.types.TypeStorageModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storage Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage Modifier</em>' attribute.
   * @see org.spp.cocome.types.types.TypeStorageModifier
   * @see #setStorageModifier(TypeStorageModifier)
   * @see org.spp.cocome.types.types.TypesPackage#getEntityType_StorageModifier()
   * @model
   * @generated
   */
  TypeStorageModifier getStorageModifier();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.EntityType#getStorageModifier <em>Storage Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Storage Modifier</em>' attribute.
   * @see org.spp.cocome.types.types.TypeStorageModifier
   * @see #getStorageModifier()
   * @generated
   */
  void setStorageModifier(TypeStorageModifier value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.spp.cocome.types.types.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.spp.cocome.types.types.TypesPackage#getEntityType_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // EntityType
