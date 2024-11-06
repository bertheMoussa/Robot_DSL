
import * as ASTInterfaces from '../generated/ast.js';
import { AstNode, Reference } from 'langium';

export interface Visitor{
    visitRobotProgram(node : RobotProgram) : any;
	visitExpression(node : Expression) : any;
	visitBasicArithmetics(node : BasicArithmetics) : any;
	visitInstruction(node : Instruction) : any;
	visitControlStructure(node : ControlStructure) : any;
	visitRepeatInstruction(node : RepeatInstruction) : any;
	visitLoopInstruction(node : LoopInstruction) : any;
	visitIfInstruction(node : IfInstruction) : any;
	visitPrimitive(node : Primitive) : any;
	visitRotateInstruction(node : RotateInstruction) : any;
	visitSensorInstruction(node : SensorInstruction) : any;
	visitMoveInstruction(node : MoveInstruction) : any;
	visitSetSpeedInstruction(node : SetSpeedInstruction) : any;
	visitAffectation(node : Affectation) : any;
	visitCallExpression(node : CallExpression) : any;
	visitAddition(node : Addition) : any;
	visitMultiplication(node : Multiplication) : any;
	//visitOperators(node : Operators) : any;
	visitPrimExpr(node : PrimExpr) : any;
	visitClasseType(node : ClasseType) : any;
	//visitBoolean(node : Boolean) : any;
	visitConstant(node : Constant) : any;
	visitNumberType(node : NumberType) : any;
	//visitDistance(node : Distance) : any;
	visitGetDistance(node : GetDistance) : any;
	visitGetSpeed(node : GetSpeed) : any;
	visitGetRotation(node : GetRotation) : any;
	visitVarCall(node : VarCall) : any;
	visitProcCall(node : ProcCall) : any;
	visitFonction(node : Fonction) : any;
	visitParameter(node : Parameter) : any;
	visitBlock(node : Block) : any;
	//visitTime(node : Time) : any;
	visitGetTime(node : GetTime) : any;
	visitVarDeclaration(node : VarDeclaration) : any;
	//visitDirection(node : Direction) : any;
	//visitRotationSens(node : RotationSens) : any;
}


export class RobotProgram implements ASTInterfaces.RobotProgram {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'RobotProgram',
        public fonctions: ASTInterfaces.Fonction[]){}

    accept(visitor: Visitor) : any {
    }

}

export class Expression implements ASTInterfaces.Expression {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'BasicArithmetics' | 'ClasseType' | 'Primitive' | 'Block' | 'Parameter' | 'VarDeclaration' | 'CallExpression'
    ){}
    accept(visitor: Visitor) : any {
    }
}

export class BasicArithmetics implements ASTInterfaces.BasicArithmetics {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Addition' | 'Multiplication' | 'Affectation' | 'PrimExpr',
        public operator: ASTInterfaces.Operators,
        public left: ASTInterfaces.Expression,
        public right: ASTInterfaces.Expression ){}
    accept(visitor: Visitor) : any {

    }

}

export class Instruction implements ASTInterfaces.Instruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'ControlStructure' | 'Fonction' | 'Expression'){}
    accept(visitor: Visitor) : any {
    }
}

export class ControlStructure implements ASTInterfaces.ControlStructure {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'RepeatInstruction' | 'LoopInstruction' | 'IfInstruction',
        public body: ASTInterfaces.Block,
        public condition: ASTInterfaces.BasicArithmetics){}
    accept(visitor: Visitor) : any {
    }

}

export class RepeatInstruction implements ASTInterfaces.RepeatInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'RepeatInstruction',
        public  body: ASTInterfaces.Block,
        public condition: ASTInterfaces.BasicArithmetics){}
    accept(visitor: Visitor) : any {
    }

}

export class LoopInstruction implements ASTInterfaces.LoopInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'LoopInstruction',
        public  body: ASTInterfaces.Block,
        public condition: ASTInterfaces.BasicArithmetics){}
    accept(visitor: Visitor) : any {
    }

}

export class IfInstruction implements ASTInterfaces.IfInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'IfInstruction',
        public body: ASTInterfaces.Block,
        public condition: ASTInterfaces.BasicArithmetics){}
    accept(visitor: Visitor) : any {
    }

}

