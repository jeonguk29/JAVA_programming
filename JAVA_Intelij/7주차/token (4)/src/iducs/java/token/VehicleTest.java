package iducs.java.token;

// extends 예약어, 상속을 표현하는데 사용,
// 즉 Object로 상속을 받아서 비히클Test 클래스를 정의
public class VehicleTest {
    public static void main(String[] args) {
        // Integer 클래스 : int 자료형을 효율적으로 다루기 위한 랩퍼(wrapper) 클래스
        int i = Integer.MAX_VALUE; //저장할 수 있는 최대값?
        System.out.println(i);
        // overflow : 표현할 수 있는 최대값을 초과하여 문제가 발생하는 것
        long l = (long) (i + 10); // int -> long, 묵시적 형변환
        System.out.println(l);
        System.out.println("Java 2B Fighting");
//        Other other = new Other();
//        other.move();

        Airplane air = new Airplane();
        air.move();
        Car car = new Car();

        car.name = "SONATA";

        if(car.equals(air))
            System.out.println("같은 객체");
        else
            System.out.println("다른 객체");
    }
}
