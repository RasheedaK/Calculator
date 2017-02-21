import java.util.InputMismatchException;

public class Main {
    public static void main(String args[]) {
        InputConsole inputConsole = new InputConsole();
        OutputConsole outputConsole = new OutputConsole();
        CalculatorMenu calculatorMenu = new CalculatorMenu(outputConsole);
        calculatorMenu.showOptions();
        try {
            int input = (int) inputConsole.getInput();
            Calculator calculator = new Calculator(calculatorMenu, inputConsole,outputConsole);
            calculator.calculate(input);
        }catch (InputMismatchException exception){
            outputConsole.print("Invalid Input");
        }
    }
}
