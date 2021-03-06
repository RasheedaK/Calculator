import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalculatorTest {
    @Test
    public void shouldPerformAdditionOperationForOption1() {
        CalculatorMenu dummyMenu = mock(CalculatorMenu.class);
        InputConsole dummyInputConsole = mock(InputConsole.class);
        OutputConsole dummyOutputConsole = mock(OutputConsole.class);
        Calculator calculator = new Calculator(dummyMenu, dummyInputConsole, dummyOutputConsole);
        Addition dummyAddition = mock(Addition.class);
        when(dummyMenu.getArithmeticOperation(1)).thenReturn(dummyAddition);
        calculator.calculate(1);
        verify(dummyAddition, times(1)).executeOperation(anyFloat(), anyFloat());
    }

    @Test
    public void shouldPerformSubtractionOperationForOption2() {
        CalculatorMenu dummyMenu = mock(CalculatorMenu.class);
        InputConsole dummyInputConsole = mock(InputConsole.class);
        OutputConsole dummyOutputConsole = mock(OutputConsole.class);
        Calculator calculator = new Calculator(dummyMenu, dummyInputConsole, dummyOutputConsole);
        Subtraction dummySubtraction = mock(Subtraction.class);
        when(dummyMenu.getArithmeticOperation(2)).thenReturn(dummySubtraction);
        calculator.calculate(2);
        verify(dummySubtraction, times(1)).executeOperation(anyFloat(), anyFloat());
    }

    @Test
    public void shouldPerformExitOperationForOption5() {
        CalculatorMenu dummyMenu = mock(CalculatorMenu.class);
        InputConsole dummyInputConsole = mock(InputConsole.class);
        OutputConsole dummyOutputConsole = mock(OutputConsole.class);
        Calculator calculator = new Calculator(dummyMenu, dummyInputConsole, dummyOutputConsole);
        Exit dummyExit = mock(Exit.class);
        when(dummyMenu.getNonArithmeticOperation(5)).thenReturn(dummyExit);
        calculator.calculate(5);
        verify(dummyExit, times(1)).executeOperation();
    }

    @Test
    public void shouldPerformMultiplicationOperationForOption3() {
        CalculatorMenu dummyMenu = mock(CalculatorMenu.class);
        InputConsole dummyInputConsole = mock(InputConsole.class);
        OutputConsole dummyOutputConsole = mock(OutputConsole.class);
        Calculator calculator = new Calculator(dummyMenu, dummyInputConsole, dummyOutputConsole);
        Multiplication dummyMultiplication = mock(Multiplication.class);
        when(dummyMenu.getArithmeticOperation(3)).thenReturn(dummyMultiplication);
        calculator.calculate(3);
        verify(dummyMultiplication, times(1)).executeOperation(anyFloat(), anyFloat());
    }

    @Test
    public void shouldPerformDivisionOperationForOption4() {
        CalculatorMenu dummyMenu = mock(CalculatorMenu.class);
        InputConsole dummyInputConsole = mock(InputConsole.class);
        OutputConsole dummyOutputConsole = mock(OutputConsole.class);
        Calculator calculator = new Calculator(dummyMenu, dummyInputConsole, dummyOutputConsole);
        Division dummyDivision = mock(Division.class);
        when(dummyMenu.getArithmeticOperation(4)).thenReturn(dummyDivision);
        calculator.calculate(4);
        verify(dummyDivision, times(1)).executeOperation(anyFloat(), anyFloat());
    }
}