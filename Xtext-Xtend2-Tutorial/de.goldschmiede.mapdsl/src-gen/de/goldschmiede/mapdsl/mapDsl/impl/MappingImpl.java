/**
 * <copyright>
 * </copyright>
 *
 */
package de.goldschmiede.mapdsl.mapDsl.impl;

import de.goldschmiede.bodsl.businessObjectDsl.BusinessObject;

import de.goldschmiede.mapdsl.mapDsl.AttributeMap;
import de.goldschmiede.mapdsl.mapDsl.MapDslPackage;
import de.goldschmiede.mapdsl.mapDsl.Mapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.impl.MappingImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.impl.MappingImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.impl.MappingImpl#getAttributeMap <em>Attribute Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping
{
  /**
   * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceType()
   * @generated
   * @ordered
   */
  protected BusinessObject sourceType;

  /**
   * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetType()
   * @generated
   * @ordered
   */
  protected BusinessObject targetType;

  /**
   * The cached value of the '{@link #getAttributeMap() <em>Attribute Map</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeMap()
   * @generated
   * @ordered
   */
  protected EList<AttributeMap> attributeMap;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return MapDslPackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObject getSourceType()
  {
    if (sourceType != null && sourceType.eIsProxy())
    {
      InternalEObject oldSourceType = (InternalEObject)sourceType;
      sourceType = (BusinessObject)eResolveProxy(oldSourceType);
      if (sourceType != oldSourceType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.MAPPING__SOURCE_TYPE, oldSourceType, sourceType));
      }
    }
    return sourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObject basicGetSourceType()
  {
    return sourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceType(BusinessObject newSourceType)
  {
    BusinessObject oldSourceType = sourceType;
    sourceType = newSourceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.MAPPING__SOURCE_TYPE, oldSourceType, sourceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObject getTargetType()
  {
    if (targetType != null && targetType.eIsProxy())
    {
      InternalEObject oldTargetType = (InternalEObject)targetType;
      targetType = (BusinessObject)eResolveProxy(oldTargetType);
      if (targetType != oldTargetType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.MAPPING__TARGET_TYPE, oldTargetType, targetType));
      }
    }
    return targetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObject basicGetTargetType()
  {
    return targetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetType(BusinessObject newTargetType)
  {
    BusinessObject oldTargetType = targetType;
    targetType = newTargetType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.MAPPING__TARGET_TYPE, oldTargetType, targetType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeMap> getAttributeMap()
  {
    if (attributeMap == null)
    {
      attributeMap = new EObjectContainmentEList<AttributeMap>(AttributeMap.class, this, MapDslPackage.MAPPING__ATTRIBUTE_MAP);
    }
    return attributeMap;
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
      case MapDslPackage.MAPPING__ATTRIBUTE_MAP:
        return ((InternalEList<?>)getAttributeMap()).basicRemove(otherEnd, msgs);
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
      case MapDslPackage.MAPPING__SOURCE_TYPE:
        if (resolve) return getSourceType();
        return basicGetSourceType();
      case MapDslPackage.MAPPING__TARGET_TYPE:
        if (resolve) return getTargetType();
        return basicGetTargetType();
      case MapDslPackage.MAPPING__ATTRIBUTE_MAP:
        return getAttributeMap();
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
      case MapDslPackage.MAPPING__SOURCE_TYPE:
        setSourceType((BusinessObject)newValue);
        return;
      case MapDslPackage.MAPPING__TARGET_TYPE:
        setTargetType((BusinessObject)newValue);
        return;
      case MapDslPackage.MAPPING__ATTRIBUTE_MAP:
        getAttributeMap().clear();
        getAttributeMap().addAll((Collection<? extends AttributeMap>)newValue);
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
      case MapDslPackage.MAPPING__SOURCE_TYPE:
        setSourceType((BusinessObject)null);
        return;
      case MapDslPackage.MAPPING__TARGET_TYPE:
        setTargetType((BusinessObject)null);
        return;
      case MapDslPackage.MAPPING__ATTRIBUTE_MAP:
        getAttributeMap().clear();
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
      case MapDslPackage.MAPPING__SOURCE_TYPE:
        return sourceType != null;
      case MapDslPackage.MAPPING__TARGET_TYPE:
        return targetType != null;
      case MapDslPackage.MAPPING__ATTRIBUTE_MAP:
        return attributeMap != null && !attributeMap.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MappingImpl
