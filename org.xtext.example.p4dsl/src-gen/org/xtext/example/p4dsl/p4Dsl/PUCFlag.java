/**
 */
package org.xtext.example.p4dsl.p4Dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PUC Flag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.p4dsl.p4Dsl.PUCFlag#getP4command <em>P4command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.p4dsl.p4Dsl.P4DslPackage#getPUCFlag()
 * @model
 * @generated
 */
public interface PUCFlag extends P4Command
{
  /**
   * Returns the value of the '<em><b>P4command</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.p4dsl.p4Dsl.P4Command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P4command</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P4command</em>' containment reference list.
   * @see org.xtext.example.p4dsl.p4Dsl.P4DslPackage#getPUCFlag_P4command()
   * @model containment="true"
   * @generated
   */
  EList<P4Command> getP4command();

} // PUCFlag
