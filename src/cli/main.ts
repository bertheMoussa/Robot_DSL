import { Command } from 'commander';
import { RobotDslLanguageMetaData } from '../language/generated/module.js';
import { createRobotDslServices } from '../language/robot-dsl-module.js';
import { extractAstNode } from './cli-util.js';
import { NodeFileSystem } from 'langium/node';
import { arduinoCodeGenerator } from '../generator/generator.js';
import { RobotProgram } from '../language/semantics/visitor.js';

export const compile = async (fileName: string): Promise<void> => {
    const services = createRobotDslServices(NodeFileSystem).RobotDsl;
    const model = await extractAstNode<RobotProgram>(fileName, services);
    const arduinoCode = arduinoCodeGenerator(model);
    console.log(arduinoCode);
};

export type GenerateOptions = {
    destination?: string;
}

export default function(): void {
    const program = new Command();

    program
        // eslint-disable-next-line @typescript-eslint/no-var-requires
        .version("0.0.1");

    const fileExtensions = RobotDslLanguageMetaData.fileExtensions.join(', ');
    program
        .command('compile')
        .argument('<file>', `source file (possible file extensions: ${fileExtensions})`)
        .option('-d, --destination <dir>', 'destination directory of generating')
        .description('generates JavaScript code that prints "Hello, {name}!" for each greeting in a source file')
        .action(compile);

    program.parse(process.argv);
}
