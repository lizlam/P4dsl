/**
 */
package org.xtext.example.p4dsl.p4Dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.p4dsl.p4Dsl.P4Command;
import org.xtext.example.p4dsl.p4Dsl.P4DslPackage;
import org.xtext.example.p4dsl.p4Dsl.PUCFlag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PUC Flag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.p4dsl.p4Dsl.impl.PUCFlagImpl#getP4command <em>P4command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PUCFlagImpl extends P4CommandImpl implements PUCFlag
{
  /**
   * The cached value of the '{@link #getP4command() <em>P4command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP4command()
   * @generated
   * @ordered
   */
  protected EList<P4Command> p4command;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PUCFlagImpl()
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
    return P4DslPackage.Literals.PUC_FLAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<P4Command> getP4command()
  {
    if (p4command == null)
    {
      p4command = new EObjectContainmentEList<P4Command>(P4Command.class, this, P4DslPackage.PUC_FLAG__P4COMMAND);
    }
    return p4command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case P4DslPackage.PUC_FLAG__P4COMMAND:
        return ((InternalEList<?>)getP4command()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case P4DslPackage.PUC_FLAG__P4COMMAND:
        return getP4command();
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
      case P4DslPackage.PUC_FLAG__P4COMMAND:
        getP4command().clear();
        getP4command().addAll((Collection<? extends P4Command>)newValue);
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
      case P4DslPackage.PUC_FLAG__P4COMMAND:
        getP4command().clear();
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
      case P4DslPackage.PUC_FLAG__P4COMMAND:
        return p4command != null && !p4command.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PUCFlagImpl
