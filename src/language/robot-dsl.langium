grammar RobotDsl

import "robot-dsl-types";
// Point d'entrée pour le programme du robot
entry RobotProgram returns RobotProgram:
    'program{' fonctions+=Fonction* '}';

Expression returns Expression:
    Operators|ClasseType |Primitive |Block |Parameter |Fonction;

// Instruction principale
Instruction returns Instruction:
     ControlStructure|VarCall|ProcCall| CallExpression|Affectation|Value|VarDeclaration|MoveInstruction|RotateInstruction|SetSpeedInstruction|GetSpeed|GetDistance|GetTime|Value|BooleanValue;

// Structures de contrôle
ControlStructure returns ControlStructure:
    RepeatInstruction | LoopInstruction | ConditionInstruction;

// Instructions primitives
Primitive returns Primitive:
    RotateInstruction |SensorInstruction | MoveInstruction | SetSpeedInstruction;


Value returns Value:
	value=DOUBLE;

BooleanValue returns BooleanValue:
    value=EBoolean;

EBoolean returns EBoolean:
    TrueVal|FalseVal;
TrueVal returns TrueVal:
    'true';
FalseVal returns FalseVal:
    'false';

Affectation returns Affectation:
    left=VarCall '=' right=Addition;

Addition returns Addition:
    left=Multiplication (operators+=Operators right+=Multiplication)*;

Multiplication returns Multiplication: 
    left=PrimExpr (operators+=Operators right+=PrimExpr)*;

PrimExpr returns PrimExpr:
    ExpressValue=Instruction;


Operators returns Operators:
   Sub|Add | Minus | Mult |Div | Modulo | Equals | NotEquals | Greater | Minus | GreaterEquals | MinusEquals | And | Or | Not;

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
    BooleanType | Constant | NumberType | Time;

Constant returns Constant:
    'Const';
BooleanType returns BooleanType:
    'boolean';
NumberType returns NumberType:
    'number';
Time returns Time:
    'time';
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
    'for' '(' initialization=VarDeclaration ';' condition=Addition ';' nextInstruction=Affectation ')' body=Block;

LoopInstruction returns LoopInstruction:
    'loop'  '('condition=Addition')' body=Block;

ConditionInstruction returns ConditionInstruction:
    'if' '('  condition=Addition ')' body=Block ('else{' elseBody+=Instruction* '}')?;

// Déclaration de fonction
Fonction returns Fonction:
    'let' ('void')? returnValue=ClasseType? name=ID '(' (parameters+=VarDeclaration (',' parameters+=VarDeclaration)*)? ')' block=Block;

// Bloc d'instructions
Block returns Block:
    '{' instructions+=Instruction* ('return' returnValue1=VarCall)?'}';

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
    fonction=[Fonction:ID] '(' (parameters+=Instruction (',' parameters+=Instruction)*)? ')';

// Paramètre de fonction
Parameter returns Parameter:
    name=ID type=ClasseType;

// Déclaration de variable
VarDeclaration returns VarDeclaration:
    ('var')? type=ClasseType name=ID ('=' initialization=Addition)? ('in' Distance)? ;
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
terminal DOUBLE returns number: ('-')?INT ('.' INT)?;
hidden terminal ML_COMMENT: /\/\*[\s\S]*?\*\//;
hidden terminal SL_COMMENT: /\/\/[^\n\r]*/;

