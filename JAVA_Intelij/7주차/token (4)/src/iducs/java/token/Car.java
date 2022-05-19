package iducs.java.token;

public class Car {
    // 멤버 필드 String 클래스 이름,
    // name 인스턴스 변수 ( 객체 특징, 속성 : 클래스 안, 메소드를 밖 선언)
    // 인스턴스 변수는 초기화를 하지 않는 경우 디폴트 초기화를 수행
     protected String name = "Car";  // 같은 페키지 이 클래그 안 접근 가능  + 이 클래스와 상속관계인 것까지 사용할수 있게 해줌
    // 멤버 메소드
    public void move() {
        // 0 ~ 9까지 총 10번 반복, for 예약어, ( ~ ) 조건문들
        // int idx = 0 제어변수 초기화 문
        // idx < 10 조건 식(문)
        // idx++ 제어변수 수정 idx = idx + 1을 의미함
        // { ~ } : 실행 블록 - 현재 2개의 문장으로 구성되어 있음
        for(int idx = 0; idx < 10; idx++) {
            // System.out.println 표준출력문
            // 문장 : 배정문, 복합문,
            // 제어문(조건문 : if, switch, 반복문 : for, while)
            // 분기문(return, break, continue), 표준입출력문,
            System.out.println(name + "이 이동한다");
            System.out.println("최대 시속 : 220km/h");
        }
    }
}
