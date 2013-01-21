/**
 * <copyright>
 * </copyright>
 *
 */
package de.goldschmiede.bodsl.businessObjectDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.goldschmiede.bodsl.businessObjectDsl.Model#getTypes <em>Types</em>}</li>
 *   <li>{@link de.goldschmiede.bodsl.businessObjectDsl.Model#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.goldschmiede.bodsl.businessObjectDsl.BusinessObjectDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link de.goldschmiede.bodsl.businessObjectDsl.SimpleType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see de.goldschmiede.bodsl.businessObjectDsl.BusinessObjectDslPackage#getModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<SimpleType> getTypes();

  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(de.goldschmiede.bodsl.businessObjectDsl.Package)
   * @see de.goldschmiede.bodsl.businessObjectDsl.BusinessObjectDslPackage#getModel_Package()
   * @model containment="true"
   * @generated
   */
  de.goldschmiede.bodsl.businessObjectDsl.Package getPackage();

  /**
   * Sets the value of the '{@link de.goldschmiede.bodsl.businessObjectDsl.Model#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(de.goldschmiede.bodsl.businessObjectDsl.Package value);

} // Model
