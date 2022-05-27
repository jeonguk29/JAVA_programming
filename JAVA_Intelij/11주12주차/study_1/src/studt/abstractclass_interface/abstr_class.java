package studt.abstractclass_interface;

public abstract class abstr_class {
    abstract String getName();
    abstract void setName(String name);  // 이 클래스를 만들때 이러한 것을 만들어서 구현 할건데 일단 대강 만들어봤어
    // 상속 받을 너가 구현해

    String name = "추상 클래스 부분 입니다";
    public void calculate() { // 인터페이스 받아서 구현
        System.out.println(this.name);
        System.out.println(Calculator.name);
    }

}
