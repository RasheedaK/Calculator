import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    @Test
    public void shouldPerformAdditionOperationForOption1() {
        CalculatorMenu dummyMenu=mock(CalculatorMenu.class);
        Calculator calculator=new Calculator(dummyMenu);
        Addition dummyAddition=mock(Addition.class);
        when(dummyMenu.getCalculatorOperation(1)).thenReturn(dummyAddition);
        calculator.calculate(1);
        verify(dummyAddition,times(1)).executeOperation(anyFloat(),anyFloat());
    }
}