import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalculatorTest {
    @Test
    public void shouldPerformAdditionOperationForOption1() {
        CalculatorMenu dummyMenu = mock(CalculatorMenu.class);
        Calculator calculator = new Calculator(dummyMenu);
        Addition dummyAddition = mock(Addition.class);
        when(dummyMenu.getCalculatorOperation(1)).thenReturn(dummyAddition);
        calculator.calculate(1);
        verify(dummyAddition, times(1)).executeOperation(anyFloat(), anyFloat());
    }

    @Test
    public void shouldPerformSubtractionOperationForOption2() {
        CalculatorMenu dummyMenu = mock(CalculatorMenu.class);
        Calculator calculator = new Calculator(dummyMenu);
        Subtraction dummySubtraction = mock(Subtraction.class);
        when(dummyMenu.getCalculatorOperation(2)).thenReturn(dummySubtraction);
        calculator.calculate(2);
        verify(dummySubtraction, times(1)).executeOperation(anyFloat(), anyFloat());
    }
}