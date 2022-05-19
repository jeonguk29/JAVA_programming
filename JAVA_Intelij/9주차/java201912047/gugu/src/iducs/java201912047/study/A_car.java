package iducs.java201912047.study;

public abstract class A_car implements Carcu{

    private String name = "a 계산기 입니다";

    abstract String getName();
    abstract void setName(String name);

    @Override
    public void print() {
        System.out.println(name);
    }


}
