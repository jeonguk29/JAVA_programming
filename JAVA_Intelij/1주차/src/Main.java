public class Main {
    // Class : 객체(Object) 의 특징과 행위를 정의해놓은 프로그래밍 요소, Object를 정의하는 요소, 틀/설계도 - 제품
    public static void main(String[] args) {
        // System.out : 정적 필드(static field) - 메모리 상주
        System.out.println("Hello Java!");
        // 클래스의 메소드를 실행할 수 없음 -> 객체의 메소드를 실행(호출)할 수 있음
        Tester.callStatic(); // 객체를 생성하지 않았는데 접근이 되네? 이유는 정적 메소드(static method)
        Tester t = new Tester(); // Tester 유형의 객체를 생성해서 t라는 참조변수에 배정
        t.testPrint();
        // t.scan();
    }
}

class Tester { // Tester Class 정의 : 멤버 필드, 멤버 메소드를 가짐
    public void testPrint() {
        System.out.println("Tester testPrint");
    }
    public static void callStatic() {
        System.out.printf("call static method\n");
    }
}

/*



-------------내 코드


package iducs.java;

public class Main {
    // Class : 객체(Object) 의 특징과 행위를 정의해놓은 프로그래밍 요소, Object를 정의하는 요소, 틀/설계도 - 제품

    public static void main(String[] args) { // 메소드를 갖는다. main() 메소드는 프로그램의 시작점 역할을 수행
	// write your code here
        // System.out : 정적 객체(static object)
        // 클래스의 메서드를 실핼 할수 없음 -> 객체의 메소드를 실행(호출) 할 수 없음   tip out은 스택틱 (메모리에 올라오는거)
        System.out.println("Hello Java!");
        Tester t = new Tester(); // Tester 유형의 객체를 생성해서 t라는 참조변수에 배정
        t.testPrint();
    }
}

class Tester { // Tester Class 정의
    public void testPrint() {
        System.out.println("Tester testPrint");
    }
}
 */
