package iducs.java201912029.inheritance;

import jdk.swing.interop.SwingInterOpUtils;

public abstract class AbstractCalculator implements Calculator {
        String name = "Abstract Calculator";

    public void calculate(){
        System.out.println(Calculator.name);
        System.out.println("기본 계산 기능을 지원한다.");
    }
    //클래스 정의 시 필요한 메소드에 대한 규굑을 제시, 사용자에게는 사용법을 제시
    abstract String getName();
    abstract void setName(String name);


}
