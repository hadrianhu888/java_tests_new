/**
 * @author Hadrian Hu
 * @version 1.0
 * @since 2023-27-01
 */

public class calculator {
    class Number {
        public int value;

    public Number(int value) {
            this.value = value;
        }
    }

    public int Sum(int a, int b) {
        return a + b;
    }
    
    public int Sub(int a, int b) {
        return a - b;
    }

    public int Mul(int a, int b) {
        return a * b;
    }

    public int Div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public int TestSum() {
        Number a = new Number(10);
        Number b = new Number(5);
        return Sum(a.value, b.value);
    }

    public int TestSub() {
        Number a = new Number(10);
        Number b = new Number(5);
        return Sub(a.value, b.value);
    }

    public int TestMul() {
        Number a = new Number(10);
        Number b = new Number(5);
        return Mul(a.value, b.value);
    }

    public int TestDiv() {
        Number a = new Number(10);
        Number b = new Number(5);
        return Div(a.value, b.value);
    }
    
    public int TestMod() {
        Number a = new Number(10);
        Number b = new Number(5);
        return mod(a.value, b.value);
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        Number a = calc.new Number(10);
        Number b = calc.new Number(5);
        System.out.println("Sum: " + calc.Sum(a.value, b.value));
        System.out.println("Sub: " + calc.Sub(a.value, b.value));
        System.out.println("Mul: " + calc.Mul(a.value, b.value));
        System.out.println("Div: " + calc.Div(a.value, b.value));
        System.out.println("Mod: " + calc.mod(a.value, b.value));
    }
    
}
