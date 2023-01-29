import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHello {
    @Test 
    public void testHello() {
        Hello hello = new Hello();
        String result = hello.main();
        assertEquals("Hello World!", result);
    }
}
