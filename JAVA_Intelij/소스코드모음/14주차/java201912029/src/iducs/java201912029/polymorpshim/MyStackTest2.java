package iducs.java201912029.polymorpshim;

import iducs.java201912029.inheritance.MyStack;

public class MyStackTest2 extends MyStack{
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack();
        System.out.println(myStack.pubVar);
        MyStackTest2 myStackTest2 = new MyStackTest2();
        System.out.println(myStackTest2.proVar + myStackTest2.pubVar);
        MyStack2 myStack2 = new MyStack2();
        System.out.println(myStack2);
    }
}

class MyStack2<T> extends MyStack<T> {
    private String defaultVar = "가능";
    private void push2(T item){
        super.push(item);
        System.out.println("top : " + super.peek());
    }

    public void print() {
        System.out.println(super.proVar);
    }
}
