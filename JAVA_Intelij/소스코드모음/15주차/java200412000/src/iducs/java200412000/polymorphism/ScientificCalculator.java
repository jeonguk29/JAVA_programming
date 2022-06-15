package iducs.java200412000.polymorphism;

public class ScientificCalculator extends AbstractCalculator {
    String name = "ScientificCalculator";

    @Override
    public void calculate() {
        super.calculate();
        System.out.println(getName());
        System.out.println("공학 계산 기능을 지원한다.");
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
