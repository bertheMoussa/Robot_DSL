
import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobotDslAstType } from '../generated/ast.js';
import * as InterfaceAST from '../generated/ast.js';
import * as ClassAST from './visitor.js';
import { Visitor } from './visitor.js';
import type { RobotDslServices } from '../robot-dsl-module.js';

/**
 * Register custom validation checks.
 * TODO : Call this function in the language module.ts file (see registerValidationChecks(...);)
 */
export function weaveAcceptMethods(services: RobotDslServices) {
    const registry = services.validation.ValidationRegistry;
    const weaver = services.validation.RobotDslAcceptWeaver
    registry.register(weaver.checks, weaver);
}

export class RobotDslAcceptWeaver {
    
    // TODO : Remove lines for abstract concepts
    checks: ValidationChecks<RobotDslAstType> = {
        RobotProgram : this.weaveRobotProgram,
		Expression : this.weaveExpression,
		BasicArithmetics : this.weaveBasicArithmetics,
		Instruction : this.weaveInstruction,
		ControlStructure : this.weaveControlStructure,
		RepeatInstruction : this.weaveRepeatInstruction,
		LoopInstruction : this.weaveLoopInstruction,
		IfInstruction : this.weaveIfInstruction,
		Primitive : this.weavePrimitive,
		RotateInstruction : this.weaveRotateInstruction,
		SensorInstruction : this.weaveSensorInstruction,
		MoveInstruction : this.weaveMoveInstruction,
		SetSpeedInstruction : this.weaveSetSpeedInstruction,
		Affectation : this.weaveAffectation,
		CallExpression : this.weaveCallExpression,
		Addition : this.weaveAddition,
		Multiplication : this.weaveMultiplication,
		PrimExpr : this.weavePrimExpr,
		ClasseType : this.weaveClasseType,
		//Boolean : this.weaveBoolean,
		Constant : this.weaveConstant,
		NumberType : this.weaveNumberType,
		GetDistance : this.weaveGetDistance,
		GetSpeed : this.weaveGetSpeed,
		GetRotation : this.weaveGetRotation,
		VarCall : this.weaveVarCall,
		ProcCall : this.weaveProcCall,
		Fonction : this.weaveFonction,
		Parameter : this.weaveParameter,
		Block : this.weaveBlock,
		//Time : this.weaveTime,
		GetTime : this.weaveGetTime,
		VarDeclaration : this.weaveVarDeclaration,
    };

    
weaveRobotProgram(node : InterfaceAST.RobotProgram, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitRobotProgram(node as unknown as ClassAST.RobotProgram); }
}

weaveExpression(node : InterfaceAST.Expression, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitExpression(node as unknown as ClassAST.Expression); }
}

weaveBasicArithmetics(node : InterfaceAST.BasicArithmetics, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitBasicArithmetics(node as unknown as ClassAST.BasicArithmetics); }
}

weaveInstruction(node : InterfaceAST.Instruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitInstruction(node as unknown as ClassAST.Instruction); }
}

weaveControlStructure(node : InterfaceAST.ControlStructure, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitControlStructure(node as unknown as ClassAST.ControlStructure); }
}

weaveRepeatInstruction(node : InterfaceAST.RepeatInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitRepeatInstruction(node as unknown as ClassAST.RepeatInstruction); }
}

weaveLoopInstruction(node : InterfaceAST.LoopInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitLoopInstruction(node as unknown as ClassAST.LoopInstruction); }
}

weaveIfInstruction(node : InterfaceAST.IfInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitIfInstruction(node as unknown as ClassAST.IfInstruction); }
}

weavePrimitive(node : InterfaceAST.Primitive, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitPrimitive(node as unknown as ClassAST.Primitive); }
}

weaveRotateInstruction(node : InterfaceAST.RotateInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitRotateInstruction(node as unknown as ClassAST.RotateInstruction); }
}

weaveSensorInstruction(node : InterfaceAST.SensorInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitSensorInstruction(node as unknown as ClassAST.SensorInstruction); }
}

weaveMoveInstruction(node : InterfaceAST.MoveInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitMoveInstruction(node as unknown as ClassAST.MoveInstruction); }
}

weaveSetSpeedInstruction(node : InterfaceAST.SetSpeedInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitSetSpeedInstruction(node as unknown as ClassAST.SetSpeedInstruction); }
}

weaveAffectation(node : InterfaceAST.Affectation, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitAffectation(node as unknown as ClassAST.Affectation); }
}

weaveCallExpression(node : InterfaceAST.CallExpression, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitCallExpression(node as unknown as ClassAST.CallExpression); }
}

weaveAddition(node : InterfaceAST.Addition, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitAddition(node as unknown as ClassAST.Addition); }
}

weaveMultiplication(node : InterfaceAST.Multiplication, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitMultiplication(node as unknown as ClassAST.Multiplication); }
}

/*weaveOperators(node : InterfaceAST.Operators, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitOperators(node as unknown as ClassAST.Operators); }
}*/

weavePrimExpr(node : InterfaceAST.PrimExpr, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitPrimExpr(node as unknown as ClassAST.PrimExpr); }
}

weaveClasseType(node : InterfaceAST.ClasseType, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitClasseType(node as unknown as ClassAST.ClasseType); }
}

/*weaveBoolean(node : InterfaceAST.Boolean, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitBoolean(node as unknown as ClassAST.Boolean); }
}*/

weaveConstant(node : InterfaceAST.Constant, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitConstant(node as unknown as ClassAST.Constant); }
}

weaveNumberType(node : InterfaceAST.NumberType, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitNumberType(node as unknown as ClassAST.NumberType); }
}

/*weaveDistance(node : InterfaceAST.Distance, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitDistance(node as unknown as ClassAST.Distance); }
}*/

weaveGetDistance(node : InterfaceAST.GetDistance, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitGetDistance(node as unknown as ClassAST.GetDistance); }
}

weaveGetSpeed(node : InterfaceAST.GetSpeed, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitGetSpeed(node as unknown as ClassAST.GetSpeed); }
}

weaveGetRotation(node : InterfaceAST.GetRotation, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitGetRotation(node as unknown as ClassAST.GetRotation); }
}

weaveVarCall(node : InterfaceAST.VarCall, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitVarCall(node as unknown as ClassAST.VarCall); }
}

weaveProcCall(node : InterfaceAST.ProcCall, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitProcCall(node as unknown as ClassAST.ProcCall); }
}

weaveFonction(node : InterfaceAST.Fonction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitFonction(node as unknown as ClassAST.Fonction); }
}

weaveParameter(node : InterfaceAST.Parameter, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitParameter(node as unknown as ClassAST.Parameter); }
}

weaveBlock(node : InterfaceAST.Block, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitBlock(node as unknown as ClassAST.Block); }
}

/*weaveTime(node : InterfaceAST.Time, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitTime(node as unknown as ClassAST.Time); }
}*/

weaveGetTime(node : InterfaceAST.GetTime, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitGetTime(node as unknown as ClassAST.GetTime); }
}

weaveVarDeclaration(node : InterfaceAST.VarDeclaration, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitVarDeclaration(node as unknown as ClassAST.VarDeclaration); }
}

/*weaveDirection(node : InterfaceAST.Direction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitDirection(node as unknown as ClassAST.Direction); }
}

weaveRotationSens(node : InterfaceAST.RotationSens, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitRotationSens(node as unknown as ClassAST.RotationSens); }
}*/


}
