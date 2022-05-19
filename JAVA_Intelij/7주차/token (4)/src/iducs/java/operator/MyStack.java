package iducs.java.operator;

import java.util.Stack;
// 상속 : stack 클래스로 부터 상속 받아 MyStack 클래스를 정의
// Stack 클레스 super class, Parent VS. MyStack 클래스 Sub Class, child
// 상위 클래스 정의에 포함된 필드와 메소드를 허용된 범위에서 접근가능
//java.util.Stack 클래스임. 따라서 MyStack 다른 패키지에 존재함
// Stack 클래스의 public 또는 protected 에약어가 지정된 필드, 메소드만 접근가능
public class MyStack<E>extends Stack<E>{// generics 사용함  이렇게하면 스택 쓰는거랑 똑같음

    // Stack<E> 과는 다르게 push, pop 할때마다 현재 Stack에 저장 상황을 출력함
    public E pop(){ // overriding (재정의) : super Class의 메소드를 재정의                    !!만약 재정의 안하면 스택안에 있는 기본 pop함수 사용 할거임
        // 기존 메소드는 접근 불가 - super 예약어는 상위 클래스의 객체를 지정함
        E e = super.pop(); // super.pop()은 Stack 객체의 pop() 호출
        System.out.print("pop : " + e.toString() + "\t");
        printStack();
        return e;
    }
     public E push (E item)
     {
         E e = super.push(item);
         System.out.print("push : " + e.toString() + "\t");
         printStack();
         return e;
     }
    public  void  printStack(){
        // size() : <- Stack <- Vector <- object
        // this : 현재 메모리에 존재하는 객체
        for (int i = 0; i < this.size();i++)
            System.out.print(this.get(i) + ","); // 스택에다가 5개 넣으면 5개 만큼 출력하겠다는 뜻
        System.out.println();
    }
}
