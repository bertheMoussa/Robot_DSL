grammar RobotDsl

import "robot-dsl-types";
// Point d'entrée pour le programme du robot
entry RobotProgram returns RobotProgram:
    'program {' fonctions+=Fonction* '}';

Expression returns Expression:
    BasicArithmetics| ClasseType | Primitive | Block | Parameter | VarDeclaration | CallExpression;

// Opérations arithmétiques de base
BasicArithmetics returns BasicArithmetics:
    Addition| Multiplication|Affectation|PrimExpr;


// Instruction principale
Instruction returns Instruction:
    ControlStructure | Fonction | Expression;

// Structures de contrôle
ControlStructure returns ControlStructure:
    RepeatInstruction | LoopInstruction | IfInstruction;

// Instructions primitives
Primitive returns Primitive:
    RotateInstruction |SensorInstruction | MoveInstruction | SetSpeedInstruction;

Affectation returns Affectation:
    left=CallExpression '=' right=Expression;

Addition returns BasicArithmetics:
    Multiplication (operator=Operators right=Multiplication)*;

Multiplication returns BasicArithmetics: 
    PrimExpr (operator=Operators right=PrimExpr)*;
PrimExpr returns BasicArithmetics:
    '('Expression')'| DOUBLE |ID;

Operators returns Operators:
    Add | Minus | Mult |Div | Modulo | Equals | NotEquals | Greater | Minus | GreaterEquals | MinusEquals | And | Or | Not;

Greater returns Greater:
    '>';
Minus returns Minus:
   '<';
Equals returns Equals:
     '==';
MinusEquals returns MinusEquals:
     '<=';
GreaterEquals returns GreaterEquals:
     '>=';
And returns And:
     '&&';
Modulo returns Modulo:
     '%';
Or returns Or:
    '||';

Div returns Div:
    '/';
Add returns Add:
     '+';
Mult returns Mult:
    '*';
Sub returns Sub:
     '-';
Not returns Not:
     '!';
NotEquals returns NotEquals:
    '!=';

// Types de classe
ClasseType returns ClasseType:
    Boolean | Constant | NumberType | Time | Distance;

// Instructions de capteur
SensorInstruction returns SensorInstruction:
    GetDistance | GetTime |GetSpeed| GetRotation;

// Appel d'expression
CallExpression returns CallExpression:
    VarCall | ProcCall;

VarCall returns VarCall:
    variable=[VarDeclaration:ID];


SetSpeedInstruction returns SetSpeedInstruction:
    'setSpeed' '(' speed=DOUBLE unite=Distance ')';

// Structures de contrôle
RepeatInstruction returns RepeatInstruction:
    'repeat' condition=Addition body=Block;

LoopInstruction returns LoopInstruction:
    'loop'  condition=Addition body=Block;

IfInstruction returns IfInstruction:
    'if'  condition=Addition body=Block ('else' body=Block)?;

// Déclaration de fonction
Fonction returns Fonction:
    'let' ('void')? returnValue=ClasseType? name=ID '(' (parameters+=Parameter (',' parameters+=Parameter)*)? ')' block=Block;

// Bloc d'instructions
Block returns Block:
    '{' instructions+=Instruction* '}';

// Types de classe
Boolean returns Boolean:
    'boolean' (value=BOOLEAN)?;

Constant returns Constant:
    {Constant} 'constant' (value=DOUBLE)?;

NumberType returns NumberType:
    'number' ('-'?value=DOUBLE)?;

Time returns Time:
    'time' (time=Time)?;

Distance returns Distance:
    Mm|M|Cm;

Mm returns Mm:
     'mm';
Cm returns Cm:
     'cm';
M returns M:
    'm';

// Instructions de capteur
GetDistance returns GetDistance:
    {GetDistance} 'getDistance()';

GetTime returns GetTime:
    {GetTime} 'getTime()';

GetSpeed returns GetSpeed:
    {GetSpeed} 'getSpeed()';

GetRotation returns GetRotation:
    {GetRotation} 'getRotation()';

// Appel de procédure
ProcCall returns ProcCall:
    fonction=[Fonction:ID] '(' (parameters+=Expression (',' parameters+=Expression)*)? ')';

// Paramètre de fonction
Parameter returns Parameter:
    name=ID type=ClasseType;

// Déclaration de variable
VarDeclaration returns VarDeclaration:
    'var' type=ClasseType name=ID ('=' initialization=Expression )? ('in' Distance)? ;
// Instructions de mouvement
MoveInstruction returns MoveInstruction:
     movement=Direction value=Addition 'in' unite=Distance ;

Direction returns Direction: 
    Forward |Backward |Left |Right;
Forward returns Forward:
     'Forward';
Backward returns Backward:
    'Backward';
Left returns Left:
     'SideLeft';
Right returns Right: 
    'SideRight';

// Instructions de rotation
RotateInstruction returns RotateInstruction: //OK
    sens=RotationSens angle=DOUBLE;
// Instructions de rotation
RotationSens returns RotationSens: 
    'Clock' | 'AntiClock' ;

// Terminaux
hidden terminal WS: /\s+/;
terminal ID: /[_a-zA-Z][\w_]*/;
terminal INT returns number: /[0-9]+/;
terminal BOOLEAN returns boolean: 'true' | 'false';
terminal DOUBLE returns number: INT ('.' INT)?;
hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;

