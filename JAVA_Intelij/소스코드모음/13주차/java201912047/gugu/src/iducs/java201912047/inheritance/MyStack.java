package iducs.java201912047.inheritance;

import java.util.Stack;  // Stack<T> 같은 패키지에 없어서 import로 여기 있다고 알려주는것
import java.lang.String; // 원래 스트링도 이렇게 임포트 해줘야함
// 하지만 자바프로그램에서 java.lang에 모아둔 기본적으로 필요한걸 다 불러와서 안불러도 사용가능 한것
// import java.lang.*; 즉 이게 생략되어 있다 보면 됨

public class MyStack<E> extends Stack<E> { // Stack 으로 부터 상속 받음
    // 인스턴스 변수는 초기화를 하지 않는 경우, 기본 초기화를 수행함. String은 "" 초기화 됨
    public String pubVar = "pub";
    protected String proVar = "pro";
    String defaultVar = "default"; // 같은 패키지에서만 접근 가능
    private String priVar = "pri"; // 클래스 내부에서만 접근 가능
    private String item = "i"; // 클래스 내부에서만 접근 가능

    public MyStack() {  // 디폴드 생성자 : 모든 생성자가 없는 경우 컴파일러가 생성함
        super();  // 이것도 있고 아래도 있으면 안됨 하나 내가 만든게 있으면 이것도 만들면 안된 다는 뜻
        // 보통 super(); 는 생략됨
        System.out.println("MyStack");
    }
    public MyStack (String s){  //생성자 : 객체 초기화 목적
        super();
        System.out.println(s);
    }

    @Override
    // push(), pop(), peek()
    public E push(E item) {   // 재정의 (overriding) : 메소드 시그니쳐 같음
        // 메소드 이름, 매개변수 타입, 매개변수 갯수
        super.push(item);  // 상위 클래스를 가리킴 : super 예약어 vs this : 현재겍체
        System.out.println("push : " + super.peek() + this.priVar);

        return item;
    }

    @Override
    public E pop() {
        E item = super.pop();
        System.out.println("pop : " + super.peek());
        return item;
    }
}