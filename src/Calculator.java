class Calculator {
    private final CalculatorMenu calculatorMenu;
    private final InputConsole inputConsole;
    private final OutputConsole outputConsole;

    Calculator(CalculatorMenu calculatorMenu, InputConsole inputConsole, OutputConsole outputConsole) {
        this.calculatorMenu = calculatorMenu;
        this.inputConsole = inputConsole;
        this.outputConsole = outputConsole;
    }

    void calculate(int option) {
        ArithmeticCalculatorOperation arithmeticOperation = calculatorMenu.getArithmeticOperation(option);
        NonArithmeticCalculatorOperation nonArithmeticOperation = calculatorMenu.getNonArithmeticOperation(option);
        switch (option) {
            case 1: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                outputConsole.print(arithmeticOperation.executeOperation(operand1, operand2));
                break;
            }
            case 2: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                outputConsole.print(arithmeticOperation.executeOperation(operand1, operand2));
                break;
            }
            case 3: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                outputConsole.print(arithmeticOperation.executeOperation(operand1, operand2));
                break;
            }
            case 4: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                outputConsole.print(arithmeticOperation.executeOperation(operand1, operand2));
                break;
            }
            case 5: {
                nonArithmeticOperation.executeOperation();
                break;
            }
        }
    }
}
