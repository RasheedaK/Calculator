import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {
    @Test
    public void shouldReturn12If4And3AreMultiplicated() {
        Multiplication multiplication=new Multiplication();
        assertTrue(12.0f==multiplication.executeOperation(4,3));
    }
    @Test
    public void shouldNotReturn10If4And3AreMultiplicated() {
        Multiplication multiplication=new Multiplication();
        assertTrue(10.0f!=multiplication.executeOperation(4,3));
    }
}