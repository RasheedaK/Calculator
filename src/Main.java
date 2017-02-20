public class Main {
    public static void main(String args[]) {
        InputConsole inputConsole = new InputConsole();
        OutputConsole outputConsole = new OutputConsole();
        CalculatorMenu calculatorMenu = new CalculatorMenu(outputConsole);
        calculatorMenu.showOptions();
        float input = inputConsole.getInput();
        Calculator calculator = new Calculator(calculatorMenu, inputConsole);
        calculator.calculate((int) input);
    }
}
