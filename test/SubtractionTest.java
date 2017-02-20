import org.junit.Test;

import static org.junit.Assert.*;
public class SubtractionTest {
    @Test
    public void shouldReturn3If8and5AreSubtracted() {
        Subtraction subtraction=new Subtraction();
        assertTrue(3==subtraction.execute(8,5));
    }
    @Test
    public void shouldNotReturn8If8and5AreSubtracted() {
        Subtraction subtraction=new Subtraction();
        assertFalse(8==subtraction.execute(8,5));
    }
}