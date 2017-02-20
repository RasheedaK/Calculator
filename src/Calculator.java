class Calculator {
    private final CalculatorMenu calculatorMenu;

    Calculator(CalculatorMenu calculatorMenu) {
        this.calculatorMenu = calculatorMenu;
    }

    void calculate(int option) {
        ArithmeticCalculatorOperation calculatorOperation = calculatorMenu.getCalculatorOperation(option);
        switch (option) {
            case 1: {
                calculatorOperation.executeOperation(1, 2);
                break;
            }
            case 2: {
                calculatorOperation.executeOperation(1, 2);
                break;
            }
        }
    }
}
