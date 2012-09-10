/**
 */
package org.xtext.example.mydsl.insurance.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.insurance.InsurancePackage;
import org.xtext.example.mydsl.insurance.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.insurance.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.impl.ProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.impl.ProductImpl#getAvgDamages <em>Avg Damages</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.impl.ProductImpl#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.impl.ProductImpl#getEarnings <em>Earnings</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.impl.ProductImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.impl.ProductImpl#getSelling <em>Selling</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.insurance.impl.ProductImpl#getConnected <em>Connected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getAvgDamages() <em>Avg Damages</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvgDamages()
   * @generated
   * @ordered
   */
  protected static final int AVG_DAMAGES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAvgDamages() <em>Avg Damages</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAvgDamages()
   * @generated
   * @ordered
   */
  protected int avgDamages = AVG_DAMAGES_EDEFAULT;

  /**
   * The default value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccurrences()
   * @generated
   * @ordered
   */
  protected static final int OCCURRENCES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccurrences()
   * @generated
   * @ordered
   */
  protected int occurrences = OCCURRENCES_EDEFAULT;

  /**
   * The default value of the '{@link #getEarnings() <em>Earnings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEarnings()
   * @generated
   * @ordered
   */
  protected static final int EARNINGS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEarnings() <em>Earnings</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEarnings()
   * @generated
   * @ordered
   */
  protected int earnings = EARNINGS_EDEFAULT;

  /**
   * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected static final int COST_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCost()
   * @generated
   * @ordered
   */
  protected int cost = COST_EDEFAULT;

  /**
   * The default value of the '{@link #getSelling() <em>Selling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelling()
   * @generated
   * @ordered
   */
  protected static final String SELLING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSelling() <em>Selling</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelling()
   * @generated
   * @ordered
   */
  protected String selling = SELLING_EDEFAULT;

  /**
   * The cached value of the '{@link #getConnected() <em>Connected</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnected()
   * @generated
   * @ordered
   */
  protected EList<Product> connected;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return InsurancePackage.Literals.PRODUCT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InsurancePackage.PRODUCT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InsurancePackage.PRODUCT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAvgDamages()
  {
    return avgDamages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAvgDamages(int newAvgDamages)
  {
    int oldAvgDamages = avgDamages;
    avgDamages = newAvgDamages;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InsurancePackage.PRODUCT__AVG_DAMAGES, oldAvgDamages, avgDamages));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOccurrences()
  {
    return occurrences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOccurrences(int newOccurrences)
  {
    int oldOccurrences = occurrences;
    occurrences = newOccurrences;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InsurancePackage.PRODUCT__OCCURRENCES, oldOccurrences, occurrences));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEarnings()
  {
    return earnings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEarnings(int newEarnings)
  {
    int oldEarnings = earnings;
    earnings = newEarnings;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InsurancePackage.PRODUCT__EARNINGS, oldEarnings, earnings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCost()
  {
    return cost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCost(int newCost)
  {
    int oldCost = cost;
    cost = newCost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InsurancePackage.PRODUCT__COST, oldCost, cost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSelling()
  {
    return selling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelling(String newSelling)
  {
    String oldSelling = selling;
    selling = newSelling;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, InsurancePackage.PRODUCT__SELLING, oldSelling, selling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Product> getConnected()
  {
    if (connected == null)
    {
      connected = new EObjectResolvingEList<Product>(Product.class, this, InsurancePackage.PRODUCT__CONNECTED);
    }
    return connected;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case InsurancePackage.PRODUCT__NAME:
        return getName();
      case InsurancePackage.PRODUCT__DESCRIPTION:
        return getDescription();
      case InsurancePackage.PRODUCT__AVG_DAMAGES:
        return getAvgDamages();
      case InsurancePackage.PRODUCT__OCCURRENCES:
        return getOccurrences();
      case InsurancePackage.PRODUCT__EARNINGS:
        return getEarnings();
      case InsurancePackage.PRODUCT__COST:
        return getCost();
      case InsurancePackage.PRODUCT__SELLING:
        return getSelling();
      case InsurancePackage.PRODUCT__CONNECTED:
        return getConnected();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case InsurancePackage.PRODUCT__NAME:
        setName((String)newValue);
        return;
      case InsurancePackage.PRODUCT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case InsurancePackage.PRODUCT__AVG_DAMAGES:
        setAvgDamages((Integer)newValue);
        return;
      case InsurancePackage.PRODUCT__OCCURRENCES:
        setOccurrences((Integer)newValue);
        return;
      case InsurancePackage.PRODUCT__EARNINGS:
        setEarnings((Integer)newValue);
        return;
      case InsurancePackage.PRODUCT__COST:
        setCost((Integer)newValue);
        return;
      case InsurancePackage.PRODUCT__SELLING:
        setSelling((String)newValue);
        return;
      case InsurancePackage.PRODUCT__CONNECTED:
        getConnected().clear();
        getConnected().addAll((Collection<? extends Product>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case InsurancePackage.PRODUCT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case InsurancePackage.PRODUCT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case InsurancePackage.PRODUCT__AVG_DAMAGES:
        setAvgDamages(AVG_DAMAGES_EDEFAULT);
        return;
      case InsurancePackage.PRODUCT__OCCURRENCES:
        setOccurrences(OCCURRENCES_EDEFAULT);
        return;
      case InsurancePackage.PRODUCT__EARNINGS:
        setEarnings(EARNINGS_EDEFAULT);
        return;
      case InsurancePackage.PRODUCT__COST:
        setCost(COST_EDEFAULT);
        return;
      case InsurancePackage.PRODUCT__SELLING:
        setSelling(SELLING_EDEFAULT);
        return;
      case InsurancePackage.PRODUCT__CONNECTED:
        getConnected().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case InsurancePackage.PRODUCT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case InsurancePackage.PRODUCT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case InsurancePackage.PRODUCT__AVG_DAMAGES:
        return avgDamages != AVG_DAMAGES_EDEFAULT;
      case InsurancePackage.PRODUCT__OCCURRENCES:
        return occurrences != OCCURRENCES_EDEFAULT;
      case InsurancePackage.PRODUCT__EARNINGS:
        return earnings != EARNINGS_EDEFAULT;
      case InsurancePackage.PRODUCT__COST:
        return cost != COST_EDEFAULT;
      case InsurancePackage.PRODUCT__SELLING:
        return SELLING_EDEFAULT == null ? selling != null : !SELLING_EDEFAULT.equals(selling);
      case InsurancePackage.PRODUCT__CONNECTED:
        return connected != null && !connected.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", avgDamages: ");
    result.append(avgDamages);
    result.append(", occurrences: ");
    result.append(occurrences);
    result.append(", earnings: ");
    result.append(earnings);
    result.append(", cost: ");
    result.append(cost);
    result.append(", selling: ");
    result.append(selling);
    result.append(')');
    return result.toString();
  }

} //ProductImpl
