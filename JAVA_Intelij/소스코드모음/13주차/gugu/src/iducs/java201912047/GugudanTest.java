package iducs.java201912047;

public class GugudanTest {
    public static void main(String[] args) {
        /*
        GugudanSuper gugudanSuper = new GugudanSuper();
        gugudanSuper.printDan(5); //1. 객체 생성후 호출
        */
        Gugudan gugudan = new Gugudan();
        gugudan.printDan(5); // 슈퍼안에 있는놈아니라 재정의해서 리버스로 됨
        //gugudan.printDan(5); // 1번과 같은 결과를 생성, 상속을 통해
        //gugudan.printAll(2); // 2번 구현 필요
        //gugudan.printAll(5); // 3번 조건문 : 1, 2, 4, 8, 이 아니면 오류메세지
        //4. 상속으로 처리 : GugudanSuper 형 객체의 paintAll() 메소드 호쿨
        //gugudan.printAll();


    }
}
