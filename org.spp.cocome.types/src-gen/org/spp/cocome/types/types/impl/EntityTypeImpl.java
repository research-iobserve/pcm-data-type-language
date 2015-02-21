/**
 */
package org.spp.cocome.types.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spp.cocome.types.types.EntityType;
import org.spp.cocome.types.types.Property;
import org.spp.cocome.types.types.TypeStorageModifier;
import org.spp.cocome.types.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.impl.EntityTypeImpl#getStorageModifier <em>Storage Modifier</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.impl.EntityTypeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTypeImpl extends ComplexTypeImpl implements EntityType
{
  /**
   * The default value of the '{@link #getStorageModifier() <em>Storage Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageModifier()
   * @generated
   * @ordered
   */
  protected static final TypeStorageModifier STORAGE_MODIFIER_EDEFAULT = TypeStorageModifier.STORABLE;

  /**
   * The cached value of the '{@link #getStorageModifier() <em>Storage Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageModifier()
   * @generated
   * @ordered
   */
  protected TypeStorageModifier storageModifier = STORAGE_MODIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityTypeImpl()
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
    return TypesPackage.Literals.ENTITY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeStorageModifier getStorageModifier()
  {
    return storageModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorageModifier(TypeStorageModifier newStorageModifier)
  {
    TypeStorageModifier oldStorageModifier = storageModifier;
    storageModifier = newStorageModifier == null ? STORAGE_MODIFIER_EDEFAULT : newStorageModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENTITY_TYPE__STORAGE_MODIFIER, oldStorageModifier, storageModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, TypesPackage.ENTITY_TYPE__PROPERTIES);
    }
    return properties;
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
      case TypesPackage.ENTITY_TYPE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case TypesPackage.ENTITY_TYPE__STORAGE_MODIFIER:
        return getStorageModifier();
      case TypesPackage.ENTITY_TYPE__PROPERTIES:
        return getProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TypesPackage.ENTITY_TYPE__STORAGE_MODIFIER:
        setStorageModifier((TypeStorageModifier)newValue);
        return;
      case TypesPackage.ENTITY_TYPE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
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
      case TypesPackage.ENTITY_TYPE__STORAGE_MODIFIER:
        setStorageModifier(STORAGE_MODIFIER_EDEFAULT);
        return;
      case TypesPackage.ENTITY_TYPE__PROPERTIES:
        getProperties().clear();
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
      case TypesPackage.ENTITY_TYPE__STORAGE_MODIFIER:
        return storageModifier != STORAGE_MODIFIER_EDEFAULT;
      case TypesPackage.ENTITY_TYPE__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    result.append(" (storageModifier: ");
    result.append(storageModifier);
    result.append(')');
    return result.toString();
  }

} //EntityTypeImpl
