import java.util.HashMap;
import java.util.Map;

class CalculatorMenu {
    Map<Integer, ArithmeticCalculatorOperation> menuOne = new HashMap<>();
    Map<Integer, NonArithmeticCalculatorOperation> menuTwo = new HashMap<>();
    private final OutputConsole outputConsole;

    CalculatorMenu(OutputConsole outputConsole) {
        this.outputConsole = outputConsole;
        menuOne.put(1, new Addition());
        menuOne.put(2, new Subtraction());
        menuOne.put(3, new Multiplication());
        menuOne.put(4, new Division());
        menuTwo.put(5, new Exit());
    }

    ArithmeticCalculatorOperation getArithmeticOperation(int option) {
        return menuOne.get(option);
    }

    NonArithmeticCalculatorOperation getNonArithmeticOperation(int option) {
        return menuTwo.get(option);
    }

    void showOptions() {
        outputConsole.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
    }

}
