/**
 */
package org.xtext.example.mydsl.insurance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.insurance.Product#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.Product#getAvgDamages <em>Avg Damages</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.Product#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.Product#getEarnings <em>Earnings</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.Product#getCost <em>Cost</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.Product#getSelling <em>Selling</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.Product#getConnected <em>Connected</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.insurance.InsurancePackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.insurance.InsurancePackage#getProduct_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.insurance.Product#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.example.mydsl.insurance.InsurancePackage#getProduct_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.insurance.Product#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Avg Damages</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Avg Damages</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Avg Damages</em>' attribute.
   * @see #setAvgDamages(int)
   * @see org.xtext.example.mydsl.insurance.InsurancePackage#getProduct_AvgDamages()
   * @model
   * @generated
   */
  int getAvgDamages();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.insurance.Product#getAvgDamages <em>Avg Damages</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Avg Damages</em>' attribute.
   * @see #getAvgDamages()
   * @generated
   */
  void setAvgDamages(int value);

  /**
   * Returns the value of the '<em><b>Occurrences</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Occurrences</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Occurrences</em>' attribute.
   * @see #setOccurrences(int)
   * @see org.xtext.example.mydsl.insurance.InsurancePackage#getProduct_Occurrences()
   * @model
   * @generated
   */
  int getOccurrences();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.insurance.Product#getOccurrences <em>Occurrences</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Occurrences</em>' attribute.
   * @see #getOccurrences()
   * @generated
   */
  void setOccurrences(int value);

  /**
   * Returns the value of the '<em><b>Earnings</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Earnings</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Earnings</em>' attribute.
   * @see #setEarnings(int)
   * @see org.xtext.example.mydsl.insurance.InsurancePackage#getProduct_Earnings()
   * @model
   * @generated
   */
  int getEarnings();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.insurance.Product#getEarnings <em>Earnings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Earnings</em>' attribute.
   * @see #getEarnings()
   * @generated
   */
  void setEarnings(int value);

  /**
   * Returns the value of the '<em><b>Cost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cost</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cost</em>' attribute.
   * @see #setCost(int)
   * @see org.xtext.example.mydsl.insurance.InsurancePackage#getProduct_Cost()
   * @model
   * @generated
   */
  int getCost();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.insurance.Product#getCost <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cost</em>' attribute.
   * @see #getCost()
   * @generated
   */
  void setCost(int value);

  /**
   * Returns the value of the '<em><b>Selling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selling</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selling</em>' attribute.
   * @see #setSelling(String)
   * @see org.xtext.example.mydsl.insurance.InsurancePackage#getProduct_Selling()
   * @model
   * @generated
   */
  String getSelling();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.insurance.Product#getSelling <em>Selling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selling</em>' attribute.
   * @see #getSelling()
   * @generated
   */
  void setSelling(String value);

  /**
   * Returns the value of the '<em><b>Connected</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.insurance.Product}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connected</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connected</em>' reference list.
   * @see org.xtext.example.mydsl.insurance.InsurancePackage#getProduct_Connected()
   * @model
   * @generated
   */
  EList<Product> getConnected();

} // Product
