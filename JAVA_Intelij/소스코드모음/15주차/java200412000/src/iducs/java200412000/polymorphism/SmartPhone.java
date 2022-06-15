package iducs.java200412000.polymorphism;
// interface : 외부 활용법을 정의, 향후 반드시 구현해야할 메소드를 제시함
public abstract class SmartPhone implements Phone, Camera {
    @Override
    public void check() {
        System.out.println("사진을 확인");
    }
    @Override
    public void call(String p) {
        System.out.println("전화를 걸다");
    }
    @Override
    public void hangup() {
        System.out.println("사진을 끊다");
    }
}
