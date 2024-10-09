/**
 */
package robotDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import robotDSL.Affectation;
import robotDSL.And;
import robotDSL.Back;
import robotDSL.BasicArithmetics;
import robotDSL.Block;
import robotDSL.CensorInstruction;
import robotDSL.ClasseType;
import robotDSL.Clear;
import robotDSL.Clock;
import robotDSL.Cm;
import robotDSL.Constant;
import robotDSL.ControlStructure;
import robotDSL.Distance;
import robotDSL.Div;
import robotDSL.Equals;
import robotDSL.Expression;
import robotDSL.Fonction;
import robotDSL.Forward;
import robotDSL.Greater;
import robotDSL.IfInstruction;
import robotDSL.Instruction;
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
import robotDSL.Primitive;
import robotDSL.ProcCall;
import robotDSL.RepeatInstruction;
import robotDSL.Right;
import robotDSL.RobotDSLPackage;
import robotDSL.RobotProgramm;
import robotDSL.RotateInstruction;
import robotDSL.SetSpeedInstruction;
import robotDSL.Time;
import robotDSL.VarDeclaration;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see robotDSL.RobotDSLPackage
 * @generated
 */
public class RobotDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RobotDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotDSLSwitch<Adapter> modelSwitch = new RobotDSLSwitch<Adapter>() {
		@Override
		public Adapter caseRobotProgramm(RobotProgramm object) {
			return createRobotProgrammAdapter();
		}

		@Override
		public Adapter caseMoveInstruction(MoveInstruction object) {
			return createMoveInstructionAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseControlStructure(ControlStructure object) {
			return createControlStructureAdapter();
		}

		@Override
		public Adapter caseSetSpeedInstruction(SetSpeedInstruction object) {
			return createSetSpeedInstructionAdapter();
		}

		@Override
		public Adapter caseRepeatInstruction(RepeatInstruction object) {
			return createRepeatInstructionAdapter();
		}

		@Override
		public Adapter caseLoopInstruction(LoopInstruction object) {
			return createLoopInstructionAdapter();
		}

		@Override
		public Adapter caseIfInstruction(IfInstruction object) {
			return createIfInstructionAdapter();
		}

		@Override
		public Adapter caseFonction(Fonction object) {
			return createFonctionAdapter();
		}

		@Override
		public Adapter caseBlock(Block object) {
			return createBlockAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseBasicArithmetics(BasicArithmetics object) {
			return createBasicArithmeticsAdapter();
		}

		@Override
		public Adapter caseClasseType(ClasseType object) {
			return createClasseTypeAdapter();
		}

		@Override
		public Adapter caseProcCall(ProcCall object) {
			return createProcCallAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseAffectation(Affectation object) {
			return createAffectationAdapter();
		}

		@Override
		public Adapter caseVarDeclaration(VarDeclaration object) {
			return createVarDeclarationAdapter();
		}

		@Override
		public Adapter caseDiv(Div object) {
			return createDivAdapter();
		}

		@Override
		public Adapter casePlus(Plus object) {
			return createPlusAdapter();
		}

		@Override
		public Adapter caseLower(Lower object) {
			return createLowerAdapter();
		}

		@Override
		public Adapter caseGreater(Greater object) {
			return createGreaterAdapter();
		}

		@Override
		public Adapter caseMult(Mult object) {
			return createMultAdapter();
		}

		@Override
		public Adapter caseEquals(Equals object) {
			return createEqualsAdapter();
		}

		@Override
		public Adapter caseMinus(Minus object) {
			return createMinusAdapter();
		}

		@Override
		public Adapter caseBoolean(robotDSL.Boolean object) {
			return createBooleanAdapter();
		}

		@Override
		public Adapter caseConstant(Constant object) {
			return createConstantAdapter();
		}

		@Override
		public Adapter caseNumber(robotDSL.Number object) {
			return createNumberAdapter();
		}

		@Override
		public Adapter caseTime(Time object) {
			return createTimeAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter casePrimitive(Primitive object) {
			return createPrimitiveAdapter();
		}

		@Override
		public Adapter caseForward(Forward object) {
			return createForwardAdapter();
		}

		@Override
		public Adapter caseBack(Back object) {
			return createBackAdapter();
		}

		@Override
		public Adapter caseRight(Right object) {
			return createRightAdapter();
		}

		@Override
		public Adapter caseClock(Clock object) {
			return createClockAdapter();
		}

		@Override
		public Adapter caseLeft(Left object) {
			return createLeftAdapter();
		}

		@Override
		public Adapter caseClear(Clear object) {
			return createClearAdapter();
		}

		@Override
		public Adapter caseDistance(Distance object) {
			return createDistanceAdapter();
		}

		@Override
		public Adapter caseMn(Mn object) {
			return createMnAdapter();
		}

		@Override
		public Adapter caseCm(Cm object) {
			return createCmAdapter();
		}

		@Override
		public Adapter caseRotateInstruction(RotateInstruction object) {
			return createRotateInstructionAdapter();
		}

		@Override
		public Adapter caseCensorInstruction(CensorInstruction object) {
			return createCensorInstructionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.RobotProgramm <em>Robot Programm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.RobotProgramm
	 * @generated
	 */
	public Adapter createRobotProgrammAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.MoveInstruction <em>Move Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.MoveInstruction
	 * @generated
	 */
	public Adapter createMoveInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.ControlStructure
	 * @generated
	 */
	public Adapter createControlStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.SetSpeedInstruction <em>Set Speed Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.SetSpeedInstruction
	 * @generated
	 */
	public Adapter createSetSpeedInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.RepeatInstruction <em>Repeat Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.RepeatInstruction
	 * @generated
	 */
	public Adapter createRepeatInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.LoopInstruction <em>Loop Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.LoopInstruction
	 * @generated
	 */
	public Adapter createLoopInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.IfInstruction <em>If Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.IfInstruction
	 * @generated
	 */
	public Adapter createIfInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Fonction <em>Fonction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Fonction
	 * @generated
	 */
	public Adapter createFonctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.BasicArithmetics <em>Basic Arithmetics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.BasicArithmetics
	 * @generated
	 */
	public Adapter createBasicArithmeticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.ClasseType <em>Classe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.ClasseType
	 * @generated
	 */
	public Adapter createClasseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.ProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.ProcCall
	 * @generated
	 */
	public Adapter createProcCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Affectation <em>Affectation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Affectation
	 * @generated
	 */
	public Adapter createAffectationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.VarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.VarDeclaration
	 * @generated
	 */
	public Adapter createVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Lower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Lower
	 * @generated
	 */
	public Adapter createLowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Mult
	 * @generated
	 */
	public Adapter createMultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Equals
	 * @generated
	 */
	public Adapter createEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Primitive
	 * @generated
	 */
	public Adapter createPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Forward
	 * @generated
	 */
	public Adapter createForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Back
	 * @generated
	 */
	public Adapter createBackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Right
	 * @generated
	 */
	public Adapter createRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Left
	 * @generated
	 */
	public Adapter createLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Clear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Clear
	 * @generated
	 */
	public Adapter createClearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Distance
	 * @generated
	 */
	public Adapter createDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Mn <em>Mn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Mn
	 * @generated
	 */
	public Adapter createMnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.Cm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.Cm
	 * @generated
	 */
	public Adapter createCmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.RotateInstruction <em>Rotate Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.RotateInstruction
	 * @generated
	 */
	public Adapter createRotateInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link robotDSL.CensorInstruction <em>Censor Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see robotDSL.CensorInstruction
	 * @generated
	 */
	public Adapter createCensorInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RobotDSLAdapterFactory
