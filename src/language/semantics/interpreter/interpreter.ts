import { Robot } from "../../../web/simulator/entities.js";
import { BaseScene, Scene } from "../../../web/simulator/scene.js";
import { Vector } from "../../../web/simulator/utils.js";
import { Addition, Affectation, Block, BooleanValue, ConditionInstruction, Fonction, GetDistance, GetRotation, GetSpeed, GetTime, Instruction, LoopInstruction, MoveInstruction, Multiplication, Parameter, PrimExpr, ProcCall, RepeatInstruction, RobotProgram, RotateInstruction, SensorInstruction, SetSpeedInstruction, Value, VarCall, VarDeclaration } from "../../generated/ast.js";
import { Visitor } from "../visitor.js";


interface VariableInfos {
    name: string;
    type: string;
    value: Instruction;
}

interface FunctionInfos {
    name: string;
    parameters: VarDeclaration[];
    returnType: string;
}
export class InterpreterImpl implements Visitor {
    private scene: Scene;
    private robot: Robot;

    private variableList: { [key: string]: VariableInfos } = {};
    private functionList: { [key: string]: FunctionInfos } = {};

    constructor(sceneWidth?: number, sceneHeight?:number) {
        if(sceneWidth && sceneHeight){
            this.scene = new BaseScene(new Vector(sceneWidth*10, sceneHeight*10));
            this.robot = this.scene.robot;   
        }else{
            this.scene = new BaseScene();
            this.robot = this.scene.robot;
        }       
    }
    
