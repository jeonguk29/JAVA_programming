package iducs.java200412000.exceptions;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calc("4 / 0"));
        System.out.println(calculator.calc("4 / 2"));
        System.out.println(calculator.calc("4 - 2"));

    }
}
