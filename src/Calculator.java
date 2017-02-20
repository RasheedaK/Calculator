class Calculator {
    private final CalculatorMenu calculatorMenu;
    private final InputConsole inputConsole;

    Calculator(CalculatorMenu calculatorMenu, InputConsole inputConsole) {
        this.calculatorMenu = calculatorMenu;
        this.inputConsole = inputConsole;
    }

    void calculate(int option) {
        ArithmeticCalculatorOperation arithmeticOperation = calculatorMenu.getArithmeticOperation(option);
        NonArithmeticCalculatorOperation nonArithmeticOperation = calculatorMenu.getNonArithmeticOperation(option);
        switch (option) {
            case 1: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                System.out.println(arithmeticOperation.executeOperation(operand1, operand2));
                break;
            }
            case 2: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                arithmeticOperation.executeOperation(operand1, operand2);
                break;
            }
            case 3: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                arithmeticOperation.executeOperation(operand1, operand2);
                break;
            }
            case 4: {
                float operand1 = inputConsole.getInput();
                float operand2 = inputConsole.getInput();
                try {
                    arithmeticOperation.executeOperation(operand1, operand2);
                    break;
                } catch (NumberFormatException exception) {
                    System.out.println("Invalid Input");
                }
                break;
            }
            case 5: {
                nonArithmeticOperation.executeOperation();
                break;
            }
        }
    }
}
