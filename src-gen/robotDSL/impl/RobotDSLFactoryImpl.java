/**
 */
package robotDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import robotDSL.Affectation;
import robotDSL.And;
import robotDSL.Back;
import robotDSL.Block;
import robotDSL.CensorInstruction;
import robotDSL.Clear;
import robotDSL.Clock;
import robotDSL.Cm;
import robotDSL.Constant;
import robotDSL.Div;
import robotDSL.Equals;
import robotDSL.Fonction;
import robotDSL.Forward;
import robotDSL.Greater;
import robotDSL.IfInstruction;
import robotDSL.Left;
import robotDSL.LoopInstruction;
import robotDSL.Lower;
import robotDSL.Minus;
import robotDSL.Mn;
import robotDSL.MoveInstruction;
import robotDSL.Mult;
import robotDSL.Not;
import robotDSL.Or;
import robotDSL.Parameter;
import robotDSL.Plus;
import robotDSL.ProcCall;
import robotDSL.RepeatInstruction;
import robotDSL.Right;
import robotDSL.RobotDSLFactory;
import robotDSL.RobotDSLPackage;
import robotDSL.RobotProgramm;
import robotDSL.RotateInstruction;
import robotDSL.SetSpeedInstruction;
import robotDSL.Time;
import robotDSL.VarDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotDSLFactoryImpl extends EFactoryImpl implements RobotDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RobotDSLFactory init() {
		try {
			RobotDSLFactory theRobotDSLFactory = (RobotDSLFactory) EPackage.Registry.INSTANCE
					.getEFactory(RobotDSLPackage.eNS_URI);
			if (theRobotDSLFactory != null) {
				return theRobotDSLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RobotDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RobotDSLPackage.ROBOT_PROGRAMM:
			return createRobotProgramm();
		case RobotDSLPackage.MOVE_INSTRUCTION:
			return createMoveInstruction();
		case RobotDSLPackage.SET_SPEED_INSTRUCTION:
			return createSetSpeedInstruction();
		case RobotDSLPackage.REPEAT_INSTRUCTION:
			return createRepeatInstruction();
		case RobotDSLPackage.LOOP_INSTRUCTION:
			return createLoopInstruction();
		case RobotDSLPackage.IF_INSTRUCTION:
			return createIfInstruction();
		case RobotDSLPackage.FONCTION:
			return createFonction();
		case RobotDSLPackage.BLOCK:
			return createBlock();
		case RobotDSLPackage.PROC_CALL:
			return createProcCall();
		case RobotDSLPackage.PARAMETER:
			return createParameter();
		case RobotDSLPackage.AFFECTATION:
			return createAffectation();
		case RobotDSLPackage.VAR_DECLARATION:
			return createVarDeclaration();
		case RobotDSLPackage.DIV:
			return createDiv();
		case RobotDSLPackage.PLUS:
			return createPlus();
		case RobotDSLPackage.LOWER:
			return createLower();
		case RobotDSLPackage.GREATER:
			return createGreater();
		case RobotDSLPackage.MULT:
			return createMult();
		case RobotDSLPackage.EQUALS:
			return createEquals();
		case RobotDSLPackage.MINUS:
			return createMinus();
		case RobotDSLPackage.BOOLEAN:
			return createBoolean();
		case RobotDSLPackage.CONSTANT:
			return createConstant();
		case RobotDSLPackage.NUMBER:
			return createNumber();
		case RobotDSLPackage.TIME:
			return createTime();
		case RobotDSLPackage.NOT:
			return createNot();
		case RobotDSLPackage.OR:
			return createOr();
		case RobotDSLPackage.AND:
			return createAnd();
		case RobotDSLPackage.FORWARD:
			return createForward();
		case RobotDSLPackage.BACK:
			return createBack();
		case RobotDSLPackage.RIGHT:
			return createRight();
		case RobotDSLPackage.CLOCK:
			return createClock();
		case RobotDSLPackage.LEFT:
			return createLeft();
		case RobotDSLPackage.CLEAR:
			return createClear();
		case RobotDSLPackage.MN:
			return createMn();
		case RobotDSLPackage.CM:
			return createCm();
		case RobotDSLPackage.ROTATE_INSTRUCTION:
			return createRotateInstruction();
		case RobotDSLPackage.CENSOR_INSTRUCTION:
			return createCensorInstruction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotProgramm createRobotProgramm() {
		RobotProgrammImpl robotProgramm = new RobotProgrammImpl();
		return robotProgramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveInstruction createMoveInstruction() {
		MoveInstructionImpl moveInstruction = new MoveInstructionImpl();
		return moveInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetSpeedInstruction createSetSpeedInstruction() {
		SetSpeedInstructionImpl setSpeedInstruction = new SetSpeedInstructionImpl();
		return setSpeedInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatInstruction createRepeatInstruction() {
		RepeatInstructionImpl repeatInstruction = new RepeatInstructionImpl();
		return repeatInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopInstruction createLoopInstruction() {
		LoopInstructionImpl loopInstruction = new LoopInstructionImpl();
		return loopInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfInstruction createIfInstruction() {
		IfInstructionImpl ifInstruction = new IfInstructionImpl();
		return ifInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fonction createFonction() {
		FonctionImpl fonction = new FonctionImpl();
		return fonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcCall createProcCall() {
		ProcCallImpl procCall = new ProcCallImpl();
		return procCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affectation createAffectation() {
		AffectationImpl affectation = new AffectationImpl();
		return affectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDeclaration createVarDeclaration() {
		VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
		return varDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lower createLower() {
		LowerImpl lower = new LowerImpl();
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mult createMult() {
		MultImpl mult = new MultImpl();
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public robotDSL.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public robotDSL.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forward createForward() {
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Back createBack() {
		BackImpl back = new BackImpl();
		return back;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Left createLeft() {
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clear createClear() {
		ClearImpl clear = new ClearImpl();
		return clear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mn createMn() {
		MnImpl mn = new MnImpl();
		return mn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cm createCm() {
		CmImpl cm = new CmImpl();
		return cm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotateInstruction createRotateInstruction() {
		RotateInstructionImpl rotateInstruction = new RotateInstructionImpl();
		return rotateInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CensorInstruction createCensorInstruction() {
		CensorInstructionImpl censorInstruction = new CensorInstructionImpl();
		return censorInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLPackage getRobotDSLPackage() {
		return (RobotDSLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RobotDSLPackage getPackage() {
		return RobotDSLPackage.eINSTANCE;
	}

} //RobotDSLFactoryImpl
