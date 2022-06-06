package iducs.java201912047.study;

public class B_car extends A_car{   // 추상메서드 구현시 알트 엔터 / 그냥 일반 겟터 셋터등 만들때 알트 인설트

    @Override
    public void setName(String name) {
        this.name = name;
    }

    String name = "B 계산기 입니다";

    public String getName() {
        return name;
    }





}
