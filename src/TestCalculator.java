import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.JUnitCore;


public class TestCalculator {
    @Test 
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.Sum(10, 5);
        assert result == 15;
        assertEquals(result, calculator.Sum(10, 5));
    }
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int result = calculator.Sub(10, 5);
        assert result == 5;
        assertEquals(result, calculator.Sub(10, 5));
    }
    @Test
    public void testMul() {
        Calculator calculator = new Calculator();
        int result = calculator.Mul(10, 5);
        assert result == 50;
        assertEquals(result,calculator.Mul(10,5));
    }
    @Test
    public void testDiv() {
        Calculator calculator = new Calculator();
        int result = calculator.Div(10, 5);
        assert result == 2;
        ssertEquals(result, calculator.Div(10, 5));
    }
    @Test
    public void testMod() {
        Calculator calculator = new Calculator();
        int result = calculator.mod(10, 5);
        ssertEquals(result, calculator.Mod(10, 5));
        assert result == 0;
    }
}
