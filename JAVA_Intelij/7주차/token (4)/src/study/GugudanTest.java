package study;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gu = new Gugudan();
        //gu.printAll(8);


        // int 형보다 작은 자료형을 연산시 int형으로 기본 반환 하기 때문에 명시적으로 알려줘야함 여기에 넣을수 있다고
        byte num11 = 1;
        byte num12 = 2;
        byte result1 = (byte) (num11 + num12);
        System.out.println(result1);

        short num21 = 1;
        short num22 = 2;
        short result2 =(short) (num21 + num22);
        System.out.println(result2);




        int num31 = 1;
        int num32 = 2;
        int result3 = num31 + num32;
        System.out.println(result3); // 자동 인트 반환이라 담는게 int여서 상관없음


        long num41 = 1;
        long num42 = 2;
        long result4 = num41 + num42;  // 인트보다 큰 자료형 연산시 그 에 맞는 자료형으로 반환해서 상관 없음
        System.out.println(result4);

        long result5 = num31 + num41; // int형 31을 자동 형변환 한다음 연산함
        System.out.println(result5);

        float num61 = 1.0f;
        float num62 = 2.0f;
        float result6 = num61 + num62;
        System.out.println(result6);

        double num71 = 1.0;
        double num72 = 2.0;
        double result7 = num71 + num72;
        System.out.println(result7);

        double result8 = num61 + num71;  // float을 자동 double 형으로 변환해서 연산
        System.out.println(result8);




//        // byte 1byte, short 2byte, int(기본) 4byte, long 8byte
//        // float 4byte, double 8byte(기본)
//        // 용기가 다른것임
//
//        // 변수를 유효범위로 분류 : 지역변수 - 메소드 안 실행볼록 안에서 선언되어 유효한 변수
//        // 인스턴스변수 - 클래스 안, 메소드를 밖에선언, 클래스 변수(정적변수) - static이 설정
//        // 클래스로 부터 객체(object, instance)를 생성하는 것으로  instantiation(인스턴스 화)
//        byte b = Byte.MAX_VALUE;
//        short s = b;
//        int i; // 1 -sign, 31 - 유효숫자가
//        long l;
//
//        ////17.34 둘다 값 표현은 되는것임 8바이트 4바이트로 표현해준거임
//        double d =17.34;    // 1.743 * 10^   1 - sign, 11 - exponent(지수), 52 - mantissa(유효숫자)
//        float f = 17.34f;   //  1 - sign, 8 - exponent(지수), 23 - mantissa(유효숫자)
//        // 2_234_567_891 (정수)   =>  2.12345678 * 10 ^ 10 (실수)   891 같은경우 깨져버림 유실 생김
//        // 이런걸 정밀도 상실 이라고함
//
//        l = 12_341_234_123l; //  int형으로 12_341_234_123 이정도 숫자 처리 못함 long롱으로 처리해주면 됨
//        //  12_341_234_123l 이값은 long형 리터럴임
//        l = 20;
//        i = (int)l; // 형변환 - 묵시적, (명시적)사용        i = l; 오류남 아무리 컵커도 넘칠까바 못하는거임
//
//        System.out.println(Integer.MAX_VALUE);
//
//        b = (byte) (b + 1);   // b + 1  => (int) b + 1  즉 둘다 인트값으로 계산하고 바이트 바꿔주는거  : 컴파일러 (묵시적 형변환)
//        s = (short) (s + 1);
//        i = i + 1;


    }
}


