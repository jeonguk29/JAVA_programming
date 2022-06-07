package iducs.java201912029.inheritance;

public class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        CalculatorTest.checkFuction(new GraphingCalculator());
        CalculatorTest.checkFuction(new ProgrammingCalculator());
        CalculatorTest.checkFuction(new ScientificCalculator());

   }
   public static void checkFuction(Calculator calculator){
        calculator.calculate();
   }
}
