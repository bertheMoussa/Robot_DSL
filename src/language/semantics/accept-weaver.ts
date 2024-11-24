
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
		Instruction : this.weaveInstruction,
		RepeatInstruction : this.weaveRepeatInstruction,
		LoopInstruction : this.weaveLoopInstruction,
		ConditionInstruction : this.weaveConditionInstruction,
		RotateInstruction : this.weaveRotateInstruction,
		SensorInstruction : this.weaveSensorInstruction,
		MoveInstruction : this.weaveMoveInstruction,
		SetSpeedInstruction : this.weaveSetSpeedInstruction,
		Affectation : this.weaveAffectation,
		Addition : this.weaveAddition,
		Multiplication : this.weaveMultiplication,
		PrimExpr : this.weavePrimExpr,
		GetDistance : this.weaveGetDistance,
		GetSpeed : this.weaveGetSpeed,
		GetRotation : this.weaveGetRotation,
		VarCall : this.weaveVarCall,
		ProcCall : this.weaveProcCall,
		Fonction : this.weaveFonction,
		Parameter : this.weaveParameter,
		Block : this.weaveBlock,
		GetTime : this.weaveGetTime,
		VarDeclaration : this.weaveVarDeclaration,
        Value:this.weaveValue,
        BooleanValue:this.weaveBooleanValue
    };

weaveValue(node : InterfaceAST.Value, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitValue(node as unknown as ClassAST.Value); }
}
weaveBooleanValue(node : InterfaceAST.BooleanValue, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitBooleanValue(node as unknown as ClassAST.BooleanValue); }
}
weaveRobotProgram(node : InterfaceAST.RobotProgram, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitRobotProgram(node as unknown as ClassAST.RobotProgram); }
}

weaveInstruction(node : InterfaceAST.Instruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitInstruction(node as unknown as ClassAST.Instruction); }
}

weaveRepeatInstruction(node : InterfaceAST.RepeatInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitRepeatInstruction(node as unknown as ClassAST.RepeatInstruction); }
}

weaveLoopInstruction(node : InterfaceAST.LoopInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitLoopInstruction(node as unknown as ClassAST.LoopInstruction); }
}

weaveConditionInstruction(node : InterfaceAST.ConditionInstruction, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitConditionInstruction(node as unknown as ClassAST.ConditionInstruction); }
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

weaveAddition(node : InterfaceAST.Addition, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitAddition(node as unknown as ClassAST.Addition); }
}

weaveMultiplication(node : InterfaceAST.Multiplication, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitMultiplication(node as unknown as ClassAST.Multiplication); }
}

weavePrimExpr(node : InterfaceAST.PrimExpr, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitPrimExpr(node as unknown as ClassAST.PrimExpr); }
}

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

weaveGetTime(node : InterfaceAST.GetTime, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitGetTime(node as unknown as ClassAST.GetTime); }
}

weaveVarDeclaration(node : InterfaceAST.VarDeclaration, accept : ValidationAcceptor) : void {
    (<any> node).accept = (visitor: Visitor) => { return visitor.visitVarDeclaration(node as unknown as ClassAST.VarDeclaration); }
}


}
