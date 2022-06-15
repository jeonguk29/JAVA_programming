package iducs.java200412000;

public class GugudanTest {
    // 자바 애플리케이션의 시작, main() 메소드
    public static void main(String[] args) {
        GugudanSuper gugudanSuper; // 참조변수
        //gugudanSuper.printDan(5); // 1 : 클래스로 부터 생성한 객체의 메소드를 호출
        Gugudan gugudan = new Gugudan(); // gugudan : 객체 참조 변수
        //gugudan.printDan(5); // 상속받은 메소드를 호출하여 실행
        gugudan.printAll(4); // 1이면 한 행(row)에 다 출력, 8이면 4번 같음
        gugudan.printAll(10); // 1, 2, 4, 8이 아니면 오류, 중첩(overloading)
        //gugudan.printAll(); // 4, 상속받은 메소드를 호출하여 실행

        gugudanSuper = gugudan; // gugudanSuper 참조변수가 실제로는 Gugudan 클래스 객체를 참조
        // GugudanSuper 형 (printDan(int row), printAll()) 의 참조변수 gugudanSuper
        gugudanSuper.printDan(3);
        // gugudanSuper.printAll(4);
        ((Gugudan) gugudanSuper).printAll(4); // 참조 변수를 Gugudan 클래스형 객체로 취급(클래스 형변환)
        ((Object) gugudanSuper).toString(); // toString()는 Object 클래스에 정의된 메소드

    }
}
