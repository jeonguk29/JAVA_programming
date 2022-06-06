package iducs.java.operator;

import java.util.Stack;

// 패키지(package) : 클래스, 인터페이스  등을 효과적으로 관리하기 위해 사용되는 프로그래밍 요소
// 디렉터리(directory) - 파일(file) 관계 : 파일을 효과적으로 관리(naming 포함)
public class OperatorTest {
    public static void main(String[] args) {

        MyStack<String> myStack1 = new MyStack();
       if(myStack1 instanceof MyStack)
           System.out.println("동종 : MyStack");
       if(myStack1 instanceof Stack)
           System.out.println("동종 : Stack");
       if(myStack1 instanceof Object)  //  if(myStack1 instanceof String) 이렇게 하면 안됨
           System.out.println("동종 : String");

        Stack<String> stack = myStack1; // Stack<String> stack = (Stack)myStack1; 원래는 이렇게 해줘야 하지만 들어감
        myStack1.printStack(); // myStack1 과 stack 참조변수가 참조하는 객체는 같음
        ((MyStack<String>) stack).printStack();

        // ((Integer) stack).doubleValue();   바꿀수 있는게 있고 이렇게 바꿀수 없는게 있음  즉 인트형으로 못바꿈 스택형은

        ((Object) stack).toString();  // 가능한데 사용가능한 기능이 매우 적어짐







        // refactoring : 기능 및 보안적인 수정이 아닌 유지보수를 목적으로 요소화 하는 것 ( 클레스 바꾸는거 쉬프트 + f6 )
        // MyStack myStack = new MyStack();
        MyStack<String> myStack = new MyStack(); // generics 사용함  이렇게하면 스택 쓰는거랑 똑같음
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");

        myStack.pop();
        myStack.printStack();;
        myStack.push("4");


        // new 객체 생성, 인스턴스화(instantiation)
        // myOperator 참조변수에 배정
        MyCalculator myOperator = new MyCalculator();
        //System.out.println(myOperator.express() +  myOperator.calculate());
        System.out.println(myOperator.express()); // 참조변수를 통해 객체를 활용

        myOperator = new MyCalculator(77,0,"/");
        System.out.println(myOperator.express());

        int i = 8;
        double d = 8.0;

        System.out.println(i << 2); // 1을 오른쪽으로 두번밀어라 0000 1000 -> << 2-> 0010 00000 : 2* 2를 곱한 효과
        System.out.println(i >> 2);  // 2로 두번 나누는것과 동일
        //System.out.println(d << 2);  쉬프트 할수있는 대상이 아니라 오류남

        if(i == d)
            System.out.println("Equal");        // 8하고 8.0  같다고함
        else
            System.out.println("Not Equal");
    }
}
