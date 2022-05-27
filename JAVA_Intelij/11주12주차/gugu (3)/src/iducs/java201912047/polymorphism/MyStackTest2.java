package iducs.java201912047.polymorphism;

import iducs.java201912047.inheritance.MyStack; // 그냥 마이스텍테스트랑 다름
// import 는 패키지 가져와라 라는 것
// 같은패키지면 import 필요없음
public class MyStackTest2 extends MyStack{
    public static void main(String[] args) {
        // 객체 생성 및 참조 변수에 배정
        MyStack<String> myStack = new MyStack();
        System.out.println(myStack.pubVar); // 상속관계 가능이라 접근 됨
        //System.out.println(myStack.defaultVar + myStack.proVar + myStack.pubVar);
        // 같은 패키지가 아니라 defaultVar 안됨
        MyStackTest2 myStackTest2 = new MyStackTest2();
        System.out.println(myStackTest2.proVar + myStackTest2.pubVar);
        // 상속관계라 provar 들은 가능 하지만 여전히 defaultVar 안됨


        MyStack2 myStack2 = new MyStack2();
        System.out.println(myStack2);  // 마이 스택은 생성자가 없어서 오류남

    }
}

class MyStack2<T> extends MyStack<T>{
    private String defaultVar= "가능";

    public void push2(T item){ // push() 개선, 메소드 추가
        super.push(item);                  // 상속 해주는 쪽에서 퍼블릭이면 퍼블릭 으로만 줘야함  즉 축소 시키면 안됨
        System.out.println("top : " + super.peek());     // 프라이빗이면 프라이빗 디폴트면 디폴트
    }
// 즉 상속 받을때 접근 권한을 축소해서 받으면 문제가 될 수 있음 퍼블릭이였는데 내맘대로 프라이빗으로 바꾸기 x
    public void print(){
        System.out.println(super.proVar);
    }
}