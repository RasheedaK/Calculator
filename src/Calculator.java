class Calculator {
    private final CalculatorMenu calculatorMenu;

    Calculator(CalculatorMenu calculatorMenu) {
        this.calculatorMenu = calculatorMenu;
    }

    void calculate(int option) {
        ArithmeticCalculatorOperation arithmeticOperation = calculatorMenu.getArithmeticOperation(option);
        NonArithmeticCalculatorOperation nonArithmeticOperation = calculatorMenu.getNonArithmeticOperation(option);
        switch (option) {
            case 1: {
                arithmeticOperation.executeOperation(1, 2);
                break;
            }
            case 2: {
                arithmeticOperation.executeOperation(1, 2);
                break;
            }
            case 3:{
                nonArithmeticOperation.executeOperation();
            }
        }
    }
}
