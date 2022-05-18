package gugu;

public class GugudanTest {
    public static void main(String[] args) {
    GugudanSuper one = new GugudanSuper();
        //one.printAll();
        //one.printDan(2);
        one.printDan(4);
    }

    
    /*

    Main Class : GugudanTest.java  Gugudan 클래스로 부터 객체를 생성 
     지정한 단만 출력  모든 단 출력  지정한 행 수로 모든 단 출력 
    • Super Class : GugudanSuper.java  printDan(int dan) : 지정한 단을 출력한다

 printAll() : 2 ~ 9 단을 출력한다
.
• Sub Class : Gugudan.java  GugudanSuper 클래스를 상속받아 구현한다
.
 printAll(int rows) : 지정한 row 수로 출력한다.  1, 2, 4, 8 만 가능  8인 경우 printAll()과 동일함  3인 경우 오류 메시지

*/
}
