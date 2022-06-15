package iducs.java200412000.modules;

public class MyPhone implements SmartPhone {
    // 인터페이스에 정의된 (추상)메소드를 재정의(구현)
    @Override
    public void play() { // 메소드 선언과 바디
        System.out.println("Myphone");
    }
}