export class Primitive implements ASTInterfaces.Primitive {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'RotateInstruction' | 'SensorInstruction' | 'MoveInstruction' | 'SetSpeedInstruction'){}
    accept(visitor: Visitor) : any {

    }
}

export class RotateInstruction implements ASTInterfaces.RotateInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'RotateInstruction',
        public angle: number,
        public sens: ASTInterfaces.RotationSens 
    ){}
    accept(visitor: Visitor) : any {

    }
}

export class SensorInstruction implements ASTInterfaces.SensorInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'GetDistance' | 'GetTime' | 'GetSpeed' | 'GetRotation'){}
    accept(visitor: Visitor) : any {

    }
}

export class MoveInstruction implements ASTInterfaces.MoveInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'MoveInstruction',
        public  movement: ASTInterfaces.Direction,
        public unite: ASTInterfaces.Distance,
        public value: ASTInterfaces.BasicArithmetics){}
    accept(visitor: Visitor) : any {
        
    }
}

export class SetSpeedInstruction implements ASTInterfaces.SetSpeedInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'SetSpeedInstruction',
        public speed: number,
        public unite: ASTInterfaces.Distance){}
    accept(visitor: Visitor) : any {
    }
}

export class Affectation implements ASTInterfaces.Affectation {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Affectation',
        public operator: ASTInterfaces.Operators,
        public left: ASTInterfaces.Expression,
        public right: ASTInterfaces.Expression){}
    accept(visitor: Visitor) : any {
    }
}

export class CallExpression implements ASTInterfaces.CallExpression {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'VarCall' | 'ProcCall'){}
    accept(visitor: Visitor) : any {
    }
}

export class Addition implements ASTInterfaces.Addition {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Addition',
        public operator: ASTInterfaces.Operators,
        public left?: ASTInterfaces.Expression,
        public right?: ASTInterfaces.Expression){}
    accept(visitor: Visitor) : any {
    }
}

export class Multiplication implements ASTInterfaces.Multiplication {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Multiplication',
        public operator: ASTInterfaces.Operators,
        public left?: ASTInterfaces.Expression,
        public right?: ASTInterfaces.Expression){}
    accept(visitor: Visitor) : any {
    }
}

export class PrimExpr implements ASTInterfaces.PrimExpr {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'PrimExpr',
        public operator: ASTInterfaces.Operators,
        public left?: ASTInterfaces.Expression,
        public right?: ASTInterfaces.Expression){}
    accept(visitor: Visitor) : any {
    }
}

export class ClasseType implements ASTInterfaces.ClasseType {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'Boolean' | 'Constant' | 'NumberType' | 'Time' ){}
    accept(visitor: Visitor) : any {
    }
}

export class Boolean implements ASTInterfaces.Boolean {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Boolean',
        public value: boolean
    ){}
    accept(visitor: Visitor) : any {
    }
}

export class Constant implements ASTInterfaces.Constant {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Constant',
        public value: number){}
    accept(visitor: Visitor) : any {
    }
}

export class NumberType implements ASTInterfaces.NumberType {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'NumberType',
        public value: number){}
    accept(visitor: Visitor) : any {
    }
}

/*export class Distance implements ASTInterfaces.Distance {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'Distance'){}
    accept(visitor: Visitor) : any {}
}*/

export class GetDistance implements ASTInterfaces.GetDistance {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'GetDistance'){}
    accept(visitor: Visitor) : any {
    }
}

export class GetSpeed implements ASTInterfaces.GetSpeed {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'GetSpeed'){}
    accept(visitor: Visitor) : any {
    }
}

export class GetRotation implements ASTInterfaces.GetRotation {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'GetRotation'){}
    accept(visitor: Visitor) : any {
    }
}

export class VarCall implements ASTInterfaces.VarCall {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'VarCall',
        public variable: Reference<ASTInterfaces.VarDeclaration>
    ){}
    accept(visitor: Visitor) : any {
    }
}

export class ProcCall implements ASTInterfaces.ProcCall {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'ProcCall',
        public fonction: Reference<ASTInterfaces.Fonction>,
        public parameters: ASTInterfaces.Expression[]
){}
    accept(visitor: Visitor) : any {
    }
}

export class Fonction implements ASTInterfaces.Fonction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Fonction',
        public $container: ASTInterfaces.RobotProgram,
        public block: ASTInterfaces.Block,
        public name: string,
        public parameters: ASTInterfaces.Parameter[],
        public returnValue?: ASTInterfaces.ClasseType ){}
    accept(visitor: Visitor) : any {

    }

}

