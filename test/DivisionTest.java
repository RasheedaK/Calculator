import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {
    @Test
    public void shouldReturn2If10And5AreDivided() {
        Division division = new Division();
        assertTrue(2 == division.executeOperation(10, 5));
    }

    @Test(expected = NumberFormatException.class)
    public void shouldReturnExceptionIf10And0AreDivided() throws NumberFormatException {
        Division division = new Division();
        division.executeOperation(10.0f, 0.0f);
    }
}