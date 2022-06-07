package iducs.java201912029.inheritance;

public class GraphingCalculator extends AbstractCalculator {
    public void calculate(){
        System.out.println(Calculator.name);
        System.out.println("기본 계산 기능을 지원한다.");
    }

    String getName() {
        return name;
    }

    void setName(String name){
        this.name = name;
    }


}