
type RotationSens = Rotation_clock | Rotation_antiClock;
type Rotation_clock = 'Clock';
type Rotation_antiClock = 'AntiClock';

//Type de direction
type Direction = Forward |Backward |Left |Right;
type Forward = 'Forward';
type Backward = 'Backward';
type Left = 'SideLeft';
type Right = 'SideRight';

//Types classiques
type ClasseType=BooleanType|Constant|NumberType|Time;
type BooleanType ='boolean';
type Constant='Const';
type NumberType='number';
type Time='time';

//Unités de la distance
type Distance = M |Cm |Mm;
type M = 'm';
type Cm = 'cm';
type Mm = 'mm';

type EBoolean=TrueVal|FalseVal;
type TrueVal='true';
type FalseVal='false';

//Type d'opérateurs

type Operators = Sub|Add | Minus | Mult |Div | Modulo | Equals | NotEquals | Greater | Minus | GreaterEquals | MinusEquals | And | Or | Not;
type Add = '+';
type Minus = '<';
type Mult = '*';
type Div= '/';
type Modulo = '%';
type Equals = '==';
type NotEquals = '!=';
type Greater = '>';
type Sub = '-';
type GreaterEquals = '>=';
type MinusEquals = '<=';
type And = '&&';
type Or = '||';
type Not = '!';
// Interface pour le programme Robot
interface RobotProgram {
    fonctions: Fonction[];
}
interface Value extends Instruction{
    value:number;
}
interface BooleanValue extends Instruction{
    value:EBoolean;
}
// Classe abstraite de base pour les instructions
interface Instruction {}

// Instruction de mouvement hérite de Primitive
interface MoveInstruction extends Instruction {
    unite: Distance;
    movement:Direction;
    value:Addition;
}

// Instruction de vitesse hérite de Primitive
interface SetSpeedInstruction extends Instruction {
    unite: Distance;
    speed: number;
}

// Structure de contrôle abstraite qui hérite d'Instruction
interface ControlStructure extends Instruction {
    condition:Addition;
    body:Block;

}

// Instruction de répétition hérite de ControlStructure
interface RepeatInstruction extends ControlStructure {
    initialization:VarDeclaration;
    nextInstruction:Affectation;
}

// Instruction de boucle hérite de ControlStructure
interface LoopInstruction extends ControlStructure {}

// Instruction conditionnelle hérite de ControlStructure
interface ConditionInstruction extends ControlStructure {
    elseBody:Instruction[];
}

// Déclaration de fonction hérite d'Instruction
interface Fonction extends Instruction {
    parameters: VarDeclaration[];
    block: Block;
    name: string;
    returnValue?: ClasseType;
}

// Bloc contient des instructions
interface Block extends Expression {
    instructions: Instruction[];
    returnValue1:VarCall;

}

// Expression est abstraite et hérite d'Instruction
interface Expression {}

// Appel d'expression
interface CallExpression extends Instruction {}


// ProcCall hérite d'Expression
interface ProcCall extends Instruction {
    fonction: @Fonction;
    parameters:Instruction[];
}

// VarCall hérite d'Expression
interface VarCall extends Instruction {
    variable: @VarDeclaration;
}

// Paramètre hérite d'Expression
interface Parameter extends Expression {
    name: string;
    type: ClasseType;
}

// VarDeclaration hérite d'Expression
interface VarDeclaration extends Instruction {
    type: ClasseType;
    name: string;
    initialization: Addition;
}

interface Addition extends Instruction {
    left: Multiplication;
    right: Multiplication[];
    operators: Operators[];
}
interface Multiplication {
    left: PrimExpr;
    right: PrimExpr[];
    operators: Operators[];
}
interface PrimExpr{
    ExpressValue:Instruction;
}

// Primitive est abstraite et hérite d'Expression
interface Primitive extends Expression {}
// RotateInstruction hérite de Primitive
interface RotateInstruction extends Instruction {
    angle: number;
    sens:RotationSens;
}

interface Affectation extends Instruction{
    left:VarCall;
    right:Addition
}

// Instruction de capteur hérite de Primitive
interface SensorInstruction extends Instruction {}
interface GetDistance extends SensorInstruction {}
interface GetTime extends SensorInstruction {}
interface GetRotation extends SensorInstruction{}
interface GetSpeed extends SensorInstruction{}
