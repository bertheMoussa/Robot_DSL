import type {  ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobotDslAstType, RobotProgram } from './generated/ast.js';
import type { RobotDslServices } from './robot-dsl-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotDslServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.RobotDslValidator;
    const checks: ValidationChecks<RobotDslAstType> = {
        RobotProgram: validator.checkUniqueDefs,    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class RobotDslValidator {
    checkUniqueDefs(robot: RobotProgram, accept: ValidationAcceptor): void {
        // create a set of visited functions
        // and report an error when we see one we've already seen
        const reported = new Set();
        robot.fonctions.forEach(f => {
            if (reported.has(f.name)) {
                accept('error',  `Function has non-unique name '${f.name}'.`,  {node: f, property: 'name'});
            }
            reported.add(f.name);
        });
    }
    /*checkPersonStartsWithCapital(person: Person, accept: ValidationAcceptor): void {
        if (person.name) {
            const firstChar = person.name.substring(0, 1);
            if (firstChar.toUpperCase() !== firstChar) {
                accept('warning', 'Person name should start with a capital.', { node: person, property: 'name' });
            }
        }
    }*/

}
