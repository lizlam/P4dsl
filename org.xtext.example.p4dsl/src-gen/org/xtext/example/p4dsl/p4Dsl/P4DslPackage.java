/**
 */
package org.xtext.example.p4dsl.p4Dsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.p4dsl.p4Dsl.P4DslFactory
 * @model kind="package"
 * @generated
 */
public interface P4DslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "p4Dsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/p4dsl/P4Dsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "p4Dsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  P4DslPackage eINSTANCE = org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.p4dsl.p4Dsl.impl.ModelImpl
   * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMMAND = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.p4dsl.p4Dsl.impl.CommandImpl
   * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.P4CommandImpl <em>P4 Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.p4dsl.p4Dsl.impl.P4CommandImpl
   * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getP4Command()
   * @generated
   */
  int P4_COMMAND = 2;

  /**
   * The number of structural features of the '<em>P4 Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int P4_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.FileBasedCommandImpl <em>File Based Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.p4dsl.p4Dsl.impl.FileBasedCommandImpl
   * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getFileBasedCommand()
   * @generated
   */
  int FILE_BASED_COMMAND = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_BASED_COMMAND__NAME = P4_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>File Based Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_BASED_COMMAND_FEATURE_COUNT = P4_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.AddImpl <em>Add</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.p4dsl.p4Dsl.impl.AddImpl
   * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getAdd()
   * @generated
   */
  int ADD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__NAME = FILE_BASED_COMMAND__NAME;

  /**
   * The number of structural features of the '<em>Add</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_FEATURE_COUNT = FILE_BASED_COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.EditImpl <em>Edit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.p4dsl.p4Dsl.impl.EditImpl
   * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getEdit()
   * @generated
   */
  int EDIT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT__NAME = FILE_BASED_COMMAND__NAME;

  /**
   * The number of structural features of the '<em>Edit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EDIT_FEATURE_COUNT = FILE_BASED_COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.DeleteImpl <em>Delete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.p4dsl.p4Dsl.impl.DeleteImpl
   * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getDelete()
   * @generated
   */
  int DELETE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE__NAME = FILE_BASED_COMMAND__NAME;

  /**
   * The number of structural features of the '<em>Delete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_FEATURE_COUNT = FILE_BASED_COMMAND_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.example.p4dsl.p4Dsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.p4dsl.p4Dsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.p4dsl.p4Dsl.Model#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Command</em>'.
   * @see org.xtext.example.p4dsl.p4Dsl.Model#getCommand()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Command();

  /**
   * Returns the meta object for class '{@link org.xtext.example.p4dsl.p4Dsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.xtext.example.p4dsl.p4Dsl.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for class '{@link org.xtext.example.p4dsl.p4Dsl.P4Command <em>P4 Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>P4 Command</em>'.
   * @see org.xtext.example.p4dsl.p4Dsl.P4Command
   * @generated
   */
  EClass getP4Command();

  /**
   * Returns the meta object for class '{@link org.xtext.example.p4dsl.p4Dsl.FileBasedCommand <em>File Based Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Based Command</em>'.
   * @see org.xtext.example.p4dsl.p4Dsl.FileBasedCommand
   * @generated
   */
  EClass getFileBasedCommand();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.p4dsl.p4Dsl.FileBasedCommand#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.p4dsl.p4Dsl.FileBasedCommand#getName()
   * @see #getFileBasedCommand()
   * @generated
   */
  EAttribute getFileBasedCommand_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.p4dsl.p4Dsl.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add</em>'.
   * @see org.xtext.example.p4dsl.p4Dsl.Add
   * @generated
   */
  EClass getAdd();

  /**
   * Returns the meta object for class '{@link org.xtext.example.p4dsl.p4Dsl.Edit <em>Edit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Edit</em>'.
   * @see org.xtext.example.p4dsl.p4Dsl.Edit
   * @generated
   */
  EClass getEdit();

  /**
   * Returns the meta object for class '{@link org.xtext.example.p4dsl.p4Dsl.Delete <em>Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete</em>'.
   * @see org.xtext.example.p4dsl.p4Dsl.Delete
   * @generated
   */
  EClass getDelete();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  P4DslFactory getP4DslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.p4dsl.p4Dsl.impl.ModelImpl
     * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMMAND = eINSTANCE.getModel_Command();

    /**
     * The meta object literal for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.p4dsl.p4Dsl.impl.CommandImpl
     * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.P4CommandImpl <em>P4 Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.p4dsl.p4Dsl.impl.P4CommandImpl
     * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getP4Command()
     * @generated
     */
    EClass P4_COMMAND = eINSTANCE.getP4Command();

    /**
     * The meta object literal for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.FileBasedCommandImpl <em>File Based Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.p4dsl.p4Dsl.impl.FileBasedCommandImpl
     * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getFileBasedCommand()
     * @generated
     */
    EClass FILE_BASED_COMMAND = eINSTANCE.getFileBasedCommand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_BASED_COMMAND__NAME = eINSTANCE.getFileBasedCommand_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.AddImpl <em>Add</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.p4dsl.p4Dsl.impl.AddImpl
     * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getAdd()
     * @generated
     */
    EClass ADD = eINSTANCE.getAdd();

    /**
     * The meta object literal for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.EditImpl <em>Edit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.p4dsl.p4Dsl.impl.EditImpl
     * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getEdit()
     * @generated
     */
    EClass EDIT = eINSTANCE.getEdit();

    /**
     * The meta object literal for the '{@link org.xtext.example.p4dsl.p4Dsl.impl.DeleteImpl <em>Delete</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.p4dsl.p4Dsl.impl.DeleteImpl
     * @see org.xtext.example.p4dsl.p4Dsl.impl.P4DslPackageImpl#getDelete()
     * @generated
     */
    EClass DELETE = eINSTANCE.getDelete();

  }

} //P4DslPackage
