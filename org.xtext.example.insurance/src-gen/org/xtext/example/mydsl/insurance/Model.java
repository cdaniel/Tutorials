/**
 */
package org.xtext.example.mydsl.insurance;

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
 *   <li>{@link org.xtext.example.mydsl.insurance.Model#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.insurance.InsurancePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Products</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.insurance.Product}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Products</em>' containment reference list.
   * @see org.xtext.example.mydsl.insurance.InsurancePackage#getModel_Products()
   * @model containment="true"
   * @generated
   */
  EList<Product> getProducts();

} // Model
