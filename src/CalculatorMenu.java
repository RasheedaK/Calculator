import java.util.HashMap;
import java.util.Map;

class CalculatorMenu {
    Map<Integer, ArithmeticCalculatorOperation> menuOne = new HashMap<>();
    Map<Integer, NonArithmeticCalculatorOperation> menuTwo = new HashMap<>();

    CalculatorMenu() {
        menuOne.put(1, new Addition());
        menuOne.put(2, new Subtraction());
        menuTwo.put(3,new Exit());
    }

    ArithmeticCalculatorOperation getArithmeticOperation(int option) {
        return menuOne.get(option);
    }
    NonArithmeticCalculatorOperation getNonArithmeticOperation(int option) {
        return menuTwo.get(option);
    }


}
