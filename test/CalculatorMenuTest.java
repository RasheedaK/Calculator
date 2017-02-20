import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CalculatorMenuTest {
    @Test
    public void shouldReturnAdditionAsCalculatorOperationForOption1() {
        OutputConsole outputConsole = mock(OutputConsole.class);
        CalculatorMenu calculatorMenu = new CalculatorMenu(outputConsole);
        ArithmeticCalculatorOperation calculatorOperation = calculatorMenu.getArithmeticOperation(1);
        assertTrue(calculatorOperation instanceof Addition);
    }

    @Test
    public void shouldReturnSubtractionAsCalculatorOperationForOption2() {
        OutputConsole outputConsole = mock(OutputConsole.class);
        CalculatorMenu calculatorMenu = new CalculatorMenu(outputConsole);
        ArithmeticCalculatorOperation calculatorOperation = calculatorMenu.getArithmeticOperation(2);
        assertTrue(calculatorOperation instanceof Subtraction);
    }

    @Test
    public void shouldReturnExitAsOperationForOption5() {
        OutputConsole outputConsole = mock(OutputConsole.class);
        CalculatorMenu calculatorMenu = new CalculatorMenu(outputConsole);
        NonArithmeticCalculatorOperation operation = calculatorMenu.getNonArithmeticOperation(5);
        assertTrue(operation instanceof Exit);
    }

    @Test
    public void shouldReturnMultiplicationAsCalculatorOperationForOption3() {
        OutputConsole outputConsole = mock(OutputConsole.class);
        CalculatorMenu calculatorMenu = new CalculatorMenu(outputConsole);
        ArithmeticCalculatorOperation operation = calculatorMenu.getArithmeticOperation(3);
        assertTrue(operation instanceof Multiplication);
    }

    @Test
    public void shouldReturnDivisionAsCalculatorOperationForOption4() {
        OutputConsole outputConsole = mock(OutputConsole.class);
        CalculatorMenu calculatorMenu = new CalculatorMenu(outputConsole);
        ArithmeticCalculatorOperation operation = calculatorMenu.getArithmeticOperation(4);
        assertTrue(operation instanceof Division);
    }

    @Test
    public void shouldCallPrintMethodOfOutputConsoleWhenShowOptionsCalled() {
        OutputConsole outputConsole = mock(OutputConsole.class);
        CalculatorMenu calculatorMenu = new CalculatorMenu(outputConsole);
        calculatorMenu.showOptions();
        verify(outputConsole, times(1)).print(anyString());
    }
}