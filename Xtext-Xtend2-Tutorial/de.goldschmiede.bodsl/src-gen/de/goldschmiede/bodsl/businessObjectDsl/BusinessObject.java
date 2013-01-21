/**
 * <copyright>
 * </copyright>
 *
 */
package de.goldschmiede.bodsl.businessObjectDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.goldschmiede.bodsl.businessObjectDsl.BusinessObject#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.goldschmiede.bodsl.businessObjectDsl.BusinessObjectDslPackage#getBusinessObject()
 * @model
 * @generated
 */
public interface BusinessObject extends Type
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.goldschmiede.bodsl.businessObjectDsl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.goldschmiede.bodsl.businessObjectDsl.BusinessObjectDslPackage#getBusinessObject_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // BusinessObject