    visitRobotProgram(node : RobotProgram) : any{
        const entry= node.fonctions.find(fonction => fonction.name === "entry");
        if (entry) {
            this.visitFonction(entry as Fonction);
        }
        return this.scene;
    }
	visitInstruction(node : Instruction) : any{
        switch (node.$type) {
            case 'Fonction':
                return this.visitFonction(node as Fonction);
            case 'RepeatInstruction':
                return this.visitRepeatInstruction(node as RepeatInstruction);
            case 'LoopInstruction':
                return this.visitLoopInstruction(node as LoopInstruction);
            case 'ConditionInstruction':
                return this.visitConditionInstruction(node as ConditionInstruction);
            case 'RotateInstruction':
                return this.visitRotateInstruction(node as RotateInstruction);
            /*case 'SensorInstruction':
                return this.visitSensorInstruction(node as SensorInstruction);*/
            case 'MoveInstruction':
                return this.visitMoveInstruction(node as MoveInstruction);
            case 'GetDistance':
                return this.visitGetDistance(node as GetDistance);
            /*case 'GetRotation':
                return this.visitGetRotation(node as GetRotation);*/
            case 'GetSpeed':
                return this.visitGetSpeed(node as GetSpeed);
            case 'GetTime':
                return this.visitGetTime(node as GetTime);
            case 'Affectation':
                return this.visitAffectation(node as Affectation);
            case 'VarCall':
                return this.visitVarCall(node as VarCall);
            case 'ProcCall':
                return this.visitProcCall(node as ProcCall);
            case 'VarDeclaration':
                return this.visitVarDeclaration(node as VarDeclaration);
            case "SetSpeedInstruction":
                return this.visitSetSpeedInstruction(node as SetSpeedInstruction);
            case 'Value':
                return this.visitValue(node as Value);
            case 'BooleanValue':
                return this.visitBooleanValue(node as BooleanValue);
            default:
                throw new Error("Type d'instruction non reconnu : " + node.$type);
        }
    }
	visitRepeatInstruction(node : RepeatInstruction) : any{
        const initialization=this.visitVarDeclaration(node.initialization as VarDeclaration);
        const condition=this.visitAddition(node.condition as Addition);
        const next_action=this.visitAffectation(node.nextInstruction as Affectation);
        for(initialization;condition;next_action){
            this.visitBlock(node.body as Block);
        }
    }
	visitLoopInstruction(node : LoopInstruction) : any{
        const condition = this.visitAddition(node.condition as Addition);
        while(condition) {
            this.visitBlock(node.body as Block);
        }
    }
	visitConditionInstruction(node : ConditionInstruction) : any{
        const condition = this.visitAddition(node.condition as Addition);
        if(condition){
            this.visitBlock(node.body as Block);
        }else{
            for(const elseInstruction of node.elseBody) {
                this.visitInstruction(elseInstruction as Instruction);
            }
        }
    }
	visitRotateInstruction(node : RotateInstruction) : any{
        const angle = node.angle;
        switch(node.sens){
            case 'AntiClock':
                this.robot.turn(-angle);
        }
        this.robot.turn(angle);
    }
	visitSensorInstruction(node : SensorInstruction) : any{
        //Implementation pas nécessaire
    }
	visitMoveInstruction(node : MoveInstruction) : any{
        let factor=1;
        switch (node.unite) {
            case "mm":
                break;
            case "cm":
                factor *=10 ;
                break;
            case "m":
                factor *=1000;
                break;
            default:
                throw new Error("unité non connue!: " + node.unite);
        }
        switch (node.movement) {
            case "Forward":
                return  this.robot.move(this.visitAddition(node.value as Addition)*factor) ;
            case "Backward":
                return this.robot.move(this.visitAddition(node.value as Addition)*factor) ;
            case "SideLeft":
                return this.robot.side(this.visitAddition(node.value as Addition)*factor) ;
            case "SideRight":
                return this.robot.side(this.visitAddition(node.value as Addition)*factor) ;
            default:
                throw new Error("Erreur Type de mouvement non défini ");
        }
    }
	visitSetSpeedInstruction(node : SetSpeedInstruction) : any{
        let factor=1;
        switch (node.unite) {
            case "mm":
                break;
            case "cm":
                factor *=10 ;
                break;
            case "m":
                factor *=1000;
                break;
            default:
                throw new Error("unité non connue!: " + node.unite);
        }
        const distanceInMillimeter = node.speed*factor;
        this.robot.speed = distanceInMillimeter;
    }
	visitAffectation(node : Affectation) : any{
        const value=this.visitAddition(node.right as Addition);
        const name=this.visitVarCall(node.left as VarCall);
        this.variableList[name]=value;
    }
	visitAddition(node : Addition) : any{
        const left = this.visitMultiplication(node.left as Multiplication);
        const rightValues = node.right.map(operand => this.visitMultiplication(operand as Multiplication));
        const operators = node.operators;
        let compt =-1;
        let expression = left;
        for (const rightValue of rightValues) {
            compt++
            if (operators[compt] === '+') {
                expression = expression + rightValue;
            } else if (operators[compt] === '-') {
                expression = expression - rightValue;
            } else if (operators[compt] === '*') {
                expression = expression * rightValue;
            } else if (operators[compt] === '/') {
                expression = expression / rightValue;
            } else if (operators[compt] === '==') {
                return expression === rightValue;
            } else if (operators[compt] === '<') {
                return expression < rightValue;
            } else if (operators[compt] === '>') {
                return expression > rightValue;
            }
        }
        return expression;
    }
	visitMultiplication(node : Multiplication) : any{
        const left = this.visitPrimExpr(node.left as PrimExpr);
        const rightValues = node.right.map(operand => this.visitPrimExpr(operand as PrimExpr));
        const operators = node.operators;
        let compt =-1;
        let expression = left;
        for (const rightValue of rightValues) {
            compt++
            if(operators[compt]=='+'){
                expression = expression + rightValue;
            } else if(operators[compt]=='-'){
                expression = expression - rightValue;
            } else if(operators[compt]=='*'){
                expression = expression * rightValue;
            } else if(operators[compt]=='/'){
                if (rightValue == 0){
                    throw new Error("Impossible de diviser par zéro");
                }
                expression = expression / rightValue;
            } else if(operators[compt]=='=='){
                return expression === rightValue;
            } else if(operators[compt]=='<'){
                return expression < rightValue;
            } else if(operators[compt]=='>'){
                return expression > rightValue;
            }    
        }
        return expression;
    }
	visitPrimExpr(node : PrimExpr) : any{
        return this.visitInstruction(node.ExpressValue);
    }
	visitGetDistance(node : GetDistance) : any{
        const poi = this.robot.getRay().intersect(this.scene.entities);
        if (poi) {
            return poi.minus(this.robot.pos).norm();
        }
        return 9999999999;
    }
	visitGetSpeed(node : GetSpeed) : any{
        return this.robot.speed;
    }
	visitGetRotation(node : GetRotation) : any{
    }
	visitVarCall(node : VarCall) : any{
        const name = node.variable.ref!.name; // Référence au nom de la variable
        const info = this.variableList[name]; // Chercher dans la table des variables
        if (!info) {
            throw new Error(`Variable '${info}' is not defined.`);
        }
        return info.name;
    }
	visitProcCall(node : ProcCall) : any{
        const func = node.fonction.ref!;
        for(let i=0; i<node.parameters.length; i++) {
            this.variableList[func.parameters[i].name] = {
                name: func.parameters[i].name,
                type: func.parameters[i].type,
                value: this.visitInstruction(node.parameters[i] as Instruction)
            };
        }
        return this.visitFonction(func as Fonction);
    }
	visitFonction(node : Fonction) : any{
        let returnType="";
        switch(node.returnValue){
            case "boolean":
                returnType="boolean";
                break;
            case "number":
                returnType="number";
                break;
            case "Const":
                returnType="number";
                break;
            default:
                returnType="void";
        }
        this.functionList[node.name] = {
            name: node.name,
            parameters: node.parameters,
            returnType: returnType,
        };
        this.visitBlock(node.block as Block);
    }
	visitParameter(node : Parameter) : any{
        //pas Nécessaire
    }
	visitBlock(node : Block) : any{
        for(const instruction of node.instructions) {
            if(node.returnValue1) {
                return this.visitInstruction(instruction as Instruction);
            }
            this.visitInstruction(instruction as Instruction);
        }
    }
	visitGetTime(node : GetTime) : any{
        return this.scene.time;
    }
    visitValue(node : Value) : any{
        return node.value;
    }
	visitVarDeclaration(node : VarDeclaration) : any{
        const name = node.name;
        const type = node.type;
        const initialization = this.visitAddition(node.initialization as Addition);
        this.variableList[name] = {
            name: name,
            type: type,
            value: initialization
        };
    }
    visitBooleanValue(node: BooleanValue):any{
        return node.value;
    }
}

