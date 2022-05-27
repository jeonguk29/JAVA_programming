package iducs.java201912047.inheritance;

public class ScientificCalculator extends AbstractCalculator {
// 알트 엔터 단축키임 빨간줄 뜨면 클레스명 드레그해서 (겟터 셋터 만들어)
    String name = "ScientificCalculator";

    public void calculate()
    {
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
