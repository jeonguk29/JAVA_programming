package iducs.java200412000.polymorphism;
// abstract class :  부분 구현, 재사용성의 향상을 위해 부분 구현과 향후 구현이 공존
public class GalaxyPhone extends SmartPhone implements MultimediaPlayer {
    public void call(String p) {
        System.out.println("SmartPhone 클래스에 정의된 메소드를 재정의함");
    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void record() {

    }

    @Override
    public void tackAPicture() {

    }

    void defaultMethod() {

    }
}
