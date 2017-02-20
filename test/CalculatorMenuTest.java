import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorMenuTest {
    @Test
    public void shouldReturnAdditionAsCalculatorOperationForOption1() {
        CalculatorMenu calculatorMenu = new CalculatorMenu();
        CalculatorOperation calculatorOperation = calculatorMenu.getCalculatorOperation(1);
        assertTrue(calculatorOperation instanceof Addition);
    }

    @Test
    public void shouldReturnSubtractionAsCalculatorOperationForOption2() {
        CalculatorMenu calculatorMenu = new CalculatorMenu();
        CalculatorOperation calculatorOperation = calculatorMenu.getCalculatorOperation(2);
        assertTrue(calculatorOperation instanceof Subtraction);
    }
}