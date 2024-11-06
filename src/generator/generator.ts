import { CompilerVistor } from '../language/semantics/complier/compiler.js';
import { RobotProgram } from '../language/semantics/visitor.js';

/**
 * Generates Arduino code from a RobotDsl Model
 * @param robot Model to generate Arduino code from
 * @returns Generated Arduino code that captures the program's intent
 */
export function arduinoCodeGenerator(robot: RobotProgram): String {
    const visitor = new CompilerVistor();
    return robot.accept(visitor);
}