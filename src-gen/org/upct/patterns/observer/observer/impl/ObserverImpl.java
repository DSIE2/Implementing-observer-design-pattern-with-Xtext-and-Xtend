/**
 * generated by Xtext 2.12.0
 */
package org.upct.patterns.observer.observer.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.upct.patterns.observer.observer.ElementType;
import org.upct.patterns.observer.observer.Observer;
import org.upct.patterns.observer.observer.ObserverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.upct.patterns.observer.observer.impl.ObserverImpl#getObserver <em>Observer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObserverImpl extends MinimalEObjectImpl.Container implements Observer
{
  /**
   * The cached value of the '{@link #getObserver() <em>Observer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObserver()
   * @generated
   * @ordered
   */
  protected ElementType observer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObserverImpl()
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
    return ObserverPackage.Literals.OBSERVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType getObserver()
  {
    return observer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObserver(ElementType newObserver, NotificationChain msgs)
  {
    ElementType oldObserver = observer;
    observer = newObserver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObserverPackage.OBSERVER__OBSERVER, oldObserver, newObserver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObserver(ElementType newObserver)
  {
    if (newObserver != observer)
    {
      NotificationChain msgs = null;
      if (observer != null)
        msgs = ((InternalEObject)observer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ObserverPackage.OBSERVER__OBSERVER, null, msgs);
      if (newObserver != null)
        msgs = ((InternalEObject)newObserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ObserverPackage.OBSERVER__OBSERVER, null, msgs);
      msgs = basicSetObserver(newObserver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ObserverPackage.OBSERVER__OBSERVER, newObserver, newObserver));
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
      case ObserverPackage.OBSERVER__OBSERVER:
        return basicSetObserver(null, msgs);
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
      case ObserverPackage.OBSERVER__OBSERVER:
        return getObserver();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ObserverPackage.OBSERVER__OBSERVER:
        setObserver((ElementType)newValue);
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
      case ObserverPackage.OBSERVER__OBSERVER:
        setObserver((ElementType)null);
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
      case ObserverPackage.OBSERVER__OBSERVER:
        return observer != null;
    }
    return super.eIsSet(featureID);
  }

} //ObserverImpl
