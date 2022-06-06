package studt.abstractclass_interface;

public class abstr_test extends abstr_class{

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    String name = "추상클래스 구현 부분";


}
