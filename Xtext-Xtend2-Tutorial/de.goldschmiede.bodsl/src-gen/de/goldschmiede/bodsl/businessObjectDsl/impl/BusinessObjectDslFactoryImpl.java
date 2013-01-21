/**
 * <copyright>
 * </copyright>
 *
 */
package de.goldschmiede.bodsl.businessObjectDsl.impl;

import de.goldschmiede.bodsl.businessObjectDsl.Attribute;
import de.goldschmiede.bodsl.businessObjectDsl.BusinessObject;
import de.goldschmiede.bodsl.businessObjectDsl.BusinessObjectDslFactory;
import de.goldschmiede.bodsl.businessObjectDsl.BusinessObjectDslPackage;
import de.goldschmiede.bodsl.businessObjectDsl.EnumLiteral;
import de.goldschmiede.bodsl.businessObjectDsl.Enumeration;
import de.goldschmiede.bodsl.businessObjectDsl.Import;
import de.goldschmiede.bodsl.businessObjectDsl.Model;
import de.goldschmiede.bodsl.businessObjectDsl.SimpleType;
import de.goldschmiede.bodsl.businessObjectDsl.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessObjectDslFactoryImpl extends EFactoryImpl implements BusinessObjectDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BusinessObjectDslFactory init()
  {
    try
    {
      BusinessObjectDslFactory theBusinessObjectDslFactory = (BusinessObjectDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.goldschmiede.de/bodsl/BusinessObjectDsl"); 
      if (theBusinessObjectDslFactory != null)
      {
        return theBusinessObjectDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BusinessObjectDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjectDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BusinessObjectDslPackage.MODEL: return createModel();
      case BusinessObjectDslPackage.PACKAGE: return createPackage();
      case BusinessObjectDslPackage.IMPORT: return createImport();
      case BusinessObjectDslPackage.BUSINESS_OBJECT: return createBusinessObject();
      case BusinessObjectDslPackage.ENUMERATION: return createEnumeration();
      case BusinessObjectDslPackage.ENUM_LITERAL: return createEnumLiteral();
      case BusinessObjectDslPackage.ATTRIBUTE: return createAttribute();
      case BusinessObjectDslPackage.TYPE: return createType();
      case BusinessObjectDslPackage.SIMPLE_TYPE: return createSimpleType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.goldschmiede.bodsl.businessObjectDsl.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObject createBusinessObject()
  {
    BusinessObjectImpl businessObject = new BusinessObjectImpl();
    return businessObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumLiteral createEnumLiteral()
  {
    EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
    return enumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleType createSimpleType()
  {
    SimpleTypeImpl simpleType = new SimpleTypeImpl();
    return simpleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessObjectDslPackage getBusinessObjectDslPackage()
  {
    return (BusinessObjectDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BusinessObjectDslPackage getPackage()
  {
    return BusinessObjectDslPackage.eINSTANCE;
  }

} //BusinessObjectDslFactoryImpl
