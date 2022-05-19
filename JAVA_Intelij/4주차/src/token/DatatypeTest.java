package token;
import other.Other;


// extends  예약어, 상속을 표현하는데 사용, 즉 Object로 상속을 받아서 DatatypeTest를 정의

// public class DatatypeTest extends object {

public class DatatypeTest {

    public static void main(String[] args) {

        // Integet 클래스 : int형을 효율적으로 다루기 위한 랩퍼(wrapper) 클래스

        int i = Integer.MAX_VALUE;// 저장할수 있는 최대값

        // Integer.MAX_VALUE = 10; 이렇게 하면 오류 이러한 상수변수들은 오류남 바꿀수 없음

        System.out.println(i);

        i = i + 10; // overflow : 표현할 수 있는 최대값을 초과하여 문제가 발생하는 것

        // Long l = i+10; // int -> long, 묵시적 형변환

        // Long l = (long) (i + 10); 명시적 변화

        System.out.println(i);



        System.out.println("Java 2B Fighting");

//        Other other = new Other();

//        other.move();



        Airplane air = new Airplane();

        air.move();

        Car car = new Car();  // car 클레스에서 final String name = "Car"; 이런식으로 하면 아래처럼 수정 불가

        // 스태틱붙으면 메모리 상수 파이널 붙으면 수정 불가 통상적으로 파이널 붙으면 그 변수명은 대문자로 작성함

        car.name = "SONATA";
        //car.move();


        if(car.equals(air))

            System.out.println("같은객체");

        else

            System.out.println("다른객체");

    }

}