/**
 */
package org.spp.cocome.types.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.spp.cocome.types.types.DeclarationTypeReference;
import org.spp.cocome.types.types.EntityRelationship;
import org.spp.cocome.types.types.Literal;
import org.spp.cocome.types.types.Property;
import org.spp.cocome.types.types.PropertyReference;
import org.spp.cocome.types.types.PropertyStorageModifier;
import org.spp.cocome.types.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spp.cocome.types.types.impl.PropertyImpl#getStorageModifier <em>Storage Modifier</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.impl.PropertyImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.impl.PropertyImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.impl.PropertyImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.spp.cocome.types.types.impl.PropertyImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
{
  /**
   * The default value of the '{@link #getStorageModifier() <em>Storage Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageModifier()
   * @generated
   * @ordered
   */
  protected static final PropertyStorageModifier STORAGE_MODIFIER_EDEFAULT = PropertyStorageModifier.VARIABLE;

  /**
   * The cached value of the '{@link #getStorageModifier() <em>Storage Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStorageModifier()
   * @generated
   * @ordered
   */
  protected PropertyStorageModifier storageModifier = STORAGE_MODIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DeclarationTypeReference type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationship()
   * @generated
   * @ordered
   */
  protected EntityRelationship relationship;

  /**
   * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrderBy()
   * @generated
   * @ordered
   */
  protected PropertyReference orderBy;

  /**
   * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapKey()
   * @generated
   * @ordered
   */
  protected PropertyReference mapKey;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected Literal literal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return TypesPackage.Literals.PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyStorageModifier getStorageModifier()
  {
    return storageModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStorageModifier(PropertyStorageModifier newStorageModifier)
  {
    PropertyStorageModifier oldStorageModifier = storageModifier;
    storageModifier = newStorageModifier == null ? STORAGE_MODIFIER_EDEFAULT : newStorageModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__STORAGE_MODIFIER, oldStorageModifier, storageModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(DeclarationTypeReference newType, NotificationChain msgs)
  {
    DeclarationTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DeclarationTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityRelationship getRelationship()
  {
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationship(EntityRelationship newRelationship, NotificationChain msgs)
  {
    EntityRelationship oldRelationship = relationship;
    relationship = newRelationship;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__RELATIONSHIP, oldRelationship, newRelationship);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationship(EntityRelationship newRelationship)
  {
    if (newRelationship != relationship)
    {
      NotificationChain msgs = null;
      if (relationship != null)
        msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__RELATIONSHIP, null, msgs);
      if (newRelationship != null)
        msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__RELATIONSHIP, null, msgs);
      msgs = basicSetRelationship(newRelationship, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__RELATIONSHIP, newRelationship, newRelationship));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyReference getOrderBy()
  {
    return orderBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrderBy(PropertyReference newOrderBy, NotificationChain msgs)
  {
    PropertyReference oldOrderBy = orderBy;
    orderBy = newOrderBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__ORDER_BY, oldOrderBy, newOrderBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrderBy(PropertyReference newOrderBy)
  {
    if (newOrderBy != orderBy)
    {
      NotificationChain msgs = null;
      if (orderBy != null)
        msgs = ((InternalEObject)orderBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__ORDER_BY, null, msgs);
      if (newOrderBy != null)
        msgs = ((InternalEObject)newOrderBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__ORDER_BY, null, msgs);
      msgs = basicSetOrderBy(newOrderBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__ORDER_BY, newOrderBy, newOrderBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyReference getMapKey()
  {
    return mapKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapKey(PropertyReference newMapKey, NotificationChain msgs)
  {
    PropertyReference oldMapKey = mapKey;
    mapKey = newMapKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__MAP_KEY, oldMapKey, newMapKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapKey(PropertyReference newMapKey)
  {
    if (newMapKey != mapKey)
    {
      NotificationChain msgs = null;
      if (mapKey != null)
        msgs = ((InternalEObject)mapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__MAP_KEY, null, msgs);
      if (newMapKey != null)
        msgs = ((InternalEObject)newMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__MAP_KEY, null, msgs);
      msgs = basicSetMapKey(newMapKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__MAP_KEY, newMapKey, newMapKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteral(Literal newLiteral, NotificationChain msgs)
  {
    Literal oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__LITERAL, oldLiteral, newLiteral);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(Literal newLiteral)
  {
    if (newLiteral != literal)
    {
      NotificationChain msgs = null;
      if (literal != null)
        msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__LITERAL, null, msgs);
      if (newLiteral != null)
        msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.PROPERTY__LITERAL, null, msgs);
      msgs = basicSetLiteral(newLiteral, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.PROPERTY__LITERAL, newLiteral, newLiteral));
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
      case TypesPackage.PROPERTY__TYPE:
        return basicSetType(null, msgs);
      case TypesPackage.PROPERTY__RELATIONSHIP:
        return basicSetRelationship(null, msgs);
      case TypesPackage.PROPERTY__ORDER_BY:
        return basicSetOrderBy(null, msgs);
      case TypesPackage.PROPERTY__MAP_KEY:
        return basicSetMapKey(null, msgs);
      case TypesPackage.PROPERTY__LITERAL:
        return basicSetLiteral(null, msgs);
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
      case TypesPackage.PROPERTY__STORAGE_MODIFIER:
        return getStorageModifier();
      case TypesPackage.PROPERTY__TYPE:
        return getType();
      case TypesPackage.PROPERTY__NAME:
        return getName();
      case TypesPackage.PROPERTY__RELATIONSHIP:
        return getRelationship();
      case TypesPackage.PROPERTY__ORDER_BY:
        return getOrderBy();
      case TypesPackage.PROPERTY__MAP_KEY:
        return getMapKey();
      case TypesPackage.PROPERTY__LITERAL:
        return getLiteral();
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
      case TypesPackage.PROPERTY__STORAGE_MODIFIER:
        setStorageModifier((PropertyStorageModifier)newValue);
        return;
      case TypesPackage.PROPERTY__TYPE:
        setType((DeclarationTypeReference)newValue);
        return;
      case TypesPackage.PROPERTY__NAME:
        setName((String)newValue);
        return;
      case TypesPackage.PROPERTY__RELATIONSHIP:
        setRelationship((EntityRelationship)newValue);
        return;
      case TypesPackage.PROPERTY__ORDER_BY:
        setOrderBy((PropertyReference)newValue);
        return;
      case TypesPackage.PROPERTY__MAP_KEY:
        setMapKey((PropertyReference)newValue);
        return;
      case TypesPackage.PROPERTY__LITERAL:
        setLiteral((Literal)newValue);
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
      case TypesPackage.PROPERTY__STORAGE_MODIFIER:
        setStorageModifier(STORAGE_MODIFIER_EDEFAULT);
        return;
      case TypesPackage.PROPERTY__TYPE:
        setType((DeclarationTypeReference)null);
        return;
      case TypesPackage.PROPERTY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TypesPackage.PROPERTY__RELATIONSHIP:
        setRelationship((EntityRelationship)null);
        return;
      case TypesPackage.PROPERTY__ORDER_BY:
        setOrderBy((PropertyReference)null);
        return;
      case TypesPackage.PROPERTY__MAP_KEY:
        setMapKey((PropertyReference)null);
        return;
      case TypesPackage.PROPERTY__LITERAL:
        setLiteral((Literal)null);
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
      case TypesPackage.PROPERTY__STORAGE_MODIFIER:
        return storageModifier != STORAGE_MODIFIER_EDEFAULT;
      case TypesPackage.PROPERTY__TYPE:
        return type != null;
      case TypesPackage.PROPERTY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TypesPackage.PROPERTY__RELATIONSHIP:
        return relationship != null;
      case TypesPackage.PROPERTY__ORDER_BY:
        return orderBy != null;
      case TypesPackage.PROPERTY__MAP_KEY:
        return mapKey != null;
      case TypesPackage.PROPERTY__LITERAL:
        return literal != null;
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PropertyImpl
