/**
 */
package org.xtext.example.p4dsl.p4Dsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.p4dsl.p4Dsl.P4DslPackage
 * @generated
 */
public interface P4DslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  P4DslFactory eINSTANCE = org.xtext.example.p4dsl.p4Dsl.impl.P4DslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>P4 Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>P4 Command</em>'.
   * @generated
   */
  P4Command createP4Command();

  /**
   * Returns a new object of class '<em>PUC Flag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PUC Flag</em>'.
   * @generated
   */
  PUCFlag createPUCFlag();

  /**
   * Returns a new object of class '<em>PORT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PORT</em>'.
   * @generated
   */
  PORT createPORT();

  /**
   * Returns a new object of class '<em>USER</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>USER</em>'.
   * @generated
   */
  USER createUSER();

  /**
   * Returns a new object of class '<em>CLIENT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CLIENT</em>'.
   * @generated
   */
  CLIENT createCLIENT();

  /**
   * Returns a new object of class '<em>File Based Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File Based Command</em>'.
   * @generated
   */
  FileBasedCommand createFileBasedCommand();

  /**
   * Returns a new object of class '<em>Add</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add</em>'.
   * @generated
   */
  Add createAdd();

  /**
   * Returns a new object of class '<em>Edit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Edit</em>'.
   * @generated
   */
  Edit createEdit();

  /**
   * Returns a new object of class '<em>Delete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete</em>'.
   * @generated
   */
  Delete createDelete();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  P4DslPackage getP4DslPackage();

} //P4DslFactory
