/**
 * generated by Xtext 2.12.0
 */
package org.upct.patterns.observer.observer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.upct.patterns.observer.observer.Observers#getObservers <em>Observers</em>}</li>
 * </ul>
 *
 * @see org.upct.patterns.observer.observer.ObserverPackage#getObservers()
 * @model
 * @generated
 */
public interface Observers extends Type
{
  /**
   * Returns the value of the '<em><b>Observers</b></em>' containment reference list.
   * The list contents are of type {@link org.upct.patterns.observer.observer.Observer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Observers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Observers</em>' containment reference list.
   * @see org.upct.patterns.observer.observer.ObserverPackage#getObservers_Observers()
   * @model containment="true"
   * @generated
   */
  EList<Observer> getObservers();

} // Observers
