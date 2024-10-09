import type { ValidationAcceptor, ValidationChecks } from 'langium';
import type { RobotDslAstType, Person } from './generated/ast.js';
import type { RobotDslServices } from './robot-dsl-module.js';

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: RobotDslServices) {
    const registry = services.validation.ValidationRegistry;
    const validator = services.validation.RobotDslValidator;
    const checks: ValidationChecks<RobotDslAstType> = {
        Person: validator.checkPersonStartsWithCapital
    };
    registry.register(checks, validator);
}

/**
 * Implementation of custom validations.
 */
export class RobotDslValidator {

    checkPersonStartsWithCapital(person: Person, accept: ValidationAcceptor): void {
        if (person.name) {
            const firstChar = person.name.substring(0, 1);
            if (firstChar.toUpperCase() !== firstChar) {
                accept('warning', 'Person name should start with a capital.', { node: person, property: 'name' });
            }
        }
    }

}
