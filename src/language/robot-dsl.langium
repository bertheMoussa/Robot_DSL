grammar RobotDsl

entry Model:
    (persons+=Person | greetings+=Greeting)*;

Person:
    'person' name=ID;

Greeting:
    'Hello' person=[Person:ID] '!';

hidden terminal WS: /\s+/;
terminal ID: /[_a-zA-Z][\w_]*/;
terminal INT returns number: /[0-9]+/;
terminal STRING: /"(\\.|[^"\\])*"|'(\\.|[^'\\])*'/;

hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;

// Interface for the Robot Program
interface RobotProgramm {
    instructions: Instruction[];
}

// Base abstract class for Instructions
interface Instruction {
}

// MoveInstruction inherits from Instruction
interface MoveInstruction extends Primitive {
    distance: Distance;
}

// ControlStructure is abstract and inherits from Instruction
interface ControlStructure extends Instruction {
    expressions: Expression[];
    name:string;
}

// SetSpeedInstruction inherits from Instruction
interface SetSpeedInstruction extends Instruction {
    speed: number;
}

// RepeatInstruction inherits from ControlStructure
interface RepeatInstruction extends ControlStructure {
    block: Block[];
}

// LoopInstruction inherits from ControlStructure
interface LoopInstruction extends ControlStructure {
    block: Block[];
}

// IfInstruction inherits from ControlStructure
interface IfInstruction extends ControlStructure {
    block: Block[];
}

// Fonction inherits from Instruction
interface Fonction extends Instruction {
    parameters:Parameter[];
    block: Block[];
    name: string;
}

// Block contains instructions
interface Block extends Expression{
    instructions: Instruction[];
}

// Expression is abstract and inherits from Instruction
interface Expression extends Instruction {}

// BasicArithmetics is abstract and inherits from Expression
interface BasicArithmetics extends Expression {
    expressions: Expression[];
}

// ClasseType is abstract and inherits from Expression
interface ClasseType extends Expression {}

// ProcCall inherits from Expression
interface ProcCall extends Expression {
    expression: Expression[];
    fonctionLinked:Fonction;
}

// Parameter inherits from Expression
interface Parameter extends Expression {
    name: string;
    type: ClasseType;
}

// Affectation inherits from Expression
interface Affectation extends Expression {}

// VarDeclaration inherits from Expression
interface VarDeclaration extends Expression {
    type:ClasseType;
}

// Arithmetic Operations inherit from BasicArithmetics
interface Div extends BasicArithmetics {}
interface Plus extends BasicArithmetics {}
interface Minus extends BasicArithmetics {}
interface Mult extends BasicArithmetics {}
interface Equals extends BasicArithmetics {}
interface Lower extends BasicArithmetics {}
interface Greater extends BasicArithmetics {}
interface Not extends BasicArithmetics {}
interface Or extends BasicArithmetics {}
interface And extends BasicArithmetics {}

// ClasseTypes for specific types
interface Boolean extends ClasseType {}
interface Constant extends ClasseType {}

// Number inherits from ClasseType
interface NumberType extends ClasseType {
    value: number;
}

// Time inherits from ClasseType
interface Time extends ClasseType {
    	time?: Time
}

// Primitive is abstract and inherits from Expression
interface Primitive extends Expression {}


// Distance is abstract and inherits from ClasseType
interface Distance extends ClasseType {
    value: number;
}

// Mn and Cm inherit from Distance
interface Mn extends Distance {}
interface Cm extends Distance {}

// RotateInstruction inherits from Primitive
interface RotateInstruction extends Primitive {
    angle: number;
}

// CensorInstruction inherits from Primitive
interface SensorInstruction extends Primitive {}
interface GetDistance extends SensorInstruction {}
interface GetTime extends SensorInstruction {}



