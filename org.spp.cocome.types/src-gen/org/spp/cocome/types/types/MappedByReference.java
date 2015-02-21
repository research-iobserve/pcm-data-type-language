/**
 */
package org.spp.cocome.types.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped By Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.MappedByReference#getBase <em>Base</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.MappedByReference#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spp.cocome.types.types.TypesPackage#getMappedByReference()
 * @model
 * @generated
 */
public interface MappedByReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' reference.
   * @see #setBase(Property)
   * @see org.spp.cocome.types.types.TypesPackage#getMappedByReference_Base()
   * @model
   * @generated
   */
  Property getBase();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.MappedByReference#getBase <em>Base</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' reference.
   * @see #getBase()
   * @generated
   */
  void setBase(Property value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(MappedByReference)
   * @see org.spp.cocome.types.types.TypesPackage#getMappedByReference_Path()
   * @model containment="true"
   * @generated
   */
  MappedByReference getPath();

  /**
   * Sets the value of the '{@link org.spp.cocome.types.types.MappedByReference#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(MappedByReference value);

} // MappedByReference
