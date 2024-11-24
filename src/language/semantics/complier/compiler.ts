import { Addition, Affectation, Block, Fonction, GetDistance, GetRotation, GetSpeed, GetTime, ConditionInstruction, Instruction, LoopInstruction, MoveInstruction, Multiplication, Parameter, PrimExpr, ProcCall, RepeatInstruction, RobotProgram, RotateInstruction, SensorInstruction, SetSpeedInstruction, VarCall, VarDeclaration,Value } from "../../generated/ast.js";
import { OMNi_INITIALIZER } from "./omni_initializer.js";
import { BooleanValue, Visitor } from "../visitor.js";
export class CompilerVistor implements Visitor {

    private useful_functions=`
        void forward_advance(int distance) {
            Omni.setCarAdvance(Omni.getCarSpeedMMPS());
            Omni.delayMS(distance/Omni.getCarSpeedMMPS()*1000);
            Omni.setCarStop();
        }

        void backward_advance(int distance) {
            Omni.setCarBackoff(Omni.getCarSpeedMMPS());
            Omni.delayMS(distance/Omni.getCarSpeedMMPS()*1000);
            Omni.setCarStop();
        }

        void left_advance(int distance) {
            Omni.setCarLeft(Omni.getCarSpeedMMPS());
            Omni.delayMS(distance/Omni.getCarSpeedMMPS()*1000);
            Omni.setCarStop();
        }

        void right_advance(int distance) {
            Omni.setCarRight(Omni.getCarSpeedMMPS());
            Omni.delayMS(distance/Omni.getCarSpeedMMPS()*1000);
            Omni.setCarStop();
        }

        void rotation(int angle) {
            if (angle > 0) {
                Omni.setCarRotateRight(Omni.getCarSpeedMMPS());
            } else {
                Omni.setCarRotateLeft(Omni.getCarSpeedMMPS());
            }
    
            int circumference = wheel1.getCirMM();
            int distance = (angle / 360.0) * circumference;
            int waitTime = (distance / Omni.getCarSpeedMMPS()) * 1000;
            Omni.delayMS(timeToWait);
            Omni.setCarStop();
        }
`
    private arduinoCode: string = OMNi_INITIALIZER+'\n'+this.useful_functions+'\n';


