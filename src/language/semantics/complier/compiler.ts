import { Addition, Affectation, BasicArithmetics, Block, CallExpression, ClasseType, Constant, ControlStructure, Expression, Fonction, GetDistance, GetRotation, GetSpeed, GetTime, IfInstruction, Instruction, LoopInstruction, MoveInstruction, Multiplication, NumberType, Parameter, PrimExpr, Primitive, ProcCall, RepeatInstruction, RobotProgram, RotateInstruction, SensorInstruction, SetSpeedInstruction, VarCall, VarDeclaration } from "../../generated/ast.js";
import { OMNi_INITIALIZER } from "./omni_initializer.js";
import { Visitor, NodeAcception } from "../visitor.js";
export class CompilerVistor implements Visitor {

    //private pathOutputFile: string = "files/generatedCode.txt"; 
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
`;

    private arduinoCode: string = OMNi_INITIALIZER+'\n'+this.useful_functions+'\n';


    visitRobotProgram(node : RobotProgram) : any{
        node.fonctions.forEach((functionDec) => this.arduinoCode += NodeAcception(functionDec,this) + "\n");
        return this.arduinoCode;
    }

	visitExpression(node : Expression) : any{
    }
	visitBasicArithmetics(node : BasicArithmetics) : any{
    }
	visitInstruction(node : Instruction) : any{

    }
	visitControlStructure(node : ControlStructure) : any{
        switch (node.$type) {
            case "LoopInstruction":
                this.visitLoopInstruction(node as LoopInstruction);
                break;
            case "IfInstruction":
                this.visitIfInstruction(node as IfInstruction);
                break;
            case "RepeatInstruction":
                this.visitRepeatInstruction(node as RepeatInstruction)
            default:
                throw new Error("Pas de structure de control ");
    }
}
	visitRepeatInstruction(node : RepeatInstruction) : any{
        //adapter en boucle for
    }
	visitLoopInstruction(node : LoopInstruction) : any{
       return "while (" + NodeAcception(node.condition,this) + ")\n" 
       +NodeAcception(node.body,this);
    }
	visitIfInstruction(node : IfInstruction) : any{
        return "if("+NodeAcception(node.condition,this)+")\n"+NodeAcception(node.body,this);
    }
	visitPrimitive(node : Primitive) : any{

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
                return "forward_advance(" + NodeAcception(node.value,this) + factor + ")";
            case "Backward":
                return "backward_advance("+ NodeAcception(node.value,this) + factor + ")";
            case "SideLeft":
                return "left_advance(" + NodeAcception(node.value,this) + factor + ")";
            case "SideRight":
                return "right_advance(" + NodeAcception(node.value,this) + factor + ")";
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
        return "Omni.setCarSpeedMMPS(" + node.speed + ")\n";
    }
	visitAffectation(node : Affectation) : any{
        return  "x=test"+";";
    }
	visitCallExpression(node : CallExpression) : any{
        switch (node.$type) {
            case "ProcCall":
                return this.visitProcCall(node as ProcCall)
            case "VarCall":
                return this.visitVarCall(node as VarCall)
            default:
                throw new Error("Pas d'appel!: " );
        }
    }
	visitAddition(node : Addition) : any{

    }
	visitMultiplication(node : Multiplication) : any{

    }
	//visitOperators(node : Operators) : any;
	visitPrimExpr(node : PrimExpr) : any{
        //revoir sa definition dans la grammaire

    }
	visitClasseType(node : ClasseType) : any{

    }
	/*visitBoolean(node : Boolean) : any{

    }*/
	visitConstant(node : Constant) : any{
        return node.value;
    }
	visitNumberType(node : NumberType) : any{
        return node.value;
    }
	//visitDistance(node : Distance) : any;
	visitGetDistance(node : GetDistance) : any{

    }
	visitGetSpeed(node : GetSpeed) : any{
        return "Omni.getCarSpeedMMPS()";
    }
	visitGetRotation(node : GetRotation) : any{
        //this.arduinoCode+="get_rotation";
    }
	visitVarCall(node : VarCall) : any{
        return node.variable.ref;
    }
	visitProcCall(node : ProcCall) : any{
        //Parametres varCall
        return node.fonction.ref + "(" + node.parameters.map((variableRef) => NodeAcception(variableRef,(this))).join(", ") + ")";
    }
	visitFonction(node : Fonction) : any{

    }
	visitParameter(node : Parameter) : any{
        return NodeAcception(node.type,this) + " " + node.name
    }
	visitBlock(node : Block) : any{
        return "{\n"+node.instructions.map(instruction => NodeAcception(instruction, this) + ";\n").join("") + "}\n"
    }
	/*visitTime(node : Time) : any{
        return NodeAcception(node.time,this);
    }*/
	visitGetTime(node : GetTime) : any{
        return "millis()";
    }
	visitVarDeclaration(node : VarDeclaration) : any{
        return NodeAcception(node.type,this)+" "+node.name+";";
    }
}