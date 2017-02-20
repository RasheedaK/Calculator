import java.util.HashMap;
import java.util.Map;

class CalculatorMenu {
    Map<Integer, ArithmeticCalculatorOperation> menuOne = new HashMap<>();
    Map<Integer,NonArithmeticCalculatorOperation> menuTwo=new HashMap<>();

    CalculatorMenu() {
        menuOne.put(1, new Addition());
        menuOne.put(2, new Subtraction());
    }

    ArithmeticCalculatorOperation getCalculatorOperation(int option) {
        return menuOne.get(option);
    }
}
