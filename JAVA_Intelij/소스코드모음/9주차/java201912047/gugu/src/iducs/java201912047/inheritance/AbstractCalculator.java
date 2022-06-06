package iducs.java201912047.inheritance;

public abstract class AbstractCalculator implements Calculator{ // implements : 인터페이스를 구현
    String name = "Abstract Calculator";
    @Override
    public void calculate() { // 인터페이스에 있는 칼큐레이터 구현 하겠다는 뜻
        System.out.println(Calculator.name); // 인터페이스 변수 메모리 상주중이라 바로 접근 가능
        System.out.println(name + " : 기본 계산 기능을 지원한다");
    }
    // 클래스 정의 시 필요한 메소드에 대란 규격을 제시, 사용자에게는 사용법을 제시
    abstract String getName();       // 이런 추상 클래스 쓰는 이유 이러한 것을 만들고 쓰라는 것을 제시
    abstract void setName(String name);
    // 총 3개의 추상 메소드를 가짐

    // 사실상 인터페이스에서는 구현만 해두고 이러한 추상 클래스에서 정의를 다하는 것임
    // 모든메소드가 추상 메소드 즉 몸통만 있는 선언만 있는것이 하나이상 있으면 추상 클래스
    // 추상메소드 하나도 없는 클래스는 그냥 일반 클래스임
    // 웨에 겟 네임 셋네임은 상속 받아서 구현하지말고 알아서 만들어 써라 라고 하는 거임 + 꼭 구현해라 안그럼 객체 못만드니까
    // abstract 있다면 미완성이다 라고 알려주는 것임

    // 즉 인터페이스는 계획만 짠거임 지금은 쓸모 없지만 앞으로 계획이 이렇다 알려준거고
}
