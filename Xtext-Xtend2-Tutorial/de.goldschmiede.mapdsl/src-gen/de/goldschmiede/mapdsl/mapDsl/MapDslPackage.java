/**
 * <copyright>
 * </copyright>
 *
 */
package de.goldschmiede.mapdsl.mapDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.goldschmiede.mapdsl.mapDsl.MapDslFactory
 * @model kind="package"
 * @generated
 */
public interface MapDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mapDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.goldschmiede.de/mapdsl/MapDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mapDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MapDslPackage eINSTANCE = de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl.init();

  /**
   * The meta object id for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.goldschmiede.mapdsl.mapDsl.impl.ModelImpl
   * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Maps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAPS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.goldschmiede.mapdsl.mapDsl.impl.MappingImpl
   * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 1;

  /**
   * The feature id for the '<em><b>Source Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__SOURCE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Target Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__TARGET_TYPE = 1;

  /**
   * The feature id for the '<em><b>Attribute Map</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__ATTRIBUTE_MAP = 2;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.AttributeMapImpl <em>Attribute Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.goldschmiede.mapdsl.mapDsl.impl.AttributeMapImpl
   * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getAttributeMap()
   * @generated
   */
  int ATTRIBUTE_MAP = 2;

  /**
   * The number of structural features of the '<em>Attribute Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MAP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.AttributeMoveMapImpl <em>Attribute Move Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.goldschmiede.mapdsl.mapDsl.impl.AttributeMoveMapImpl
   * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getAttributeMoveMap()
   * @generated
   */
  int ATTRIBUTE_MOVE_MAP = 3;

  /**
   * The feature id for the '<em><b>Source Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE = ATTRIBUTE_MAP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE = ATTRIBUTE_MAP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute Move Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_MOVE_MAP_FEATURE_COUNT = ATTRIBUTE_MAP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.goldschmiede.mapdsl.mapDsl.impl.ImportImpl
   * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 4;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.goldschmiede.mapdsl.mapDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.goldschmiede.mapdsl.mapDsl.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.goldschmiede.mapdsl.mapDsl.Model#getMaps <em>Maps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Maps</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.Model#getMaps()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Maps();

  /**
   * Returns the meta object for class '{@link de.goldschmiede.mapdsl.mapDsl.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the reference '{@link de.goldschmiede.mapdsl.mapDsl.Mapping#getSourceType <em>Source Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Type</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.Mapping#getSourceType()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_SourceType();

  /**
   * Returns the meta object for the reference '{@link de.goldschmiede.mapdsl.mapDsl.Mapping#getTargetType <em>Target Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Type</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.Mapping#getTargetType()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_TargetType();

  /**
   * Returns the meta object for the containment reference list '{@link de.goldschmiede.mapdsl.mapDsl.Mapping#getAttributeMap <em>Attribute Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Map</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.Mapping#getAttributeMap()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_AttributeMap();

  /**
   * Returns the meta object for class '{@link de.goldschmiede.mapdsl.mapDsl.AttributeMap <em>Attribute Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Map</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.AttributeMap
   * @generated
   */
  EClass getAttributeMap();

  /**
   * Returns the meta object for class '{@link de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap <em>Attribute Move Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Move Map</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap
   * @generated
   */
  EClass getAttributeMoveMap();

  /**
   * Returns the meta object for the reference '{@link de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap#getSourceAttribute <em>Source Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source Attribute</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap#getSourceAttribute()
   * @see #getAttributeMoveMap()
   * @generated
   */
  EReference getAttributeMoveMap_SourceAttribute();

  /**
   * Returns the meta object for the reference '{@link de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap#getTargetAttribute <em>Target Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Attribute</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.AttributeMoveMap#getTargetAttribute()
   * @see #getAttributeMoveMap()
   * @generated
   */
  EReference getAttributeMoveMap_TargetAttribute();

  /**
   * Returns the meta object for class '{@link de.goldschmiede.mapdsl.mapDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.goldschmiede.mapdsl.mapDsl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see de.goldschmiede.mapdsl.mapDsl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MapDslFactory getMapDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.goldschmiede.mapdsl.mapDsl.impl.ModelImpl
     * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Maps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAPS = eINSTANCE.getModel_Maps();

    /**
     * The meta object literal for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.goldschmiede.mapdsl.mapDsl.impl.MappingImpl
     * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__SOURCE_TYPE = eINSTANCE.getMapping_SourceType();

    /**
     * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__TARGET_TYPE = eINSTANCE.getMapping_TargetType();

    /**
     * The meta object literal for the '<em><b>Attribute Map</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__ATTRIBUTE_MAP = eINSTANCE.getMapping_AttributeMap();

    /**
     * The meta object literal for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.AttributeMapImpl <em>Attribute Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.goldschmiede.mapdsl.mapDsl.impl.AttributeMapImpl
     * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getAttributeMap()
     * @generated
     */
    EClass ATTRIBUTE_MAP = eINSTANCE.getAttributeMap();

    /**
     * The meta object literal for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.AttributeMoveMapImpl <em>Attribute Move Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.goldschmiede.mapdsl.mapDsl.impl.AttributeMoveMapImpl
     * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getAttributeMoveMap()
     * @generated
     */
    EClass ATTRIBUTE_MOVE_MAP = eINSTANCE.getAttributeMoveMap();

    /**
     * The meta object literal for the '<em><b>Source Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_MOVE_MAP__SOURCE_ATTRIBUTE = eINSTANCE.getAttributeMoveMap_SourceAttribute();

    /**
     * The meta object literal for the '<em><b>Target Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_MOVE_MAP__TARGET_ATTRIBUTE = eINSTANCE.getAttributeMoveMap_TargetAttribute();

    /**
     * The meta object literal for the '{@link de.goldschmiede.mapdsl.mapDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.goldschmiede.mapdsl.mapDsl.impl.ImportImpl
     * @see de.goldschmiede.mapdsl.mapDsl.impl.MapDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

  }

} //MapDslPackage
