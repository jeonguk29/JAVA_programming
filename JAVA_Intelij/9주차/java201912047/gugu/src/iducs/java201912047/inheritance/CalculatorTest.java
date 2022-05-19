package iducs.java201912047.inheritance;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.checkFuction(new GraphingCalcylator());
        calculatorTest.checkFuction(new ScientificCalculator());
        calculatorTest.checkFuction(new programmingCalculator());
    }
    public void checkFuction(Calculator calculator){
        calculator.calculate(); // 다형성 : polymorphism
        // 아무거나 왔을때 그에 따른 칼큐레이터에 따라 다른 동작을 하는것임
        // ex 100, 500, 1000 동전 넣는거에 따라 다른동작
        // 각각의 적합한 것을 호출해줄게 라는것 이렇게 하면 각각 만들 필요없이  checkFuction 하나만 만들면 됨
    }
}
