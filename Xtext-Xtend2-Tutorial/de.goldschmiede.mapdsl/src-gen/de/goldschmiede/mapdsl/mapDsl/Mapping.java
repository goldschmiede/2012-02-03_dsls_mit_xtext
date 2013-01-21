/**
 * <copyright>
 * </copyright>
 *
 */
package de.goldschmiede.mapdsl.mapDsl;

import de.goldschmiede.bodsl.businessObjectDsl.BusinessObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.Mapping#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.Mapping#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.Mapping#getAttributeMap <em>Attribute Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Source Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Type</em>' reference.
   * @see #setSourceType(BusinessObject)
   * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getMapping_SourceType()
   * @model
   * @generated
   */
  BusinessObject getSourceType();

  /**
   * Sets the value of the '{@link de.goldschmiede.mapdsl.mapDsl.Mapping#getSourceType <em>Source Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Type</em>' reference.
   * @see #getSourceType()
   * @generated
   */
  void setSourceType(BusinessObject value);

  /**
   * Returns the value of the '<em><b>Target Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Type</em>' reference.
   * @see #setTargetType(BusinessObject)
   * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getMapping_TargetType()
   * @model
   * @generated
   */
  BusinessObject getTargetType();

  /**
   * Sets the value of the '{@link de.goldschmiede.mapdsl.mapDsl.Mapping#getTargetType <em>Target Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Type</em>' reference.
   * @see #getTargetType()
   * @generated
   */
  void setTargetType(BusinessObject value);

  /**
   * Returns the value of the '<em><b>Attribute Map</b></em>' containment reference list.
   * The list contents are of type {@link de.goldschmiede.mapdsl.mapDsl.AttributeMap}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Map</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Map</em>' containment reference list.
   * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getMapping_AttributeMap()
   * @model containment="true"
   * @generated
   */
  EList<AttributeMap> getAttributeMap();

} // Mapping
