/**
 */
package org.spp.cocome.types.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.Property#getStorageModifier <em>Storage Modifier</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.Property#getType <em>Type</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.Property#getName <em>Name</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.Property#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.Property#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.Property#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.Property#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.types.types.TypesPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Storage Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link org.spp.cocome.types.types.PropertyStorageModifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Storage Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage Modifier</em>' attribute.
   * @see org.spp.cocome.types.types.PropertyStorageModifier
   * @see #setStorageModifier(PropertyStorageModifier)
   * @see org.spp.cocome.types.types.TypesPackage#getProperty_StorageModifier()
   * @model
   * @generated
   */
  PropertyStorageModifier getStorageModifier();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.Property#getStorageModifier <em>Storage Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Storage Modifier</em>' attribute.
   * @see org.spp.cocome.types.types.PropertyStorageModifier
   * @see #getStorageModifier()
   * @generated
   */
  void setStorageModifier(PropertyStorageModifier value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DeclarationTypeReference)
   * @see org.spp.cocome.types.types.TypesPackage#getProperty_Type()
   * @model containment="true"
   * @generated
   */
  DeclarationTypeReference getType();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.Property#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DeclarationTypeReference value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.spp.cocome.types.types.TypesPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationship</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship</em>' containment reference.
   * @see #setRelationship(EntityRelationship)
   * @see org.spp.cocome.types.types.TypesPackage#getProperty_Relationship()
   * @model containment="true"
   * @generated
   */
  EntityRelationship getRelationship();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.Property#getRelationship <em>Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship</em>' containment reference.
   * @see #getRelationship()
   * @generated
   */
  void setRelationship(EntityRelationship value);

  /**
   * Returns the value of the '<em><b>Order By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order By</em>' containment reference.
   * @see #setOrderBy(PropertyReference)
   * @see org.spp.cocome.types.types.TypesPackage#getProperty_OrderBy()
   * @model containment="true"
   * @generated
   */
  PropertyReference getOrderBy();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.Property#getOrderBy <em>Order By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order By</em>' containment reference.
   * @see #getOrderBy()
   * @generated
   */
  void setOrderBy(PropertyReference value);

  /**
   * Returns the value of the '<em><b>Map Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Key</em>' containment reference.
   * @see #setMapKey(PropertyReference)
   * @see org.spp.cocome.types.types.TypesPackage#getProperty_MapKey()
   * @model containment="true"
   * @generated
   */
  PropertyReference getMapKey();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.Property#getMapKey <em>Map Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Key</em>' containment reference.
   * @see #getMapKey()
   * @generated
   */
  void setMapKey(PropertyReference value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(Literal)
   * @see org.spp.cocome.types.types.TypesPackage#getProperty_Literal()
   * @model containment="true"
   * @generated
   */
  Literal getLiteral();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.Property#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(Literal value);

} // Property
