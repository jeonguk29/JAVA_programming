package study;

import token.Airplane;
import token.Car;

public class Main {
    public static void main(String[] args) {
        // Integet 클래스 : int형을 효율적으로 다루기 위한 랩퍼(wrapper) 클래스

        int i = Integer.MAX_VALUE;// overflow : 표현할 수 있는 최대값을 초과하여 문제가 발생하는 것
        System.out.println(i);
        System.out.println(i + 10);

        int j = Integer.MIN_VALUE;
        System.out.println(j);
        System.out.println(j - 10);

        Airplane2 air = new Airplane2();
        air.move();

        Car2 car = new Car2();  // car 클레스에서 final String name = "Car"; 이런식으로 하면 아래처럼 수정 불가
        // 스태틱붙으면 메모리 상수 파이널 붙으면 수정 불가 통상적으로 파이널 붙으면 그 변수명은 대문자로 작성함

        car.name = "SONATA";
        car.move();


        if(car.equals(air))

            System.out.println("같은객체");

        else

            System.out.println("다른객체");



    }
}
