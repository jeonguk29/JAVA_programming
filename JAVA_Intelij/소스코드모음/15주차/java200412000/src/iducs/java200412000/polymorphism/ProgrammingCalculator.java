package iducs.java200412000.polymorphism;

public class ProgrammingCalculator extends AbstractCalculator {
    String name = "ProgrammingCalculator";

    @Override
    public void calculate() {
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
