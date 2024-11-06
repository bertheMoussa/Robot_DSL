
type RotationSens = Rotation_clock | Rotation_antiClock;
type Rotation_clock = 'Clock';
type Rotation_antiClock = 'AntiClock';

//Type de direction
type Direction = Forward |Backward |Left |Right;
type Forward = 'Forward';
type Backward = 'Backward';
type Left = 'SideLeft';
type Right = 'SideRight';


//Unités de la distance
type Distance = M |Cm |Mm;
type M = 'm';
type Cm = 'cm';
type Mm = 'mm';

//Type d'opérateurs

type Operators = Add | Minus | Mult |Div | Modulo | Equals | NotEquals | Greater | Minus | GreaterEquals | MinusEquals | And | Or | Not;
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

// Classe abstraite de base pour les instructions
interface Instruction {}

// Instruction de mouvement hérite de Primitive
interface MoveInstruction extends Primitive {
    unite: Distance;
    movement:Direction;
    value:BasicArithmetics;
}

// Instruction de mouvement hérite de Primitive
interface RightInstruction extends Primitive {
    unite: Distance;
    movement: BasicArithmetics;
}
// Instruction de mouvement hérite de Primitive
interface LeftInstruction extends Primitive {
    unite: Distance;
    movement: BasicArithmetics;
}
// Instruction de vitesse hérite de Primitive
interface SetSpeedInstruction extends Primitive {
    unite: Distance;
    speed: number;
}

// Structure de contrôle abstraite qui hérite d'Instruction
interface ControlStructure extends Instruction {
    condition:BasicArithmetics;
    body:Block;
}

// Instruction de répétition hérite de ControlStructure
interface RepeatInstruction extends ControlStructure {}

// Instruction de boucle hérite de ControlStructure
interface LoopInstruction extends ControlStructure {}

// Instruction conditionnelle hérite de ControlStructure
interface IfInstruction extends ControlStructure {}

// Déclaration de fonction hérite d'Instruction
interface Fonction extends Instruction {
    parameters: Parameter[];
    block: Block;
    name: string;
    returnValue?: ClasseType;
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
    operator:Operators; 
}
// Appel d'expression
interface CallExpression extends Expression {}

// ClasseType est abstraite et hérite d'Expression
interface ClasseType extends Expression {}

// ProcCall hérite d'Expression
interface ProcCall extends CallExpression {
    fonction: @Fonction;
    parameters:Expression[];
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
interface PrimExpr extends BasicArithmetics{}


// Types de classe spécifiques
interface Boolean extends ClasseType {
    value: boolean;
}
interface Constant extends ClasseType {
    value: number;
}

// Number hérite de ClasseType
interface NumberType extends ClasseType {
    value: number;
}

// Time hérite de ClasseType
interface Time extends ClasseType {
    time?: Time;
}

// Primitive est abstraite et hérite d'Expression
interface Primitive extends Expression {}
// RotateInstruction hérite de Primitive
interface RotateInstruction extends Primitive {
    angle: number;
    sens:RotationSens;
}


interface Affectation extends BasicArithmetics{}
// Instruction de capteur hérite de Primitive
interface SensorInstruction extends Primitive {}
interface GetDistance extends SensorInstruction {}
interface GetTime extends SensorInstruction {}
interface GetRotation extends SensorInstruction{}
interface GetSpeed extends SensorInstruction{}
