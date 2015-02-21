/**
 */
package org.spp.cocome.types.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spp.cocome.types.types.EntityRelationship;
import org.spp.cocome.types.types.EntityRelationshipKind;
import org.spp.cocome.types.types.MappedByReference;
import org.spp.cocome.types.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.impl.EntityRelationshipImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.impl.EntityRelationshipImpl#getMappedBy <em>Mapped By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityRelationshipImpl extends MinimalEObjectImpl.Container implements EntityRelationship
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final EntityRelationshipKind KIND_EDEFAULT = EntityRelationshipKind.UNIQUE;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected EntityRelationshipKind kind = KIND_EDEFAULT;

  /**
   * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMappedBy()
   * @generated
   * @ordered
   */
  protected MappedByReference mappedBy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityRelationshipImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TypesPackage.Literals.ENTITY_RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityRelationshipKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(EntityRelationshipKind newKind)
  {
    EntityRelationshipKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENTITY_RELATIONSHIP__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappedByReference getMappedBy()
  {
    return mappedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMappedBy(MappedByReference newMappedBy, NotificationChain msgs)
  {
    MappedByReference oldMappedBy = mappedBy;
    mappedBy = newMappedBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.ENTITY_RELATIONSHIP__MAPPED_BY, oldMappedBy, newMappedBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMappedBy(MappedByReference newMappedBy)
  {
    if (newMappedBy != mappedBy)
    {
      NotificationChain msgs = null;
      if (mappedBy != null)
        msgs = ((InternalEObject)mappedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENTITY_RELATIONSHIP__MAPPED_BY, null, msgs);
      if (newMappedBy != null)
        msgs = ((InternalEObject)newMappedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.ENTITY_RELATIONSHIP__MAPPED_BY, null, msgs);
      msgs = basicSetMappedBy(newMappedBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENTITY_RELATIONSHIP__MAPPED_BY, newMappedBy, newMappedBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TypesPackage.ENTITY_RELATIONSHIP__MAPPED_BY:
        return basicSetMappedBy(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TypesPackage.ENTITY_RELATIONSHIP__KIND:
        return getKind();
      case TypesPackage.ENTITY_RELATIONSHIP__MAPPED_BY:
        return getMappedBy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TypesPackage.ENTITY_RELATIONSHIP__KIND:
        setKind((EntityRelationshipKind)newValue);
        return;
      case TypesPackage.ENTITY_RELATIONSHIP__MAPPED_BY:
        setMappedBy((MappedByReference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TypesPackage.ENTITY_RELATIONSHIP__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case TypesPackage.ENTITY_RELATIONSHIP__MAPPED_BY:
        setMappedBy((MappedByReference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TypesPackage.ENTITY_RELATIONSHIP__KIND:
        return kind != KIND_EDEFAULT;
      case TypesPackage.ENTITY_RELATIONSHIP__MAPPED_BY:
        return mappedBy != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (kind: ");
    result.append(kind);
    result.append(')');
    return result.toString();
  }

} //EntityRelationshipImpl
