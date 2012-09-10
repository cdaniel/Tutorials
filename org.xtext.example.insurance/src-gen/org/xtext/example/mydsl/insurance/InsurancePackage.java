/**
 */
package org.xtext.example.mydsl.insurance;

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
 * @see org.xtext.example.mydsl.insurance.InsuranceFactory
 * @model kind="package"
 * @generated
 */
public interface InsurancePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "insurance";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/Insurance";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "insurance";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  InsurancePackage eINSTANCE = org.xtext.example.mydsl.insurance.impl.InsurancePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.insurance.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.insurance.impl.ModelImpl
   * @see org.xtext.example.mydsl.insurance.impl.InsurancePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Products</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PRODUCTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.insurance.impl.ProductImpl <em>Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.insurance.impl.ProductImpl
   * @see org.xtext.example.mydsl.insurance.impl.InsurancePackageImpl#getProduct()
   * @generated
   */
  int PRODUCT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Avg Damages</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__AVG_DAMAGES = 2;

  /**
   * The feature id for the '<em><b>Occurrences</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__OCCURRENCES = 3;

  /**
   * The feature id for the '<em><b>Earnings</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__EARNINGS = 4;

  /**
   * The feature id for the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__COST = 5;

  /**
   * The feature id for the '<em><b>Selling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__SELLING = 6;

  /**
   * The feature id for the '<em><b>Connected</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__CONNECTED = 7;

  /**
   * The number of structural features of the '<em>Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_FEATURE_COUNT = 8;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.insurance.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.insurance.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.insurance.Model#getProducts <em>Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Products</em>'.
   * @see org.xtext.example.mydsl.insurance.Model#getProducts()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Products();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.insurance.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product</em>'.
   * @see org.xtext.example.mydsl.insurance.Product
   * @generated
   */
  EClass getProduct();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.insurance.Product#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.insurance.Product#getName()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.insurance.Product#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.example.mydsl.insurance.Product#getDescription()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.insurance.Product#getAvgDamages <em>Avg Damages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Avg Damages</em>'.
   * @see org.xtext.example.mydsl.insurance.Product#getAvgDamages()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_AvgDamages();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.insurance.Product#getOccurrences <em>Occurrences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Occurrences</em>'.
   * @see org.xtext.example.mydsl.insurance.Product#getOccurrences()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Occurrences();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.insurance.Product#getEarnings <em>Earnings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Earnings</em>'.
   * @see org.xtext.example.mydsl.insurance.Product#getEarnings()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Earnings();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.insurance.Product#getCost <em>Cost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cost</em>'.
   * @see org.xtext.example.mydsl.insurance.Product#getCost()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Cost();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.insurance.Product#getSelling <em>Selling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Selling</em>'.
   * @see org.xtext.example.mydsl.insurance.Product#getSelling()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Selling();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.insurance.Product#getConnected <em>Connected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Connected</em>'.
   * @see org.xtext.example.mydsl.insurance.Product#getConnected()
   * @see #getProduct()
   * @generated
   */
  EReference getProduct_Connected();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  InsuranceFactory getInsuranceFactory();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl.insurance.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.insurance.impl.ModelImpl
     * @see org.xtext.example.mydsl.insurance.impl.InsurancePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PRODUCTS = eINSTANCE.getModel_Products();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.insurance.impl.ProductImpl <em>Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.insurance.impl.ProductImpl
     * @see org.xtext.example.mydsl.insurance.impl.InsurancePackageImpl#getProduct()
     * @generated
     */
    EClass PRODUCT = eINSTANCE.getProduct();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

    /**
     * The meta object literal for the '<em><b>Avg Damages</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__AVG_DAMAGES = eINSTANCE.getProduct_AvgDamages();

    /**
     * The meta object literal for the '<em><b>Occurrences</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__OCCURRENCES = eINSTANCE.getProduct_Occurrences();

    /**
     * The meta object literal for the '<em><b>Earnings</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__EARNINGS = eINSTANCE.getProduct_Earnings();

    /**
     * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__COST = eINSTANCE.getProduct_Cost();

    /**
     * The meta object literal for the '<em><b>Selling</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__SELLING = eINSTANCE.getProduct_Selling();

    /**
     * The meta object literal for the '<em><b>Connected</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT__CONNECTED = eINSTANCE.getProduct_Connected();

  }

} //InsurancePackage
