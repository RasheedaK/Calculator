import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorMenuTest {
    @Test
    public void shouldReturnAdditionAsCalculatorOperationForOption1() {
        CalculatorMenu calculatorMenu = new CalculatorMenu();
        ArithmeticCalculatorOperation calculatorOperation = calculatorMenu.getArithmeticOperation(1);
        assertTrue(calculatorOperation instanceof Addition);
    }

    @Test
    public void shouldReturnSubtractionAsCalculatorOperationForOption2() {
        CalculatorMenu calculatorMenu = new CalculatorMenu();
        ArithmeticCalculatorOperation calculatorOperation = calculatorMenu.getArithmeticOperation(2);
        assertTrue(calculatorOperation instanceof Subtraction);
    }

    @Test
    public void shouldReturnExitAsOperationForOption5() {
        CalculatorMenu calculatorMenu = new CalculatorMenu();
        NonArithmeticCalculatorOperation operation = calculatorMenu.getNonArithmeticOperation(5);
        assertTrue(operation instanceof Exit);
    }

    @Test
    public void shouldReturnMultiplicationAsCalculatorOperationForOption3() {
        CalculatorMenu calculatorMenu = new CalculatorMenu();
        ArithmeticCalculatorOperation operation = calculatorMenu.getArithmeticOperation(3);
        assertTrue(operation instanceof Multiplication);
    }

    @Test
    public void shouldReturnDivisionAsCalculatorOperationForOption4() {
        CalculatorMenu calculatorMenu = new CalculatorMenu();
        ArithmeticCalculatorOperation operation = calculatorMenu.getArithmeticOperation(4);
        assertTrue(operation instanceof Division);
    }
}