package iducs.java201912029.inheritance;

import java.util.Stack;

public class MyStack<E> extends Stack<E> { //Stack으로 부터 상속받음
    public String pubVar = "pub";
    protected String proVar = "pro";
    String defaultVar = "default"; //같은 패키지에서만 접근 가능
    private String priVar = "pri"; //클래스 내부에서만 접근 가능

    //push() pop() peek() empty() search() from stack
    public MyStack(){ // default constructor
       // super();
        System.out.println("MyStack");

    }

    public MyStack (String s){ // constructor : 객체 초기화 목적적
        super();
        System.out.println(s);
    }
    @Override
            public E push(E item) { // 제정의 : 메소드 시그니처 같음
        //메소드 이름, 매개변수 타입, 매개변수 갯수
            super.push(item); // 상위 클래스를 가리킴 : super 예약어 this : 햔재객체
            System.out.println("push : " + super.peek());
            return item;
        }
        @Override
                public E pop() {
            {                    // push() 개선, 메소드 추가
                E item = super.pop();
                System.out.println("pop : " + super.peek());
                return item;

            }
        }
}
