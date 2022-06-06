package iducs.java201912047.inheritance;

public class programmingCalculator  extends  AbstractCalculator{
    String name = "programmingCalculator";

    public void calculate()
    {
        super.calculate();
        System.out.println(getName());
        System.out.println("프로그래밍 기능을 지원한다.");
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }
}
