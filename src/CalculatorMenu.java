import java.util.HashMap;
import java.util.Map;

class CalculatorMenu {
    Map<Integer, CalculatorOperation> calculatorMenu = new HashMap<>();

    public CalculatorMenu() {
        calculatorMenu.put(1, new Addition());
        calculatorMenu.put(2, new Subtraction());
    }

    CalculatorOperation getCalculatorOperation(int option) {
        return calculatorMenu.get(option);
    }
}
