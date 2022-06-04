package iducs.java201912047.inheritance;

public class GraphingCalcylator extends AbstractCalculator{
    String name = "GraphingCalcylator";

    @Override
    public  void  calculate(){ // 재정의
        super.calculate();
        System.out.println(getName());
        System.out.println("그래프 기능을 지원한다");
    }

    @Override                       // AbstractCalculator 이놈을 쓰려면 아래와 같이 2개 구현해줘야함
    String getName() {                // 추상클래스에서 알려줬듯이
        return name;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }
}
