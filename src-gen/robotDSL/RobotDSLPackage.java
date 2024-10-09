/**
 */
package robotDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robotDSL.RobotDSLFactory
 * @model kind="package"
 * @generated
 */
public interface RobotDSLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "robotDSL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/robotDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robotDSL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RobotDSLPackage eINSTANCE = robotDSL.impl.RobotDSLPackageImpl.init();

	/**
	 * The meta object id for the '{@link robotDSL.impl.RobotProgrammImpl <em>Robot Programm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.RobotProgrammImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getRobotProgramm()
	 * @generated
	 */
	int ROBOT_PROGRAMM = 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAMM__INSTRUCTION = 0;

	/**
	 * The number of structural features of the '<em>Robot Programm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAMM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Robot Programm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_PROGRAMM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.InstructionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION___RUN = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link robotDSL.impl.MoveInstructionImpl <em>Move Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.MoveInstructionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getMoveInstruction()
	 * @generated
	 */
	int MOVE_INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_INSTRUCTION__DISTANCE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_INSTRUCTION___RUN = INSTRUCTION___RUN;

	/**
	 * The number of operations of the '<em>Move Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.ControlStructureImpl <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.ControlStructureImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__EXPRESSION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE___RUN = INSTRUCTION___RUN;

	/**
	 * The number of operations of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.SetSpeedInstructionImpl <em>Set Speed Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.SetSpeedInstructionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getSetSpeedInstruction()
	 * @generated
	 */
	int SET_SPEED_INSTRUCTION = 4;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED_INSTRUCTION__SPEED = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Speed Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED_INSTRUCTION___RUN = INSTRUCTION___RUN;

	/**
	 * The number of operations of the '<em>Set Speed Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SPEED_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.RepeatInstructionImpl <em>Repeat Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.RepeatInstructionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getRepeatInstruction()
	 * @generated
	 */
	int REPEAT_INSTRUCTION = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_INSTRUCTION__EXPRESSION = CONTROL_STRUCTURE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_INSTRUCTION__BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_INSTRUCTION_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_INSTRUCTION___RUN = CONTROL_STRUCTURE___RUN;

	/**
	 * The number of operations of the '<em>Repeat Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_INSTRUCTION_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.LoopInstructionImpl <em>Loop Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.LoopInstructionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getLoopInstruction()
	 * @generated
	 */
	int LOOP_INSTRUCTION = 6;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_INSTRUCTION__EXPRESSION = CONTROL_STRUCTURE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_INSTRUCTION__BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_INSTRUCTION_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_INSTRUCTION___RUN = CONTROL_STRUCTURE___RUN;

	/**
	 * The number of operations of the '<em>Loop Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_INSTRUCTION_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.IfInstructionImpl <em>If Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.IfInstructionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getIfInstruction()
	 * @generated
	 */
	int IF_INSTRUCTION = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTRUCTION__EXPRESSION = CONTROL_STRUCTURE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTRUCTION__BLOCK = CONTROL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>If Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTRUCTION_FEATURE_COUNT = CONTROL_STRUCTURE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTRUCTION___RUN = CONTROL_STRUCTURE___RUN;

	/**
	 * The number of operations of the '<em>If Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_INSTRUCTION_OPERATION_COUNT = CONTROL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.FonctionImpl <em>Fonction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.FonctionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getFonction()
	 * @generated
	 */
	int FONCTION = 8;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__BLOCK = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION__NAME = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION___RUN = INSTRUCTION___RUN;

	/**
	 * The number of operations of the '<em>Fonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.BlockImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INSTRUCTION = 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.ExpressionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___RUN = INSTRUCTION___RUN;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.BasicArithmeticsImpl <em>Basic Arithmetics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.BasicArithmeticsImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getBasicArithmetics()
	 * @generated
	 */
	int BASIC_ARITHMETICS = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ARITHMETICS__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Arithmetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ARITHMETICS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ARITHMETICS___RUN = EXPRESSION___RUN;

	/**
	 * The number of operations of the '<em>Basic Arithmetics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ARITHMETICS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.ClasseTypeImpl <em>Classe Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.ClasseTypeImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getClasseType()
	 * @generated
	 */
	int CLASSE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Vardeclaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_TYPE__VARDECLARATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_TYPE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_TYPE___RUN = EXPRESSION___RUN;

	/**
	 * The number of operations of the '<em>Classe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_TYPE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.ProcCallImpl <em>Proc Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.ProcCallImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getProcCall()
	 * @generated
	 */
	int PROC_CALL = 13;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Proc Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL___RUN = EXPRESSION___RUN;

	/**
	 * The number of operations of the '<em>Proc Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROC_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.ParameterImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Fonction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__FONCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___RUN = EXPRESSION___RUN;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.AffectationImpl <em>Affectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.AffectationImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getAffectation()
	 * @generated
	 */
	int AFFECTATION = 15;

	/**
	 * The number of structural features of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION___RUN = EXPRESSION___RUN;

	/**
	 * The number of operations of the '<em>Affectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFFECTATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.VarDeclarationImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getVarDeclaration()
	 * @generated
	 */
	int VAR_DECLARATION = 16;

	/**
	 * The number of structural features of the '<em>Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION___RUN = EXPRESSION___RUN;

	/**
	 * The number of operations of the '<em>Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.DivImpl <em>Div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.DivImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getDiv()
	 * @generated
	 */
	int DIV = 17;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>Div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.PlusImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.LowerImpl <em>Lower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.LowerImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getLower()
	 * @generated
	 */
	int LOWER = 19;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Lower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>Lower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.GreaterImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 20;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.MultImpl <em>Mult</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.MultImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getMult()
	 * @generated
	 */
	int MULT = 21;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>Mult</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULT_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.EqualsImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 22;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.MinusImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 23;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.BooleanImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 24;

	/**
	 * The feature id for the '<em><b>Vardeclaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__VARDECLARATION = CLASSE_TYPE__VARDECLARATION;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = CLASSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___RUN = CLASSE_TYPE___RUN;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = CLASSE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.ConstantImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 25;

	/**
	 * The feature id for the '<em><b>Vardeclaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VARDECLARATION = CLASSE_TYPE__VARDECLARATION;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = CLASSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT___RUN = CLASSE_TYPE___RUN;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = CLASSE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.NumberImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 26;

	/**
	 * The feature id for the '<em><b>Vardeclaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VARDECLARATION = CLASSE_TYPE__VARDECLARATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = CLASSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = CLASSE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___RUN = CLASSE_TYPE___RUN;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = CLASSE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.TimeImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 27;

	/**
	 * The feature id for the '<em><b>Vardeclaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VARDECLARATION = CLASSE_TYPE__VARDECLARATION;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = CLASSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME___RUN = CLASSE_TYPE___RUN;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = CLASSE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.NotImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 28;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.OrImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getOr()
	 * @generated
	 */
	int OR = 29;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.AndImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 30;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__EXPRESSION = BASIC_ARITHMETICS__EXPRESSION;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BASIC_ARITHMETICS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND___RUN = BASIC_ARITHMETICS___RUN;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BASIC_ARITHMETICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.PrimitiveImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 31;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___RUN = EXPRESSION___RUN;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.ForwardImpl <em>Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.ForwardImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getForward()
	 * @generated
	 */
	int FORWARD = 32;

	/**
	 * The number of structural features of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD___RUN = PRIMITIVE___RUN;

	/**
	 * The number of operations of the '<em>Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.BackImpl <em>Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.BackImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getBack()
	 * @generated
	 */
	int BACK = 33;

	/**
	 * The number of structural features of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK___RUN = PRIMITIVE___RUN;

	/**
	 * The number of operations of the '<em>Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACK_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.RightImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 34;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT___RUN = PRIMITIVE___RUN;

	/**
	 * The number of operations of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.ClockImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 35;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK___RUN = PRIMITIVE___RUN;

	/**
	 * The number of operations of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.LeftImpl <em>Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.LeftImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getLeft()
	 * @generated
	 */
	int LEFT = 36;

	/**
	 * The number of structural features of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT___RUN = PRIMITIVE___RUN;

	/**
	 * The number of operations of the '<em>Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.ClearImpl <em>Clear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.ClearImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getClear()
	 * @generated
	 */
	int CLEAR = 37;

	/**
	 * The number of structural features of the '<em>Clear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR___RUN = PRIMITIVE___RUN;

	/**
	 * The number of operations of the '<em>Clear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.DistanceImpl <em>Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.DistanceImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getDistance()
	 * @generated
	 */
	int DISTANCE = 38;

	/**
	 * The feature id for the '<em><b>Vardeclaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__VARDECLARATION = CLASSE_TYPE__VARDECLARATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__VALUE = CLASSE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Moveinstruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE__MOVEINSTRUCTION = CLASSE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_FEATURE_COUNT = CLASSE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE___RUN = CLASSE_TYPE___RUN;

	/**
	 * The number of operations of the '<em>Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_OPERATION_COUNT = CLASSE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.MnImpl <em>Mn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.MnImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getMn()
	 * @generated
	 */
	int MN = 39;

	/**
	 * The feature id for the '<em><b>Vardeclaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MN__VARDECLARATION = DISTANCE__VARDECLARATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MN__VALUE = DISTANCE__VALUE;

	/**
	 * The feature id for the '<em><b>Moveinstruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MN__MOVEINSTRUCTION = DISTANCE__MOVEINSTRUCTION;

	/**
	 * The number of structural features of the '<em>Mn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MN_FEATURE_COUNT = DISTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MN___RUN = DISTANCE___RUN;

	/**
	 * The number of operations of the '<em>Mn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MN_OPERATION_COUNT = DISTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.CmImpl <em>Cm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.CmImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getCm()
	 * @generated
	 */
	int CM = 40;

	/**
	 * The feature id for the '<em><b>Vardeclaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__VARDECLARATION = DISTANCE__VARDECLARATION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__VALUE = DISTANCE__VALUE;

	/**
	 * The feature id for the '<em><b>Moveinstruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM__MOVEINSTRUCTION = DISTANCE__MOVEINSTRUCTION;

	/**
	 * The number of structural features of the '<em>Cm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_FEATURE_COUNT = DISTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM___RUN = DISTANCE___RUN;

	/**
	 * The number of operations of the '<em>Cm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_OPERATION_COUNT = DISTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.RotateInstructionImpl <em>Rotate Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.RotateInstructionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getRotateInstruction()
	 * @generated
	 */
	int ROTATE_INSTRUCTION = 41;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_INSTRUCTION__ANGLE = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rotate Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_INSTRUCTION_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_INSTRUCTION___RUN = PRIMITIVE___RUN;

	/**
	 * The number of operations of the '<em>Rotate Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_INSTRUCTION_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robotDSL.impl.CensorInstructionImpl <em>Censor Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robotDSL.impl.CensorInstructionImpl
	 * @see robotDSL.impl.RobotDSLPackageImpl#getCensorInstruction()
	 * @generated
	 */
	int CENSOR_INSTRUCTION = 42;

	/**
	 * The number of structural features of the '<em>Censor Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENSOR_INSTRUCTION_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENSOR_INSTRUCTION___RUN = PRIMITIVE___RUN;

	/**
	 * The number of operations of the '<em>Censor Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENSOR_INSTRUCTION_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link robotDSL.RobotProgramm <em>Robot Programm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Programm</em>'.
	 * @see robotDSL.RobotProgramm
	 * @generated
	 */
	EClass getRobotProgramm();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.RobotProgramm#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction</em>'.
	 * @see robotDSL.RobotProgramm#getInstruction()
	 * @see #getRobotProgramm()
	 * @generated
	 */
	EReference getRobotProgramm_Instruction();

	/**
	 * Returns the meta object for class '{@link robotDSL.MoveInstruction <em>Move Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Instruction</em>'.
	 * @see robotDSL.MoveInstruction
	 * @generated
	 */
	EClass getMoveInstruction();

	/**
	 * Returns the meta object for the reference '{@link robotDSL.MoveInstruction#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distance</em>'.
	 * @see robotDSL.MoveInstruction#getDistance()
	 * @see #getMoveInstruction()
	 * @generated
	 */
	EReference getMoveInstruction_Distance();

	/**
	 * Returns the meta object for class '{@link robotDSL.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see robotDSL.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the '{@link robotDSL.Instruction#run() <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see robotDSL.Instruction#run()
	 * @generated
	 */
	EOperation getInstruction__Run();

	/**
	 * Returns the meta object for class '{@link robotDSL.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Structure</em>'.
	 * @see robotDSL.ControlStructure
	 * @generated
	 */
	EClass getControlStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.ControlStructure#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see robotDSL.ControlStructure#getExpression()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Expression();

	/**
	 * Returns the meta object for class '{@link robotDSL.SetSpeedInstruction <em>Set Speed Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Speed Instruction</em>'.
	 * @see robotDSL.SetSpeedInstruction
	 * @generated
	 */
	EClass getSetSpeedInstruction();

	/**
	 * Returns the meta object for the attribute '{@link robotDSL.SetSpeedInstruction#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see robotDSL.SetSpeedInstruction#getSpeed()
	 * @see #getSetSpeedInstruction()
	 * @generated
	 */
	EAttribute getSetSpeedInstruction_Speed();

	/**
	 * Returns the meta object for class '{@link robotDSL.RepeatInstruction <em>Repeat Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Instruction</em>'.
	 * @see robotDSL.RepeatInstruction
	 * @generated
	 */
	EClass getRepeatInstruction();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.RepeatInstruction#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see robotDSL.RepeatInstruction#getBlock()
	 * @see #getRepeatInstruction()
	 * @generated
	 */
	EReference getRepeatInstruction_Block();

	/**
	 * Returns the meta object for class '{@link robotDSL.LoopInstruction <em>Loop Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Instruction</em>'.
	 * @see robotDSL.LoopInstruction
	 * @generated
	 */
	EClass getLoopInstruction();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.LoopInstruction#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see robotDSL.LoopInstruction#getBlock()
	 * @see #getLoopInstruction()
	 * @generated
	 */
	EReference getLoopInstruction_Block();

	/**
	 * Returns the meta object for class '{@link robotDSL.IfInstruction <em>If Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Instruction</em>'.
	 * @see robotDSL.IfInstruction
	 * @generated
	 */
	EClass getIfInstruction();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.IfInstruction#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see robotDSL.IfInstruction#getBlock()
	 * @see #getIfInstruction()
	 * @generated
	 */
	EReference getIfInstruction_Block();

	/**
	 * Returns the meta object for class '{@link robotDSL.Fonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fonction</em>'.
	 * @see robotDSL.Fonction
	 * @generated
	 */
	EClass getFonction();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.Fonction#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see robotDSL.Fonction#getBlock()
	 * @see #getFonction()
	 * @generated
	 */
	EReference getFonction_Block();

	/**
	 * Returns the meta object for the attribute '{@link robotDSL.Fonction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotDSL.Fonction#getName()
	 * @see #getFonction()
	 * @generated
	 */
	EAttribute getFonction_Name();

	/**
	 * Returns the meta object for class '{@link robotDSL.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see robotDSL.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.Block#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction</em>'.
	 * @see robotDSL.Block#getInstruction()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Instruction();

	/**
	 * Returns the meta object for class '{@link robotDSL.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see robotDSL.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link robotDSL.BasicArithmetics <em>Basic Arithmetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Arithmetics</em>'.
	 * @see robotDSL.BasicArithmetics
	 * @generated
	 */
	EClass getBasicArithmetics();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.BasicArithmetics#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see robotDSL.BasicArithmetics#getExpression()
	 * @see #getBasicArithmetics()
	 * @generated
	 */
	EReference getBasicArithmetics_Expression();

	/**
	 * Returns the meta object for class '{@link robotDSL.ClasseType <em>Classe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classe Type</em>'.
	 * @see robotDSL.ClasseType
	 * @generated
	 */
	EClass getClasseType();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.ClasseType#getVardeclaration <em>Vardeclaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vardeclaration</em>'.
	 * @see robotDSL.ClasseType#getVardeclaration()
	 * @see #getClasseType()
	 * @generated
	 */
	EReference getClasseType_Vardeclaration();

	/**
	 * Returns the meta object for class '{@link robotDSL.ProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proc Call</em>'.
	 * @see robotDSL.ProcCall
	 * @generated
	 */
	EClass getProcCall();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.ProcCall#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see robotDSL.ProcCall#getExpression()
	 * @see #getProcCall()
	 * @generated
	 */
	EReference getProcCall_Expression();

	/**
	 * Returns the meta object for class '{@link robotDSL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see robotDSL.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link robotDSL.Parameter#getFonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fonction</em>'.
	 * @see robotDSL.Parameter#getFonction()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Fonction();

	/**
	 * Returns the meta object for the attribute '{@link robotDSL.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see robotDSL.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link robotDSL.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Affectation</em>'.
	 * @see robotDSL.Affectation
	 * @generated
	 */
	EClass getAffectation();

	/**
	 * Returns the meta object for class '{@link robotDSL.VarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Declaration</em>'.
	 * @see robotDSL.VarDeclaration
	 * @generated
	 */
	EClass getVarDeclaration();

	/**
	 * Returns the meta object for class '{@link robotDSL.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div</em>'.
	 * @see robotDSL.Div
	 * @generated
	 */
	EClass getDiv();

	/**
	 * Returns the meta object for class '{@link robotDSL.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see robotDSL.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link robotDSL.Lower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower</em>'.
	 * @see robotDSL.Lower
	 * @generated
	 */
	EClass getLower();

	/**
	 * Returns the meta object for class '{@link robotDSL.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see robotDSL.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link robotDSL.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mult</em>'.
	 * @see robotDSL.Mult
	 * @generated
	 */
	EClass getMult();

	/**
	 * Returns the meta object for class '{@link robotDSL.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see robotDSL.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link robotDSL.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see robotDSL.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link robotDSL.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see robotDSL.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for class '{@link robotDSL.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see robotDSL.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link robotDSL.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see robotDSL.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link robotDSL.Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robotDSL.Number#getValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Value();

	/**
	 * Returns the meta object for class '{@link robotDSL.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see robotDSL.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link robotDSL.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see robotDSL.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link robotDSL.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see robotDSL.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link robotDSL.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see robotDSL.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link robotDSL.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see robotDSL.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link robotDSL.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward</em>'.
	 * @see robotDSL.Forward
	 * @generated
	 */
	EClass getForward();

	/**
	 * Returns the meta object for class '{@link robotDSL.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Back</em>'.
	 * @see robotDSL.Back
	 * @generated
	 */
	EClass getBack();

	/**
	 * Returns the meta object for class '{@link robotDSL.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see robotDSL.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for class '{@link robotDSL.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see robotDSL.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for class '{@link robotDSL.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left</em>'.
	 * @see robotDSL.Left
	 * @generated
	 */
	EClass getLeft();

	/**
	 * Returns the meta object for class '{@link robotDSL.Clear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear</em>'.
	 * @see robotDSL.Clear
	 * @generated
	 */
	EClass getClear();

	/**
	 * Returns the meta object for class '{@link robotDSL.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance</em>'.
	 * @see robotDSL.Distance
	 * @generated
	 */
	EClass getDistance();

	/**
	 * Returns the meta object for the attribute '{@link robotDSL.Distance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see robotDSL.Distance#getValue()
	 * @see #getDistance()
	 * @generated
	 */
	EAttribute getDistance_Value();

	/**
	 * Returns the meta object for the reference '{@link robotDSL.Distance#getMoveinstruction <em>Moveinstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moveinstruction</em>'.
	 * @see robotDSL.Distance#getMoveinstruction()
	 * @see #getDistance()
	 * @generated
	 */
	EReference getDistance_Moveinstruction();

	/**
	 * Returns the meta object for class '{@link robotDSL.Mn <em>Mn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mn</em>'.
	 * @see robotDSL.Mn
	 * @generated
	 */
	EClass getMn();

	/**
	 * Returns the meta object for class '{@link robotDSL.Cm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cm</em>'.
	 * @see robotDSL.Cm
	 * @generated
	 */
	EClass getCm();

	/**
	 * Returns the meta object for class '{@link robotDSL.RotateInstruction <em>Rotate Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate Instruction</em>'.
	 * @see robotDSL.RotateInstruction
	 * @generated
	 */
	EClass getRotateInstruction();

	/**
	 * Returns the meta object for the attribute '{@link robotDSL.RotateInstruction#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see robotDSL.RotateInstruction#getAngle()
	 * @see #getRotateInstruction()
	 * @generated
	 */
	EAttribute getRotateInstruction_Angle();

	/**
	 * Returns the meta object for class '{@link robotDSL.CensorInstruction <em>Censor Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Censor Instruction</em>'.
	 * @see robotDSL.CensorInstruction
	 * @generated
	 */
	EClass getCensorInstruction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RobotDSLFactory getRobotDSLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robotDSL.impl.RobotProgrammImpl <em>Robot Programm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.RobotProgrammImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getRobotProgramm()
		 * @generated
		 */
		EClass ROBOT_PROGRAMM = eINSTANCE.getRobotProgramm();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_PROGRAMM__INSTRUCTION = eINSTANCE.getRobotProgramm_Instruction();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.MoveInstructionImpl <em>Move Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.MoveInstructionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getMoveInstruction()
		 * @generated
		 */
		EClass MOVE_INSTRUCTION = eINSTANCE.getMoveInstruction();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_INSTRUCTION__DISTANCE = eINSTANCE.getMoveInstruction_Distance();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.InstructionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INSTRUCTION___RUN = eINSTANCE.getInstruction__Run();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.ControlStructureImpl <em>Control Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.ControlStructureImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getControlStructure()
		 * @generated
		 */
		EClass CONTROL_STRUCTURE = eINSTANCE.getControlStructure();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__EXPRESSION = eINSTANCE.getControlStructure_Expression();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.SetSpeedInstructionImpl <em>Set Speed Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.SetSpeedInstructionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getSetSpeedInstruction()
		 * @generated
		 */
		EClass SET_SPEED_INSTRUCTION = eINSTANCE.getSetSpeedInstruction();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_SPEED_INSTRUCTION__SPEED = eINSTANCE.getSetSpeedInstruction_Speed();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.RepeatInstructionImpl <em>Repeat Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.RepeatInstructionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getRepeatInstruction()
		 * @generated
		 */
		EClass REPEAT_INSTRUCTION = eINSTANCE.getRepeatInstruction();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEAT_INSTRUCTION__BLOCK = eINSTANCE.getRepeatInstruction_Block();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.LoopInstructionImpl <em>Loop Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.LoopInstructionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getLoopInstruction()
		 * @generated
		 */
		EClass LOOP_INSTRUCTION = eINSTANCE.getLoopInstruction();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_INSTRUCTION__BLOCK = eINSTANCE.getLoopInstruction_Block();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.IfInstructionImpl <em>If Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.IfInstructionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getIfInstruction()
		 * @generated
		 */
		EClass IF_INSTRUCTION = eINSTANCE.getIfInstruction();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_INSTRUCTION__BLOCK = eINSTANCE.getIfInstruction_Block();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.FonctionImpl <em>Fonction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.FonctionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getFonction()
		 * @generated
		 */
		EClass FONCTION = eINSTANCE.getFonction();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FONCTION__BLOCK = eINSTANCE.getFonction_Block();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONCTION__NAME = eINSTANCE.getFonction_Name();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.BlockImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INSTRUCTION = eINSTANCE.getBlock_Instruction();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.ExpressionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.BasicArithmeticsImpl <em>Basic Arithmetics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.BasicArithmeticsImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getBasicArithmetics()
		 * @generated
		 */
		EClass BASIC_ARITHMETICS = eINSTANCE.getBasicArithmetics();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_ARITHMETICS__EXPRESSION = eINSTANCE.getBasicArithmetics_Expression();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.ClasseTypeImpl <em>Classe Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.ClasseTypeImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getClasseType()
		 * @generated
		 */
		EClass CLASSE_TYPE = eINSTANCE.getClasseType();

		/**
		 * The meta object literal for the '<em><b>Vardeclaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE_TYPE__VARDECLARATION = eINSTANCE.getClasseType_Vardeclaration();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.ProcCallImpl <em>Proc Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.ProcCallImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getProcCall()
		 * @generated
		 */
		EClass PROC_CALL = eINSTANCE.getProcCall();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROC_CALL__EXPRESSION = eINSTANCE.getProcCall_Expression();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.ParameterImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Fonction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__FONCTION = eINSTANCE.getParameter_Fonction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.AffectationImpl <em>Affectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.AffectationImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getAffectation()
		 * @generated
		 */
		EClass AFFECTATION = eINSTANCE.getAffectation();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.VarDeclarationImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getVarDeclaration()
		 * @generated
		 */
		EClass VAR_DECLARATION = eINSTANCE.getVarDeclaration();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.DivImpl <em>Div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.DivImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getDiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getDiv();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.PlusImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.LowerImpl <em>Lower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.LowerImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getLower()
		 * @generated
		 */
		EClass LOWER = eINSTANCE.getLower();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.GreaterImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.MultImpl <em>Mult</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.MultImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getMult()
		 * @generated
		 */
		EClass MULT = eINSTANCE.getMult();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.EqualsImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.MinusImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.BooleanImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.ConstantImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.NumberImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.TimeImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.NotImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.OrImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.AndImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.PrimitiveImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.ForwardImpl <em>Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.ForwardImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getForward()
		 * @generated
		 */
		EClass FORWARD = eINSTANCE.getForward();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.BackImpl <em>Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.BackImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getBack()
		 * @generated
		 */
		EClass BACK = eINSTANCE.getBack();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.RightImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.ClockImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.LeftImpl <em>Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.LeftImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getLeft()
		 * @generated
		 */
		EClass LEFT = eINSTANCE.getLeft();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.ClearImpl <em>Clear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.ClearImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getClear()
		 * @generated
		 */
		EClass CLEAR = eINSTANCE.getClear();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.DistanceImpl <em>Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.DistanceImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getDistance()
		 * @generated
		 */
		EClass DISTANCE = eINSTANCE.getDistance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE__VALUE = eINSTANCE.getDistance_Value();

		/**
		 * The meta object literal for the '<em><b>Moveinstruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE__MOVEINSTRUCTION = eINSTANCE.getDistance_Moveinstruction();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.MnImpl <em>Mn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.MnImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getMn()
		 * @generated
		 */
		EClass MN = eINSTANCE.getMn();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.CmImpl <em>Cm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.CmImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getCm()
		 * @generated
		 */
		EClass CM = eINSTANCE.getCm();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.RotateInstructionImpl <em>Rotate Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.RotateInstructionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getRotateInstruction()
		 * @generated
		 */
		EClass ROTATE_INSTRUCTION = eINSTANCE.getRotateInstruction();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE_INSTRUCTION__ANGLE = eINSTANCE.getRotateInstruction_Angle();

		/**
		 * The meta object literal for the '{@link robotDSL.impl.CensorInstructionImpl <em>Censor Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robotDSL.impl.CensorInstructionImpl
		 * @see robotDSL.impl.RobotDSLPackageImpl#getCensorInstruction()
		 * @generated
		 */
		EClass CENSOR_INSTRUCTION = eINSTANCE.getCensorInstruction();

	}

} //RobotDSLPackage
