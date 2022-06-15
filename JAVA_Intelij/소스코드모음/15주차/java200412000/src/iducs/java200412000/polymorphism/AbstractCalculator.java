package iducs.java200412000.polymorphism;

public abstract class AbstractCalculator implements Calculator { // implements : 인터페이스를 구현
    // public static final 아님
    String name = "Abstract";
    @Override
    public void calculate() {
        System.out.println(Calculator.name + this.name);
        System.out.println(name + " : 기본 계산 기능을 지원한다." );
    }
    // 클래스 정의 시 필요한 메소드에 대한 규격을 제시, 사용자에게는 사용법을 제시
    abstract String getName();
    abstract void setName(String name);



}
