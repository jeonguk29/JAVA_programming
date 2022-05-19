package iducs.java.other;

import iducs.java.token.Car;  // 패키지가 달라서 이렇게 임포트 해줘야함 같으면 토큰보면 해줄필요 없음

public class Other extends Car {
    @Override
    // 상속 관계가 같은 패키지 보다 친밀도가 낮음
    // 상속은 계약 관계, 허가 관계 : 클래스 정의한 개발자가 허용한 것을 사용 할수있ㄷ다.
    // 같은 패키지는 클래스 설계자가 친밀도를 인정한 것
    public void move() {
        Car car = new Car();
        car.move();
        // System.out.println(car.name); // car클래스 name변수가 프라이빗이면 접근 안됨
        System.out.println(super.name); // super 상위 클래스를 가리키는 예약어      car클래스가 name변수가   퍼블릭, 프로텍티브일때 접근가능함
        super.move(); // 현재 클래스의 상위클래스를 의미함
        System.out.println("Other가 이동한다");
    }
}
