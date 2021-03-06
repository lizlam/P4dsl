/**
 */
package org.xtext.example.p4dsl.p4Dsl;

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
 *   <li>{@link org.xtext.example.p4dsl.p4Dsl.Model#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.p4dsl.p4Dsl.P4DslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Command</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.p4dsl.p4Dsl.Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command</em>' containment reference list.
   * @see org.xtext.example.p4dsl.p4Dsl.P4DslPackage#getModel_Command()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommand();

} // Model
