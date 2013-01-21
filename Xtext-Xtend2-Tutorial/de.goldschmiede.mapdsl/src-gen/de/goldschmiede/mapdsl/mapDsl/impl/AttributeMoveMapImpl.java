/**
 * <copyright>
 * </copyright>
 *
 */
package de.goldschmiede.mapdsl.mapDsl.impl;

import de.goldschmiede.bodsl.businessObjectDsl.Attribute;

import de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap;
import de.goldschmiede.mapdsl.mapDsl.MapDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Move Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.impl.AttributeMoveMapImpl#getSourceAttribute <em>Source Attribute</em>}</li>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.impl.AttributeMoveMapImpl#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeMoveMapImpl extends AttributeMapImpl implements AttributeMoveMap
{
  /**
   * The cached value of the '{@link #getSourceAttribute() <em>Source Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceAttribute()
   * @generated
   * @ordered
   */
  protected Attribute sourceAttribute;

  /**
   * The cached value of the '{@link #getTargetAttribute() <em>Target Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetAttribute()
   * @generated
   * @ordered
   */
  protected Attribute targetAttribute;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeMoveMapImpl()
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
    return MapDslPackage.Literals.ATTRIBUTE_MOVE_MAP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getSourceAttribute()
  {
    if (sourceAttribute != null && sourceAttribute.eIsProxy())
    {
      InternalEObject oldSourceAttribute = (InternalEObject)sourceAttribute;
      sourceAttribute = (Attribute)eResolveProxy(oldSourceAttribute);
      if (sourceAttribute != oldSourceAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE, oldSourceAttribute, sourceAttribute));
      }
    }
    return sourceAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetSourceAttribute()
  {
    return sourceAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceAttribute(Attribute newSourceAttribute)
  {
    Attribute oldSourceAttribute = sourceAttribute;
    sourceAttribute = newSourceAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE, oldSourceAttribute, sourceAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getTargetAttribute()
  {
    if (targetAttribute != null && targetAttribute.eIsProxy())
    {
      InternalEObject oldTargetAttribute = (InternalEObject)targetAttribute;
      targetAttribute = (Attribute)eResolveProxy(oldTargetAttribute);
      if (targetAttribute != oldTargetAttribute)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapDslPackage.ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
      }
    }
    return targetAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetTargetAttribute()
  {
    return targetAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetAttribute(Attribute newTargetAttribute)
  {
    Attribute oldTargetAttribute = targetAttribute;
    targetAttribute = newTargetAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MapDslPackage.ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
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
      case MapDslPackage.ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE:
        if (resolve) return getSourceAttribute();
        return basicGetSourceAttribute();
      case MapDslPackage.ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE:
        if (resolve) return getTargetAttribute();
        return basicGetTargetAttribute();
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
      case MapDslPackage.ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE:
        setSourceAttribute((Attribute)newValue);
        return;
      case MapDslPackage.ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE:
        setTargetAttribute((Attribute)newValue);
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
      case MapDslPackage.ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE:
        setSourceAttribute((Attribute)null);
        return;
      case MapDslPackage.ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE:
        setTargetAttribute((Attribute)null);
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
      case MapDslPackage.ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE:
        return sourceAttribute != null;
      case MapDslPackage.ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE:
        return targetAttribute != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributeMoveMapImpl
