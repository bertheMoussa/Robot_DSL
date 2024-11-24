import { AstNode, LangiumServices,EmptyFileSystem, LangiumDocument } from "langium";
import { URI } from "vscode-uri";
import { createRobotDslServices } from "../language/robot-dsl-module.js";
import { RobotProgram } from "../language/semantics/visitor.js";
import { generateCmds } from "../generator/generator.js";
import chalk from "chalk";

 async function extractAstNodeFromString<T extends AstNode>(content: string, services: LangiumServices): Promise<T> {
    // create a document from a string instead of a file
    const doc = services.shared.workspace.LangiumDocumentFactory.fromString(content, URI.parse('memory://minilogo.document'));
    // proceed with build & validation
    await services.shared.workspace.DocumentBuilder.build([doc], { validation:true });
    // get the parse result (root of our AST)
    return doc.parseResult?.value as T;
}

async function extractDocumentFromString(content: string, services: LangiumServices): Promise<LangiumDocument> {
    const document = services.shared.workspace.LangiumDocumentFactory.fromString(content, URI.parse('memory://minilogo.document'));
    await services.shared.workspace.DocumentBuilder.build([document], { validation: true });
    const validationErrors = (document.diagnostics ?? []).filter(e => e.severity === 1);
    if (validationErrors.length > 0) {
        console.error(chalk.red('There are validation errors:'));
    }
    return document;
}


export async function parseAndGenerate (robotProgram: any): Promise<Object[]> {
    const program = robotProgram[0];
    const sceneWidth = robotProgram[1];
    const sceneHeight = robotProgram[2];
    const services = createRobotDslServices(EmptyFileSystem).RobotDsl;;
    const model = await extractAstNodeFromString<RobotProgram>(program, services);
    const scene = generateCmds(model, sceneWidth, sceneHeight);
    return Promise.resolve(scene);
}

export const parseAndValidate = async (robotDslProgram: string): Promise<string[]> => {
    const services = createRobotDslServices(EmptyFileSystem).RobotDsl;
    
    try {
        const document = await extractDocumentFromString(robotDslProgram, services);
        const parseResult = document.parseResult;
        if (parseResult.lexerErrors.length === 0 && 
            parseResult.parserErrors.length === 0
        ) {
            console.log(chalk.green(`Parsed and validated successfully!`));
            return [];
        } else {
            let errors: string[] = [];
            if(parseResult.lexerErrors.length > 0) {
                const lexerMsg = parseResult.lexerErrors.map(lexerError =>
                    `${(lexerError.line) ? "line " + lexerError.line + 1 : ""}: ${lexerError.message}`
                );
                errors = errors.concat(lexerMsg);
            }
            if(parseResult.parserErrors.length > 0) {
                const parserMsg = parseResult.parserErrors.map(parserError =>
                    `${parserError.message}`
                );
                errors = errors.concat(parserMsg);
            }
            console.log(chalk.red(`Failed to parse and validate!`));
            return errors;
        }
    } catch (error: any) {
        console.log(chalk.red(`Failed to parse and validate!`));
        return error.message.split('\n');
    }
};
