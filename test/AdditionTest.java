import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {
    @Test
    public void shouldReturn5If2And3AreAdded() {
        Addition addition=new Addition();
        assertTrue(5.0f==addition.executeOperation(2,3));
    }
    @Test
    public void shouldNotReturn3If2And3AreAdded() {
        Addition addition=new Addition();
        assertTrue(5.0f==addition.executeOperation(2,3));
    }
}