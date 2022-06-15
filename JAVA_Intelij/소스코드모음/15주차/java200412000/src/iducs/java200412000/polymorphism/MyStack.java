package iducs.java200412000.polymorphism;

import java.util.Stack;

public class MyStack<T> extends Stack<T> {

    // push(), pop(), peek(), empty(), search()
    void push2(T item) {  // push() 개선, 메소드 추가
        super.push(item);
        System.out.println("top : " + super.peek());
    }
}