export class Parameter implements ASTInterfaces.Parameter {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Parameter',
        public  $container: ASTInterfaces.Fonction,
        public name: string,
        public type: ASTInterfaces.ClasseType){}
    accept(visitor: Visitor) : any {
    }
}

export class Block implements ASTInterfaces.Block {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Block',
        public  $container: ASTInterfaces.Fonction | ASTInterfaces.ControlStructure,
        public instructions: ASTInterfaces.Instruction[]
){}
    accept(visitor: Visitor) : any {
    }
}

export class Time implements ASTInterfaces.Time {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Time',
        public $container: ASTInterfaces.Time,
        public time?: ASTInterfaces.Time){}
    accept(visitor: Visitor) : any {
    }
}

export class GetTime implements ASTInterfaces.GetTime {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'GetTime'){}
    accept(visitor: Visitor) : any {
    }
}

export class VarDeclaration implements ASTInterfaces.VarDeclaration {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'VarDeclaration',
        public name: string,
        public type: ASTInterfaces.ClasseType,
        public initialization: ASTInterfaces.Expression
){}
    accept(visitor: Visitor) : any {
    }
}

/*export class Direction implements ASTInterfaces.Direction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'Direction'){}
    accept(visitor: Visitor) : any {}
}*/

/*export class RotationSens implements ASTInterfaces.RotationSens {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(public $type: 'RotationSens'){}
    accept(visitor: Visitor) : any {}
}*/

export function NodeAcception(node: AstNode, visitor: Visitor): any {
    switch (node.$type) {
        case 'RobotProgram':
            return (node as RobotProgram).accept(visitor);
        case 'Expression':
            return (node as Expression).accept(visitor);
        case 'BasicArithmetics':
            return (node as BasicArithmetics).accept(visitor);
        case 'Instruction':
            return (node as Instruction).accept(visitor);
        case 'ControlStructure':
            return (node as ControlStructure).accept(visitor);
        case 'RepeatInstruction':
            return (node as RepeatInstruction).accept(visitor);
        case 'LoopInstruction':
            return (node as LoopInstruction).accept(visitor);
        case 'IfInstruction':
            return (node as IfInstruction).accept(visitor);
        case 'Primitive':
            return (node as Primitive).accept(visitor);
        case 'RotateInstruction':
            return (node as RotateInstruction).accept(visitor);
        case 'GetTime':
            return (node as GetTime).accept(visitor);
        case 'SensorInstruction':
            return (node as SensorInstruction).accept(visitor);
        case 'MoveInstruction':
            return (node as MoveInstruction).accept(visitor);
        case 'SetSpeedInstruction':
            return (node as SetSpeedInstruction).accept(visitor);
        case 'Affectation':
            return (node as Affectation).accept(visitor);
        case 'CallExpression':
            return (node as CallExpression).accept(visitor);
        case 'Addition':
            return (node as Addition).accept(visitor);
        case 'Multiplication':
            return (node as Multiplication).accept(visitor);
        case 'PrimExpr':
            return (node as PrimExpr).accept(visitor);
        case 'ClasseType':
            return (node as ClasseType).accept(visitor);
        /*case 'Boolean':
            return (node as Boolean).accept(visitor);*/
        case 'Constant':
            return (node as Constant).accept(visitor);
        case 'NumberType':
            return (node as NumberType).accept(visitor);
        case 'GetDistance':
            return (node as GetDistance).accept(visitor);
        case 'GetSpeed':
            return (node as GetSpeed).accept(visitor);
        case 'GetRotation':
            return (node as GetRotation).accept(visitor);
        case 'VarCall':
            return (node as VarCall).accept(visitor);
        case 'ProcCall':
            return (node as NumberType).accept(visitor);
        case 'Fonction':
            return (node as Fonction).accept(visitor);
        case 'Parameter':
            return (node as Parameter).accept(visitor);
        case 'Block':
            return (node as Block).accept(visitor);
        case 'GetTime':
            return (node as GetTime).accept(visitor);
        case 'Time':
            return (node as Time).accept(visitor);
        case 'VarDeclaration':
            return (node as VarDeclaration).accept(visitor);
        default:
            throw new Error(`Unknown node type ${node.$type}`);
    } 
}
