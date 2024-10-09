/**
 */
package robotDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see robotDSL.RobotDSLPackage
 * @generated
 */
public class RobotDSLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RobotDSLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotDSLSwitch() {
		if (modelPackage == null) {
			modelPackage = RobotDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RobotDSLPackage.ROBOT_PROGRAMM: {
			RobotProgramm robotProgramm = (RobotProgramm) theEObject;
			T result = caseRobotProgramm(robotProgramm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.MOVE_INSTRUCTION: {
			MoveInstruction moveInstruction = (MoveInstruction) theEObject;
			T result = caseMoveInstruction(moveInstruction);
			if (result == null)
				result = caseInstruction(moveInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.INSTRUCTION: {
			Instruction instruction = (Instruction) theEObject;
			T result = caseInstruction(instruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.CONTROL_STRUCTURE: {
			ControlStructure controlStructure = (ControlStructure) theEObject;
			T result = caseControlStructure(controlStructure);
			if (result == null)
				result = caseInstruction(controlStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.SET_SPEED_INSTRUCTION: {
			SetSpeedInstruction setSpeedInstruction = (SetSpeedInstruction) theEObject;
			T result = caseSetSpeedInstruction(setSpeedInstruction);
			if (result == null)
				result = caseInstruction(setSpeedInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.REPEAT_INSTRUCTION: {
			RepeatInstruction repeatInstruction = (RepeatInstruction) theEObject;
			T result = caseRepeatInstruction(repeatInstruction);
			if (result == null)
				result = caseControlStructure(repeatInstruction);
			if (result == null)
				result = caseInstruction(repeatInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.LOOP_INSTRUCTION: {
			LoopInstruction loopInstruction = (LoopInstruction) theEObject;
			T result = caseLoopInstruction(loopInstruction);
			if (result == null)
				result = caseControlStructure(loopInstruction);
			if (result == null)
				result = caseInstruction(loopInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.IF_INSTRUCTION: {
			IfInstruction ifInstruction = (IfInstruction) theEObject;
			T result = caseIfInstruction(ifInstruction);
			if (result == null)
				result = caseControlStructure(ifInstruction);
			if (result == null)
				result = caseInstruction(ifInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.FONCTION: {
			Fonction fonction = (Fonction) theEObject;
			T result = caseFonction(fonction);
			if (result == null)
				result = caseInstruction(fonction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = caseInstruction(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.BASIC_ARITHMETICS: {
			BasicArithmetics basicArithmetics = (BasicArithmetics) theEObject;
			T result = caseBasicArithmetics(basicArithmetics);
			if (result == null)
				result = caseExpression(basicArithmetics);
			if (result == null)
				result = caseInstruction(basicArithmetics);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.CLASSE_TYPE: {
			ClasseType classeType = (ClasseType) theEObject;
			T result = caseClasseType(classeType);
			if (result == null)
				result = caseExpression(classeType);
			if (result == null)
				result = caseInstruction(classeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.PROC_CALL: {
			ProcCall procCall = (ProcCall) theEObject;
			T result = caseProcCall(procCall);
			if (result == null)
				result = caseExpression(procCall);
			if (result == null)
				result = caseInstruction(procCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseExpression(parameter);
			if (result == null)
				result = caseInstruction(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.AFFECTATION: {
			Affectation affectation = (Affectation) theEObject;
			T result = caseAffectation(affectation);
			if (result == null)
				result = caseExpression(affectation);
			if (result == null)
				result = caseInstruction(affectation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.VAR_DECLARATION: {
			VarDeclaration varDeclaration = (VarDeclaration) theEObject;
			T result = caseVarDeclaration(varDeclaration);
			if (result == null)
				result = caseExpression(varDeclaration);
			if (result == null)
				result = caseInstruction(varDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.DIV: {
			Div div = (Div) theEObject;
			T result = caseDiv(div);
			if (result == null)
				result = caseBasicArithmetics(div);
			if (result == null)
				result = caseExpression(div);
			if (result == null)
				result = caseInstruction(div);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.PLUS: {
			Plus plus = (Plus) theEObject;
			T result = casePlus(plus);
			if (result == null)
				result = caseBasicArithmetics(plus);
			if (result == null)
				result = caseExpression(plus);
			if (result == null)
				result = caseInstruction(plus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.LOWER: {
			Lower lower = (Lower) theEObject;
			T result = caseLower(lower);
			if (result == null)
				result = caseBasicArithmetics(lower);
			if (result == null)
				result = caseExpression(lower);
			if (result == null)
				result = caseInstruction(lower);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.GREATER: {
			Greater greater = (Greater) theEObject;
			T result = caseGreater(greater);
			if (result == null)
				result = caseBasicArithmetics(greater);
			if (result == null)
				result = caseExpression(greater);
			if (result == null)
				result = caseInstruction(greater);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.MULT: {
			Mult mult = (Mult) theEObject;
			T result = caseMult(mult);
			if (result == null)
				result = caseBasicArithmetics(mult);
			if (result == null)
				result = caseExpression(mult);
			if (result == null)
				result = caseInstruction(mult);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.EQUALS: {
			Equals equals = (Equals) theEObject;
			T result = caseEquals(equals);
			if (result == null)
				result = caseBasicArithmetics(equals);
			if (result == null)
				result = caseExpression(equals);
			if (result == null)
				result = caseInstruction(equals);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.MINUS: {
			Minus minus = (Minus) theEObject;
			T result = caseMinus(minus);
			if (result == null)
				result = caseBasicArithmetics(minus);
			if (result == null)
				result = caseExpression(minus);
			if (result == null)
				result = caseInstruction(minus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.BOOLEAN: {
			robotDSL.Boolean boolean_ = (robotDSL.Boolean) theEObject;
			T result = caseBoolean(boolean_);
			if (result == null)
				result = caseClasseType(boolean_);
			if (result == null)
				result = caseExpression(boolean_);
			if (result == null)
				result = caseInstruction(boolean_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.CONSTANT: {
			Constant constant = (Constant) theEObject;
			T result = caseConstant(constant);
			if (result == null)
				result = caseClasseType(constant);
			if (result == null)
				result = caseExpression(constant);
			if (result == null)
				result = caseInstruction(constant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.NUMBER: {
			robotDSL.Number number = (robotDSL.Number) theEObject;
			T result = caseNumber(number);
			if (result == null)
				result = caseClasseType(number);
			if (result == null)
				result = caseExpression(number);
			if (result == null)
				result = caseInstruction(number);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.TIME: {
			Time time = (Time) theEObject;
			T result = caseTime(time);
			if (result == null)
				result = caseClasseType(time);
			if (result == null)
				result = caseExpression(time);
			if (result == null)
				result = caseInstruction(time);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseBasicArithmetics(not);
			if (result == null)
				result = caseExpression(not);
			if (result == null)
				result = caseInstruction(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseBasicArithmetics(or);
			if (result == null)
				result = caseExpression(or);
			if (result == null)
				result = caseInstruction(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseBasicArithmetics(and);
			if (result == null)
				result = caseExpression(and);
			if (result == null)
				result = caseInstruction(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.PRIMITIVE: {
			Primitive primitive = (Primitive) theEObject;
			T result = casePrimitive(primitive);
			if (result == null)
				result = caseExpression(primitive);
			if (result == null)
				result = caseInstruction(primitive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.FORWARD: {
			Forward forward = (Forward) theEObject;
			T result = caseForward(forward);
			if (result == null)
				result = casePrimitive(forward);
			if (result == null)
				result = caseExpression(forward);
			if (result == null)
				result = caseInstruction(forward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.BACK: {
			Back back = (Back) theEObject;
			T result = caseBack(back);
			if (result == null)
				result = casePrimitive(back);
			if (result == null)
				result = caseExpression(back);
			if (result == null)
				result = caseInstruction(back);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.RIGHT: {
			Right right = (Right) theEObject;
			T result = caseRight(right);
			if (result == null)
				result = casePrimitive(right);
			if (result == null)
				result = caseExpression(right);
			if (result == null)
				result = caseInstruction(right);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.CLOCK: {
			Clock clock = (Clock) theEObject;
			T result = caseClock(clock);
			if (result == null)
				result = casePrimitive(clock);
			if (result == null)
				result = caseExpression(clock);
			if (result == null)
				result = caseInstruction(clock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.LEFT: {
			Left left = (Left) theEObject;
			T result = caseLeft(left);
			if (result == null)
				result = casePrimitive(left);
			if (result == null)
				result = caseExpression(left);
			if (result == null)
				result = caseInstruction(left);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.CLEAR: {
			Clear clear = (Clear) theEObject;
			T result = caseClear(clear);
			if (result == null)
				result = casePrimitive(clear);
			if (result == null)
				result = caseExpression(clear);
			if (result == null)
				result = caseInstruction(clear);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.DISTANCE: {
			Distance distance = (Distance) theEObject;
			T result = caseDistance(distance);
			if (result == null)
				result = caseClasseType(distance);
			if (result == null)
				result = caseExpression(distance);
			if (result == null)
				result = caseInstruction(distance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.MN: {
			Mn mn = (Mn) theEObject;
			T result = caseMn(mn);
			if (result == null)
				result = caseDistance(mn);
			if (result == null)
				result = caseClasseType(mn);
			if (result == null)
				result = caseExpression(mn);
			if (result == null)
				result = caseInstruction(mn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.CM: {
			Cm cm = (Cm) theEObject;
			T result = caseCm(cm);
			if (result == null)
				result = caseDistance(cm);
			if (result == null)
				result = caseClasseType(cm);
			if (result == null)
				result = caseExpression(cm);
			if (result == null)
				result = caseInstruction(cm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.ROTATE_INSTRUCTION: {
			RotateInstruction rotateInstruction = (RotateInstruction) theEObject;
			T result = caseRotateInstruction(rotateInstruction);
			if (result == null)
				result = casePrimitive(rotateInstruction);
			if (result == null)
				result = caseExpression(rotateInstruction);
			if (result == null)
				result = caseInstruction(rotateInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RobotDSLPackage.CENSOR_INSTRUCTION: {
			CensorInstruction censorInstruction = (CensorInstruction) theEObject;
			T result = caseCensorInstruction(censorInstruction);
			if (result == null)
				result = casePrimitive(censorInstruction);
			if (result == null)
				result = caseExpression(censorInstruction);
			if (result == null)
				result = caseInstruction(censorInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot Programm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot Programm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobotProgramm(RobotProgramm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveInstruction(MoveInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlStructure(ControlStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Speed Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Speed Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetSpeedInstruction(SetSpeedInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatInstruction(RepeatInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopInstruction(LoopInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfInstruction(IfInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fonction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fonction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFonction(Fonction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Arithmetics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Arithmetics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicArithmetics(BasicArithmetics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classe Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classe Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasseType(ClasseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proc Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proc Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcCall(ProcCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffectation(Affectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDeclaration(VarDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLower(Lower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMult(Mult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquals(Equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(robotDSL.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(robotDSL.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitive(Primitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForward(Forward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBack(Back object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeft(Left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClear(Clear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistance(Distance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMn(Mn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCm(Cm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotate Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotate Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotateInstruction(RotateInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Censor Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Censor Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCensorInstruction(CensorInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RobotDSLSwitch
