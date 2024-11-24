
import * as ASTInterfaces from '../generated/ast.js';
import {  Reference } from 'langium';

export interface Visitor{
    visitRobotProgram(node : RobotProgram) : any;
	//visitExpression(node : Expression) : any;
	visitInstruction(node : Instruction) : any;
	//visitControlStructure(node : ControlStructure) : any;
	visitRepeatInstruction(node : RepeatInstruction) : any;
	visitLoopInstruction(node : LoopInstruction) : any;
	visitConditionInstruction(node : ConditionInstruction) : any;
	//visitPrimitive(node : Primitive) : any;
	visitRotateInstruction(node : RotateInstruction) : any;
	visitSensorInstruction(node : SensorInstruction) : any;
	visitMoveInstruction(node : MoveInstruction) : any;
	visitSetSpeedInstruction(node : SetSpeedInstruction) : any;
	visitAffectation(node : Affectation) : any;
	//visitCallExpression(node : CallExpression) : any;
	visitAddition(node : Addition) : any;
	visitMultiplication(node : Multiplication) : any;
	//visitOperators(node : Operators) : any;
	visitPrimExpr(node : PrimExpr) : any;
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
    visitValue(node : Value) : any;
	visitVarDeclaration(node : VarDeclaration) : any;
    visitBooleanValue(node: BooleanValue):any;
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

/*export class Expression implements ASTInterfaces.Expression {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Primitive' | 'SetSpeedInstruction' | 'Parameter' | 'Block' | 'CallExpression' | 'Expression'
    ){}
    accept(visitor: Visitor) : any {
    }
}*/


export class Instruction implements ASTInterfaces.Instruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor( 
        public $type: 'Fonction' |'Addition'|'RepeatInstruction' | 'LoopInstruction' | 'ConditionInstruction' | 'ControlStructure' | 'RotateInstruction' | 'SensorInstruction' | 'MoveInstruction' | 'GetDistance' | 'GetRotation' | 'GetSpeed' | 'GetTime' | 'Affectation' | 'VarCall' | 'ProcCall' | 'VarDeclaration' | 'Instruction'|'Value'|'BooleanValue'
    ){}
    accept(visitor: Visitor) : any {
    }
}
export class Value implements ASTInterfaces.Value {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor( 
        public $type: 'Value',
        public value: number
    ){}
    accept(visitor: Visitor) : any {
    }
}

export class BooleanValue implements ASTInterfaces.BooleanValue {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor( 
        public $type: 'BooleanValue',
        public value: ASTInterfaces.EBoolean
    ){}
    accept(visitor: Visitor) : any {
    }
}

/*export class ControlStructure implements ASTInterfaces.ControlStructure {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'RepeatInstruction' | 'LoopInstruction' | 'ConditionInstruction',
        public body: ASTInterfaces.Block,
        public condition: ASTInterfaces.Addition
       ){}
   
    accept(visitor: Visitor) : any {
    }

}*/

export class RepeatInstruction implements ASTInterfaces.RepeatInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'RepeatInstruction',
        public body: ASTInterfaces.Block,
        public condition: ASTInterfaces.Addition,
        public initialization:ASTInterfaces.VarDeclaration,
        public nextInstruction:ASTInterfaces.Affectation){}
    accept(visitor: Visitor) : any {
    }

}

export class LoopInstruction implements ASTInterfaces.LoopInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'LoopInstruction',
        public body: ASTInterfaces.Block,
        public condition: ASTInterfaces.Addition){}
    accept(visitor: Visitor) : any {
    }

}

export class ConditionInstruction implements ASTInterfaces.ConditionInstruction {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'ConditionInstruction',
        public body: ASTInterfaces.Block,
        public condition: ASTInterfaces.Addition,
        public  elseBody: ASTInterfaces.Instruction[],
        ){}
    accept(visitor: Visitor) : any {
    }

}

/*export class Primitive implements ASTInterfaces.Primitive {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
      public  $type: 'Primitive' | 'SetSpeedInstruction'

    ){}
    accept(visitor: Visitor) : any {

    }
}*/

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
        public value: ASTInterfaces.Addition){}
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
        public  $container: ASTInterfaces.RepeatInstruction,
        public left: ASTInterfaces.VarCall,
        public right: ASTInterfaces.Addition){}
    accept(visitor: Visitor) : any {
    }
}

/*export class CallExpression implements ASTInterfaces.CallExpression {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'CallExpression'|'VarCall'|'PorcCall',
        public $container: ASTInterfaces.Affectation
    ){}
    accept(visitor: Visitor) : any {
    }
}*/

export class Addition implements ASTInterfaces.Addition {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Addition',
        public operators: ASTInterfaces.Operators[],
        public right: ASTInterfaces.Multiplication[],
        public $container: ASTInterfaces.ControlStructure | ASTInterfaces.MoveInstruction,
        public left: ASTInterfaces.Multiplication,
        ){}
    accept(visitor: Visitor) : any {
    }
}

export class Multiplication implements ASTInterfaces.Multiplication {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'Multiplication',
        public operators: ASTInterfaces.Operators[],
        public right: ASTInterfaces.PrimExpr[],
        public $container: ASTInterfaces.Addition,
        public  left: ASTInterfaces.PrimExpr,
        ){}
    accept(visitor: Visitor) : any {
    }
}

export class PrimExpr implements ASTInterfaces.PrimExpr {
    // the constructor must take all attribute of the implemented interface 
    // simply copy-paste the interface fields as public parameters
    // you can find them in generated/ast.ts
    constructor(
        public $type: 'PrimExpr',
        public ExpressValue: ASTInterfaces.Instruction,
        public numValue:number,
        public $container: ASTInterfaces.Multiplication
        ){}
    accept(visitor: Visitor) : any {
    }
}

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
        public $container: ASTInterfaces.Affectation,
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
        public parameters: ASTInterfaces.Instruction[]
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
        public parameters: ASTInterfaces.VarDeclaration[],
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
        public $container: ASTInterfaces.Fonction,
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
        public instructions: ASTInterfaces.Instruction[],
        public returnValue1:ASTInterfaces.VarCall,
){}
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
        public $container: ASTInterfaces.RepeatInstruction,
        public type: ASTInterfaces.ClasseType,
        public initialization:ASTInterfaces.Addition
){}
    accept(visitor: Visitor) : any {
    }
}

