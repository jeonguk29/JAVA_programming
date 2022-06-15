package iducs.java200412000.polymorphism;

public class CalculatorTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push2("1");
        myStack.push2("2");
        myStack.push2("3");
        myStack.push2("4");
        myStack.pop(); // 4 제거
        myStack.push2("5"); // 1, 2, 3, 5
        /* list 형태로 접근
        for(String s : myStack)
            System.out.println(s);

         */
        int i = 0;
        int size = myStack.size();
        while(!myStack.isEmpty()) {
            System.out.println(myStack.pop());
            i++;
        }

        System.out.println(Calculator.name); // name 메모리에 상주
        // System.out.println(GraphingCalculator.name); // name 은 객체 생성후 사용 가능
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.checkFuction(new GraphingCalculator());
        calculatorTest.checkFuction(new ScientificCalculator());
        calculatorTest.checkFuction(new ProgrammingCalculator());
    }
    public void checkFuction(Calculator calculator) { // 다형성 : polymorphism
        calculator.calculate();
    }
}
