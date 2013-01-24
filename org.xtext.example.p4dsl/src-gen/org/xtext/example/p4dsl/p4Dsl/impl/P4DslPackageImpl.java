/**
 */
package org.xtext.example.p4dsl.p4Dsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.p4dsl.p4Dsl.Add;
import org.xtext.example.p4dsl.p4Dsl.Command;
import org.xtext.example.p4dsl.p4Dsl.Delete;
import org.xtext.example.p4dsl.p4Dsl.Edit;
import org.xtext.example.p4dsl.p4Dsl.FileBasedCommand;
import org.xtext.example.p4dsl.p4Dsl.Model;
import org.xtext.example.p4dsl.p4Dsl.P4Command;
import org.xtext.example.p4dsl.p4Dsl.P4DslFactory;
import org.xtext.example.p4dsl.p4Dsl.P4DslPackage;
import org.xtext.example.p4dsl.p4Dsl.PUCFlag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class P4DslPackageImpl extends EPackageImpl implements P4DslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass p4CommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pucFlagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileBasedCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.p4dsl.p4Dsl.P4DslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private P4DslPackageImpl()
  {
    super(eNS_URI, P4DslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link P4DslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static P4DslPackage init()
  {
    if (isInited) return (P4DslPackage)EPackage.Registry.INSTANCE.getEPackage(P4DslPackage.eNS_URI);

    // Obtain or create and register package
    P4DslPackageImpl theP4DslPackage = (P4DslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof P4DslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new P4DslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theP4DslPackage.createPackageContents();

    // Initialize created meta-data
    theP4DslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theP4DslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(P4DslPackage.eNS_URI, theP4DslPackage);
    return theP4DslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Command()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getP4Command()
  {
    return p4CommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getP4Command_Name()
  {
    return (EAttribute)p4CommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPUCFlag()
  {
    return pucFlagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPUCFlag_P4command()
  {
    return (EReference)pucFlagEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPORT()
  {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUSER()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCLIENT()
  {
    return clientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileBasedCommand()
  {
    return fileBasedCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdd()
  {
    return addEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdit()
  {
    return editEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelete()
  {
    return deleteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P4DslFactory getP4DslFactory()
  {
    return (P4DslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__COMMAND);

    commandEClass = createEClass(COMMAND);

    p4CommandEClass = createEClass(P4_COMMAND);
    createEAttribute(p4CommandEClass, P4_COMMAND__NAME);

    pucFlagEClass = createEClass(PUC_FLAG);
    createEReference(pucFlagEClass, PUC_FLAG__P4COMMAND);

    portEClass = createEClass(PORT);

    userEClass = createEClass(USER);

    clientEClass = createEClass(CLIENT);

    fileBasedCommandEClass = createEClass(FILE_BASED_COMMAND);

    addEClass = createEClass(ADD);

    editEClass = createEClass(EDIT);

    deleteEClass = createEClass(DELETE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    p4CommandEClass.getESuperTypes().add(this.getCommand());
    pucFlagEClass.getESuperTypes().add(this.getP4Command());
    portEClass.getESuperTypes().add(this.getPUCFlag());
    userEClass.getESuperTypes().add(this.getPUCFlag());
    clientEClass.getESuperTypes().add(this.getPUCFlag());
    fileBasedCommandEClass.getESuperTypes().add(this.getP4Command());
    addEClass.getESuperTypes().add(this.getFileBasedCommand());
    editEClass.getESuperTypes().add(this.getFileBasedCommand());
    deleteEClass.getESuperTypes().add(this.getFileBasedCommand());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Command(), this.getCommand(), null, "command", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(p4CommandEClass, P4Command.class, "P4Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getP4Command_Name(), ecorePackage.getEString(), "name", null, 0, 1, P4Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pucFlagEClass, PUCFlag.class, "PUCFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPUCFlag_P4command(), this.getP4Command(), null, "p4command", null, 0, -1, PUCFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portEClass, org.xtext.example.p4dsl.p4Dsl.PORT.class, "PORT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(userEClass, org.xtext.example.p4dsl.p4Dsl.USER.class, "USER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(clientEClass, org.xtext.example.p4dsl.p4Dsl.CLIENT.class, "CLIENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fileBasedCommandEClass, FileBasedCommand.class, "FileBasedCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(addEClass, Add.class, "Add", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(editEClass, Edit.class, "Edit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //P4DslPackageImpl
