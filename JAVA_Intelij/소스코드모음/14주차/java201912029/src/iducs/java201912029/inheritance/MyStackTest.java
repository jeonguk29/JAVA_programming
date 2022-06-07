package iducs.java201912029.inheritance;

import java.util.Stack;

public class MyStackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("첫번째");
        stack.push("2");
        stack.push("3");
        stack.pop();
        stack.push("3");
        stack.pop();

        //System.out.println(stack.peek());

        //객체 생성 및 참조변수에 배정
        MyStack<String> myStack = new MyStack<>();
        System.out.println(myStack.defaultVar + myStack.pubVar + myStack.proVar);
    }
}
