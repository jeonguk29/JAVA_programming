package iducs.java.Study;

public class Datatype2 {
    char[] logo; //  Datatype 이 객체안에서 유효한 변수
    int year;
    static String name = "컴퓨터 소프트웨어";
    //  뽑아서 메모리에 올림
    public static String toBinary(int i) {

        return Integer.toBinaryString(i); //Integer는  정수 int형을 효과적으로 다루기위해서 정의한 클래스임
        //생성안하고 쓸수있는이유 스태틱(정적)변수라 (메모리에 상주하고있어서)                   // 10진수를 2진수 문자열로 바꿔 리턴
    }

    // 메소드
    public void printLogo(){
        int i = 10;  // 요놈은 로컬임 실핼블럭 {} 하나 끝나면 사라짐
        System.out.println(year + ":" +logo);
    }

    public void printYear(){
        int local = 100;
        System.out.println(logo + ":" + year);
    }
}
