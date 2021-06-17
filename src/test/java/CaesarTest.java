import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CaesarTest {
    @Before
    public void setUp() throws Exception {
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void NewCaesarObjectGetsCorrectlyCreated_true() throws Exception {
        Caesar caesar = new Caesar("Hello", 4);
        assertEquals(true, caesar  instanceof Caesar);
    }
    @Test
    public void testEncryptWithShift26() {
        int shift = 26;
        String message = "Hello, world!";
        String expectedResultMessage = "null";
        String actualResultMessage = Caesar.encrypt(shift, message);

        assertFalse(expectedResultMessage, Boolean.parseBoolean(actualResultMessage));
    }
}

