/**
 * <copyright>
 * </copyright>
 *
 */
package de.goldschmiede.mapdsl.mapDsl;

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
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link de.goldschmiede.mapdsl.mapDsl.Model#getMaps <em>Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.goldschmiede.mapdsl.mapDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Maps</b></em>' containment reference list.
   * The list contents are of type {@link de.goldschmiede.mapdsl.mapDsl.Mapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maps</em>' containment reference list.
   * @see de.goldschmiede.mapdsl.mapDsl.MapDslPackage#getModel_Maps()
   * @model containment="true"
   * @generated
   */
  EList<Mapping> getMaps();

} // Model
