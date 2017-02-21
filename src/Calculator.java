class Calculator {
    private final CalculatorMenu calculatorMenu;
    private final InputConsole inputConsole;
    private final OutputConsole outputConsole;
    private final int ADDITION = 1;
    private final int SUBTRACTION = 2;
    private final int MULTIPLICATION = 3;
    private final int DIVISION = 4;
    private final int EXIT = 5;
    Calculator(CalculatorMenu calculatorMenu, InputConsole inputConsole, OutputConsole outputConsole) {
        this.calculatorMenu = calculatorMenu;
        this.inputConsole = inputConsole;
        this.outputConsole = outputConsole;
    }

    void calculate(int option) {
        ArithmeticCalculatorOperation arithmeticOperation = calculatorMenu.getArithmeticOperation(option);
        NonArithmeticCalculatorOperation nonArithmeticOperation = calculatorMenu.getNonArithmeticOperation(option);
        switch (option) {
            case ADDITION: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                outputConsole.print(arithmeticOperation.executeOperation(operand1, operand2));
                break;
            }
            case SUBTRACTION: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                outputConsole.print(arithmeticOperation.executeOperation(operand1, operand2));
                break;
            }
            case MULTIPLICATION: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                outputConsole.print(arithmeticOperation.executeOperation(operand1, operand2));
                break;
            }
            case DIVISION: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                outputConsole.print(arithmeticOperation.executeOperation(operand1, operand2));
                break;
            }
            case EXIT: {
                nonArithmeticOperation.executeOperation();
                break;
            }
        }
    }
}
