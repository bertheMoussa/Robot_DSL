grammar RobotDsl

// Point d'entrée pour le programme du robot
entry RobotProgram returns RobotProgramm:
    'program' instructions+=Instruction*;

Expression returns Expression:
    BasicArithmetics| ClasseType | Primitive | Block | Parameter | VarDeclaration | CallExpression;

// Opérations arithmétiques de base
BasicArithmetics returns BasicArithmetics:
    Addition| Multiplication|Affectation|Comparison ;


// Instruction principale
Instruction returns Instruction:
    ControlStructure | Fonction | Expression;

// Structures de contrôle
ControlStructure returns ControlStructure:
    RepeatInstruction | LoopInstruction | IfInstruction;

// Instructions primitives
Primitive returns Primitive:
    RotateInstruction | SensorInstruction | MoveInstruction | SetSpeedInstruction|Clock;

Clock returns Clock:
    'Clock' value=DOUBLE;

Affectation returns Affectation:
    left=CallExpression '=' right=Expression;

Addition returns BasicArithmetics:
    Multiplication (('+' | '-') right=Multiplication)*;

Multiplication returns BasicArithmetics: 
    PrimExpr (('*' | '/') right=PrimExpr)*;

// Comparaison (égal, inférieur, supérieur)
Comparison returns BasicArithmetics:
    left=Addition ('==' right=Addition | '<' right=Addition | '>' right=Addition)?;

PrimExpr returns BasicArithmetics:
    '('Expression')'| DOUBLE |ID;


    
//


/*

Equals returns Equals:
    left=Expression '==' right=Expression;

Lower returns Lower:
    left=Expression '<' right=Expression;

Greater returns Greater:
    left=Expression '>' right=Expression;

// Opérations unaires
Not returns Not:
    '!' expression=Expression;

Or returns Or:
    'or' '(' left=Expression ',' right=Expression ')';

And returns And:
    left=Expression 'and' right=Expression;*/

// Types de classe
ClasseType returns ClasseType:
    Boolean | Constant | NumberType | Time | Distance;

// Instructions de capteur
SensorInstruction returns SensorInstruction:
    GetDistance | GetTime;

// Appel d'expression
CallExpression returns CallExpression:
    VarCall | ProcCall;

VarCall returns VarCall:
    variable=[VarDeclaration:ID];


SetSpeedInstruction returns SetSpeedInstruction:
    'setSpeed' '(' speed=DOUBLE unite=Distance ')';

// Structures de contrôle
RepeatInstruction returns RepeatInstruction:
    'repeat' instructions+=Instruction* block=Block;

LoopInstruction returns LoopInstruction:
    'loop'  instructions+=Instruction*  block=Block;

IfInstruction returns IfInstruction:
    'if'  instructions+=Instruction*  block=Block;

// Déclaration de fonction
Fonction returns Fonction:
    'let' ('void')? return=ClasseType name=ID '(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')' block=Block;

// Bloc d'instructions
Block returns Block:
    '{' instructions+=Instruction* '}';

// Types de classe
Boolean returns Boolean:
    'boolean' (value=BOOLEAN)?;

Constant returns Constant:
    {Constant} 'constant';

NumberType returns NumberType:
    'number' (value=DOUBLE)?;

Time returns Time:
    'time' (time=Time)?;

Distance returns Distance:
    Mn | Cm;

Mn returns Mn:
    (value=DOUBLE)? 'mn';

Cm returns Cm:
    (value=DOUBLE)? 'cm';

// Instructions de rotation
RotateInstruction returns RotateInstruction:
    'setRotation' '(' angle=DOUBLE ')';

// Instructions de capteur
GetDistance returns GetDistance:
    {GetDistance} 'getDistance' '(' ')';

GetTime returns GetTime:
    {GetTime} 'getTime' '(' ')';

// Appel de procédure
ProcCall returns ProcCall:
    fonction=[Fonction:ID];

// Paramètre de fonction
Parameter returns Parameter:
    name=ID ':' type=ClasseType;

// Déclaration de variable
VarDeclaration returns VarDeclaration:
    'var' type=ClasseType name=ID ('=' initialization=Expression )? ('in' Distance)? ;

// Instructions de mouvement
MoveInstruction returns MoveInstruction:
    'Forward' movement=Addition 'in' unite=Distance ;


// Terminaux
hidden terminal WS: /\s+/;
terminal ID: /[_a-zA-Z][\w_]*/;
terminal INT returns number: /[0-9]+/;
terminal BOOLEAN returns boolean: 'true' | 'false';
terminal STRING returns string: '"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
terminal DOUBLE returns number: INT ('.' INT)?;

hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;

// Interface pour le programme Robot
interface RobotProgramm {
    instructions: Instruction[];
}

// Classe abstraite de base pour les instructions
interface Instruction {}

// Instruction de mouvement hérite de Primitive
interface MoveInstruction extends Primitive {
    unite: Distance;
    movement: BasicArithmetics;
    var?:VarCall;
}

// Instruction de vitesse hérite de Primitive
interface SetSpeedInstruction extends Primitive {
    unite: Distance;
    speed: number;
}

// Structure de contrôle abstraite qui hérite d'Instruction
interface ControlStructure extends Instruction {
    expressions: Expression[];
}

// Instruction de répétition hérite de ControlStructure
interface RepeatInstruction extends ControlStructure {
    block: Block;
    instructions: Instruction[];
}

// Instruction de boucle hérite de ControlStructure
interface LoopInstruction extends ControlStructure {
    block: Block;
    instructions: Instruction[];
}

// Instruction conditionnelle hérite de ControlStructure
interface IfInstruction extends ControlStructure {
    block: Block;
    instructions: Instruction[];
}

// Déclaration de fonction hérite d'Instruction
interface Fonction extends Instruction {
    parameters: Parameter[];
    block: Block;
    name: string;
    return?: ClasseType;
}

// Bloc contient des instructions
interface Block extends Expression {
    instructions: Instruction[];
}

// Expression est abstraite et hérite d'Instruction
interface Expression extends Instruction {}

// BasicArithmetics est abstraite et hérite d'Expression
// Utilisation d'opérandes gauche et droite au lieu d'un tableau d'expressions
interface BasicArithmetics extends Expression {
    left?: Expression;
    right?: Expression;
}
// Appel d'expression
interface CallExpression extends Expression {}

// ClasseType est abstraite et hérite d'Expression
interface ClasseType extends Expression {}

// ProcCall hérite d'Expression
interface ProcCall extends CallExpression {
    fonction: @Fonction;
}

// VarCall hérite d'Expression
interface VarCall extends CallExpression {
    variable: @VarDeclaration;
}

// Paramètre hérite d'Expression
interface Parameter extends Expression {
    name: string;
    type: ClasseType;
}

// VarDeclaration hérite d'Expression
interface VarDeclaration extends Expression {
    type: ClasseType;
    name: string;
    initialization?: Expression;
}

// Opérations arithmétiques héritent de BasicArithmetics
interface Addition extends BasicArithmetics {}
interface Multiplication extends BasicArithmetics {}

interface Not extends Comparison {
    expression: Expression; // Opération unitaire, un seul opérande
}
interface Comparison extends BasicArithmetics{}
interface Or extends BasicArithmetics {}
interface And extends BasicArithmetics {}

// Types de classe spécifiques
interface Boolean extends ClasseType {
    value: boolean;
}
interface Constant extends ClasseType {}

// Number hérite de ClasseType
interface NumberType extends ClasseType {
    value: number;
}

// Time hérite de ClasseType
interface Time extends ClasseType {
    time?: Time;
}

// Distance est abstraite et hérite de ClasseType
interface Distance extends ClasseType {
    value: number;
}

// Mn et Cm héritent de Distance
interface Mn extends Distance {}
interface Cm extends Distance {}


// Primitive est abstraite et hérite d'Expression
interface Primitive extends Expression {}
// RotateInstruction hérite de Primitive
interface RotateInstruction extends Primitive {
    angle: number;
}
interface BinExpr extends BasicArithmetics{
}
interface Clock extends Primitive{
    value:number;
}
interface Affectation extends BasicArithmetics{}
// Instruction de capteur hérite de Primitive
interface SensorInstruction extends Primitive {}
interface GetDistance extends SensorInstruction {}
interface GetTime extends SensorInstruction {}

/**
 * // Point d'entrée pour une définition
Definition: 
    'def' name=ID ':' expr=Expression;

// Expression générale
Expression:
    Addition; // l'addition est le point de départ pour les opérations binaires

// Addition et autres opérations binaires
Addition infers Expression:
    left=Multiplication ('+' right=Addition | '-' right=Addition)?;

// Multiplication et autres opérations binaires
Multiplication infers Expression:
    left=Comparison ('*' right=Multiplication | '/' right=Multiplication)?;

// Comparaison (égal, inférieur, supérieur, etc.)
Comparison infers Expression:
    left=Primary ('==' right=Comparison | '<' right=Comparison | '>' right=Comparison)?;

Primary infers Expression:
    '(' Expression ')' | {Literal} value=NUMBER;

// Terminales et autres
terminal ID: /[_a-zA-Z][\w_]*/;
