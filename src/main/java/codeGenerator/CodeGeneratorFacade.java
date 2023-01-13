package codeGenerator;

import scanner.token.Token;

public class CodeGeneratorFacade {
    private final CodeGenerator cg;

    public CodeGeneratorFacade() {
        cg = new CodeGenerator();
    }

    public void printMemory() {
        cg.printMemory();
    }

    public void semanticFunction(int semanticAction, Token lookAhead) {
        cg.semanticFunction(semanticAction,lookAhead);
    }
}

