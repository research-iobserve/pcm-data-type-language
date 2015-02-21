/**
 */
package org.spp.cocome.types.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.EntityRelationship#getKind <em>Kind</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.EntityRelationship#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.types.types.TypesPackage#getEntityRelationship()
 * @model
 * @generated
 */
public interface EntityRelationship extends EObject
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.spp.cocome.types.types.EntityRelationshipKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.spp.cocome.types.types.EntityRelationshipKind
   * @see #setKind(EntityRelationshipKind)
   * @see org.spp.cocome.types.types.TypesPackage#getEntityRelationship_Kind()
   * @model
   * @generated
   */
  EntityRelationshipKind getKind();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.EntityRelationship#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.spp.cocome.types.types.EntityRelationshipKind
   * @see #getKind()
   * @generated
   */
  void setKind(EntityRelationshipKind value);

  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped By</em>' containment reference.
   * @see #setMappedBy(MappedByReference)
   * @see org.spp.cocome.types.types.TypesPackage#getEntityRelationship_MappedBy()
   * @model containment="true"
   * @generated
   */
  MappedByReference getMappedBy();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.EntityRelationship#getMappedBy <em>Mapped By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped By</em>' containment reference.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(MappedByReference value);

} // EntityRelationship
