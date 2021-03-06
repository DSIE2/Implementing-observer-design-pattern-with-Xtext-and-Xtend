/**
 * generated by Xtext 2.12.0
 */
package org.upct.patterns.observer.observer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subjects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.upct.patterns.observer.observer.Subjects#getSubjects <em>Subjects</em>}</li>
 * </ul>
 *
 * @see org.upct.patterns.observer.observer.ObserverPackage#getSubjects()
 * @model
 * @generated
 */
public interface Subjects extends Type
{
  /**
   * Returns the value of the '<em><b>Subjects</b></em>' containment reference list.
   * The list contents are of type {@link org.upct.patterns.observer.observer.Subject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subjects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subjects</em>' containment reference list.
   * @see org.upct.patterns.observer.observer.ObserverPackage#getSubjects_Subjects()
   * @model containment="true"
   * @generated
   */
  EList<Subject> getSubjects();

} // Subjects
