import { CompilerVistor } from '../language/semantics/complier/compiler.js';
import { InterpreterImpl } from '../language/semantics/interpreter/interpreter.js';
import { RobotProgram } from '../language/semantics/visitor.js';


export function arduinoCodeGenerator(robot: RobotProgram): String {
    const visitor = new CompilerVistor();
    return robot.accept(visitor);
}

export function generateCmds(robot: RobotProgram, sceneWidth?: number, sceneHeight?:number): Object[] {
    const visitor = new InterpreterImpl(sceneWidth, sceneHeight);
    return robot.accept(visitor)
}