    visitRobotProgram(node : RobotProgram) : any{
        node.fonctions.forEach((functionDec) => this.arduinoCode += this.visitFonction(functionDec as Fonction) + "\n");
        return this.arduinoCode;
    }
    visitInstruction(node: Instruction): any {
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
                case 'SensorInstruction':
                    return this.visitSensorInstruction(node as SensorInstruction);
                case 'MoveInstruction':
                    return this.visitMoveInstruction(node as MoveInstruction);
                case 'GetDistance':
                    return this.visitGetDistance(node as GetDistance);
                case 'GetRotation':
                    return this.visitGetRotation(node as GetRotation);
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
    visitValue(node: Value) {
        return node.value;
    }
    visitBooleanValue(node: BooleanValue) {
        switch(node.value){
            case 'true':
                return true;
            case 'false':
                return false;
            default:
                throw new Error("Valeur booléenne non reconnue : " + node.value);
        }
    }
        
	visitRepeatInstruction(node : RepeatInstruction) : any{
        //adapter en boucle for
        return "\tfor("+this.visitVarDeclaration(node.initialization as VarDeclaration)+";"+this.visitAddition(node.condition as Addition)+";"
                +this.visitAffectation(node.nextInstruction as Affectation)+")\n"+this.visitBlock(node.body as Block);
    }
	visitLoopInstruction(node : LoopInstruction) : any{
       return "\twhile (" + this.visitAddition(node.condition as Addition) + ")\n" 
       +this.visitBlock(node.body as Block);
    }
	visitConditionInstruction(node : ConditionInstruction) : any{
        let ifStatement="\tif("+this.visitAddition(node.condition as Addition)+")\n"+this.visitBlock(node.body as Block);
        let elseStatement="";
        if(node.elseBody.length>0){
            elseStatement+="\telse"+"{\n"+node.elseBody.map(statement => "\t"+this.visitInstruction(statement as Instruction) + ";\n").join("")+ "\t}\n";
        }
        
        return ifStatement+elseStatement;
    }
	visitRotateInstruction(node : RotateInstruction) : any{
        return "rotation(" + node.angle + ")";
    }
	visitSensorInstruction(node : SensorInstruction) : any{
        switch (node.$type) {
            case "GetTime":
                this.visitGetTime(node as GetTime);
                break;
            case "GetSpeed":
                this.visitGetSpeed(node as GetSpeed);
                break;
            default:
                throw new Error("unité non connue!: ");
        }
    }
	visitMoveInstruction(node : MoveInstruction) : any{
        let factor="";
        switch (node.unite) {
            case "mm":
                factor = "";
                break;
            case "cm":
                factor = " * 10";
                break;
            case "m":
                factor = " * 1000";
                break;
            default:
                throw new Error("unité non connue!: " + node.unite);
        }
        switch (node.movement) {
            case "Forward":
                return "forward_advance(" + this.visitAddition(node.value) + factor + ")";
            case "Backward":
                return "backward_advance("+ this.visitAddition(node.value) + factor + ")";
            case "SideLeft":
                return "left_advance(" + this.visitAddition(node.value) + factor + ")";
            case "SideRight":
                return "right_advance(" + this.visitAddition(node.value) + factor + ")";
            default:
                throw new Error("Erreur Type de mouvement non défini ");
        }
    }
    // A revoir
	visitSetSpeedInstruction(node : SetSpeedInstruction) : any{
        /*let factor="";
        switch (node.unite) {
            case "mm":
                factor = "";
                break;
            case "cm":
                factor = " * 10";
                break;
            case "m":
                factor = " * 1000";
                break;
            default:
                throw new Error("unité non connue!: " + node.unite);
        }*/
        return "Omni.setCarSpeedMMPS(" + node.speed + ")";
    }
	visitAffectation(node : Affectation) : any{
        return  this.visitVarCall(node.left as VarCall)+"="+this.visitAddition(node.right as Addition);
    }
	visitAddition(node : Addition) : any{
        const left = this.visitMultiplication(node.left as Multiplication);
        const rightValues = node.right.map(operand => this.visitMultiplication(operand as Multiplication));
        const operators = node.operators;
        let compt =-1;
        let expression = left;
        for (const rightValue of rightValues) {
            compt++
            expression = expression + operators[compt] + rightValue;
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
            expression = expression + operators[compt] + rightValue;
        }
        return expression;
    }
	//visitOperators(node : Operators) : any;
	visitPrimExpr(node : PrimExpr) : any{
        //revoir sa definition dans la grammaire
        return this.visitInstruction(node.ExpressValue);

    }
	//visitDistance(node : Distance) : any;
	visitGetDistance(node : GetDistance) : any{

    }
	visitGetSpeed(node : GetSpeed) : any{
        return "Omni.getCarSpeedMMPS()";
    }
	visitGetRotation(node : GetRotation) : any{
        return "get_rotation";
    }
	visitVarCall(node : VarCall) : any{
        return node.variable.ref?.name;
    }
	visitProcCall(node : ProcCall) : any{
        //Parametres varCall
        return node.fonction.ref?.name + "(" + node.parameters.map((variableRef) => this.visitInstruction(variableRef)).join(", ") + ")";
    }
	visitFonction(node : Fonction) : any{
        let returnedType="";
        switch (node.returnValue){
            case "number":
                returnedType= "float";
                break;
            case "boolean":
                returnedType= "bool";
                break;
            case "Const":
                returnedType= "const float";
                break;
            default:
                returnedType= "void";
        }
        return returnedType+" "+node.name+"("+
        node.parameters.map(parameter => this.visitVarDeclaration(parameter)).join(", ") + ")"
        +this.visitBlock(node.block);
    }
	visitParameter(node : Parameter) : any{
        let returnedType="";
        switch (node.type){
            case "number":
                returnedType= "float";
                break;
            case "boolean":
                returnedType= "bool";
                break;
            case "Const":
                returnedType= "const float";
                break;
        }
        return returnedType + " " + node.name
    }
	visitBlock(node: Block): any {
        // Commence le bloc
        let result = "\t{\n";
        // Parcours des instructions
        result += node.instructions
            .map(statement => {
                if (
                    statement.$type === "ConditionInstruction" || 
                    statement.$type === "RepeatInstruction" || 
                    statement.$type === "LoopInstruction"
                ) {
                    // Instructions complexes
                    return this.visitInstruction(statement) + "\n";
                } else {
                    // Instructions simples
                    return "\t" + this.visitInstruction(statement) + ";\n";
                }
            })
            .join(""); // Concatène toutes les instructions
    
        // Ajoute un seul `return` à la fin du bloc si nécessaire
        if (node.returnValue1) {
            result += "\treturn " + this.visitVarCall(node.returnValue1 as VarCall) + ";\n";
        }
    
        // Ferme le bloc
        result += "\t}\n";
    
        return result;
    }
    
    
	visitGetTime(node : GetTime) : any{
        return "millis()";
    }
	visitVarDeclaration(node : VarDeclaration) : any{
        let initializer="";
        let returnedType="";
        switch (node.type){
            case "number":
                returnedType= "float";
                break;
            case "boolean":
                returnedType= "bool";
                break;
            case "Const":
                returnedType= "const float";
                break;
        }
        if(node.initialization){
            initializer=" = "+this.visitAddition(node.initialization as Addition);
        }
        return returnedType+" "+node.name+initializer;
    }
}