/**
 */
package org.xtext.example.p4dsl.p4Dsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.p4dsl.p4Dsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class P4DslFactoryImpl extends EFactoryImpl implements P4DslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static P4DslFactory init()
  {
    try
    {
      P4DslFactory theP4DslFactory = (P4DslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/p4dsl/P4Dsl"); 
      if (theP4DslFactory != null)
      {
        return theP4DslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new P4DslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P4DslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case P4DslPackage.MODEL: return createModel();
      case P4DslPackage.COMMAND: return createCommand();
      case P4DslPackage.P4_COMMAND: return createP4Command();
      case P4DslPackage.PUC_FLAG: return createPUCFlag();
      case P4DslPackage.PORT: return createPort();
      case P4DslPackage.USER: return createUser();
      case P4DslPackage.CLIENT: return createClient();
      case P4DslPackage.FILE_BASED_COMMAND: return createFileBasedCommand();
      case P4DslPackage.ADD: return createAdd();
      case P4DslPackage.EDIT: return createEdit();
      case P4DslPackage.DELETE: return createDelete();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P4Command createP4Command()
  {
    P4CommandImpl p4Command = new P4CommandImpl();
    return p4Command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PUCFlag createPUCFlag()
  {
    PUCFlagImpl pucFlag = new PUCFlagImpl();
    return pucFlag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User createUser()
  {
    UserImpl user = new UserImpl();
    return user;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Client createClient()
  {
    ClientImpl client = new ClientImpl();
    return client;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileBasedCommand createFileBasedCommand()
  {
    FileBasedCommandImpl fileBasedCommand = new FileBasedCommandImpl();
    return fileBasedCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Edit createEdit()
  {
    EditImpl edit = new EditImpl();
    return edit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Delete createDelete()
  {
    DeleteImpl delete = new DeleteImpl();
    return delete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public P4DslPackage getP4DslPackage()
  {
    return (P4DslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static P4DslPackage getPackage()
  {
    return P4DslPackage.eINSTANCE;
  }

} //P4DslFactoryImpl
