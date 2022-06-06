package iducs.java.token;

public class Train {
    // 멤버 필드 String 클래스 이름,
    // name 인스턴스 변수 ( 객체 특징, 속성 : 클래스 안, 메소드를 밖 선언)
    // 인스턴스 변수는 초기화를 하지 않는 경우 디폴트 초기화를 수행
    String name = "Train";
    // 멤버 메소드
    public void move() {
        System.out.println(name + "이 이동한다");
    }
}
