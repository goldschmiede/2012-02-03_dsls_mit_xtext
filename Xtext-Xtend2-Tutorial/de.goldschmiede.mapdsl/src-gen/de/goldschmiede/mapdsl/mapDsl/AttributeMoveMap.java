/**
 * <copyright>
 * </copyright>
 *
 */
package de.goldschmiede.mapdsl.mapDsl;

import de.goldschmiede.bodsl.businessObjectDsl.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Move Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap#getSourceAttribute <em>Source Attribute</em>}</li>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getAttributeMoveMap()
 * @model
 * @generated
 */
public interface AttributeMoveMap extends AttributeMap
{
  /**
   * Returns the value of the '<em><b>Source Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Attribute</em>' reference.
   * @see #setSourceAttribute(Attribute)
   * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getAttributeMoveMap_SourceAttribute()
   * @model
   * @generated
   */
  Attribute getSourceAttribute();

  /**
   * Sets the value of the '{@link de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap#getSourceAttribute <em>Source Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Attribute</em>' reference.
   * @see #getSourceAttribute()
   * @generated
   */
  void setSourceAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Target Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Attribute</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Attribute</em>' reference.
   * @see #setTargetAttribute(Attribute)
   * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getAttributeMoveMap_TargetAttribute()
   * @model
   * @generated
   */
  Attribute getTargetAttribute();

  /**
   * Sets the value of the '{@link de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap#getTargetAttribute <em>Target Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Attribute</em>' reference.
   * @see #getTargetAttribute()
   * @generated
   */
  void setTargetAttribute(Attribute value);

} // AttributeMoveMap
