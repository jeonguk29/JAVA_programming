package iducs.java201912047.inheritance;

import java.util.Stack;

public class MyStackTest {
    public static void main(String[] args) {
        //Stack<String> stack = new Stack<>();
        MyStack<String> stack = new MyStack<>();
        stack.push("첫번째");
        stack.push("두번째");
        stack.push("세번째");
        stack.pop();
        stack.push("네번째");
        stack.pop();

        // 객체 생성 및 참조 변수에 배정
        MyStack<String> myStack = new MyStack();
        System.out.println(myStack.defaultVar + myStack.proVar + myStack.pubVar);
    }
}
