package iducs.java.token;

public class DatatypeTest {
    // 애플리케이션의 시작점, main() 메소드
    public static void main(String[] args) {

        char[] uppercase = new char[26];
        char ch = 'A';
        for(int i = 0; i < 26; i++) {   // 대문자 소문자 바꾸는거 시험
            // 가우스 더하는거 시험 반복문 안쓰고 1부터 100까지 합
            uppercase[i] = (char) (ch + i + 32);
            System.out.printf("%c\n",uppercase[i]); // 여기에는 이렇게하면 소문자 26개가 들어가게 됨
            System.out.printf("%c\n", (char) (ch + i));
        }

        int i2 = 0;
        boolean end = true;
        while(end) {// true or false
            System.out.println(i2 + "무한반복");
            if(i2 >= 100)
                end = false;
                //break;
            i2++;
        }
        System.out.println(ch);
        System.out.printf("%c\n",(char)(ch + 1)); //(ch + 1) 이런식으로 숫자화 한다음 char형변환 명시적 형변환, 묵시적 형변환도 있음
        System.out.printf("%d\n",(int)ch); // char -> int 명시적 형변환 : 0~65535. 2byte)
        System.out.printf("%d\n",(int)Character.toLowerCase(ch));
        System.out.println(Datatype.toBinary(ch)); // 비트 패턴으로 표현


        System.out.println("00000000" + Datatype.toBinary(12345678));  // 2의보수 확인차 0추가
        System.out.println(Datatype.toBinary(-12345678));
        System.out.println(Datatype.toBinary(12345678).length()); // 반환값이 스트링이라 스트링 메소드 랭스 사용하는거임   () 붙어있으니 메소드 : 스트링객체에 랭스 메소드
        // 웹툰클래스에 ranking.length는 메소드가 아님 () 없으니까 이건 배열의 특징값임  : 배열객체의 랭스 필드
        // 위 출력 값을 4비트씩 짜른다면 16진수로 표현도 가능할거임

        System.out.println(Datatype.name); // 에러안남  name 정적 변수는 객체 생성전에 사용 가능 (이미 메모리 올라와 있어서)
        // System.out.println(Datatype.year);  접근 불가 : 객체가 생성되어 있지 않음 (아직 메모리 올라가지 않음)

        Datatype datatype = new Datatype();
        System.out.println(datatype.year); // 객체를 생성하고 참조변수를 활용하여 인스턴스 변수 접근



        // byte 1byte, short 2byte, int(기본) 4byte, long 8byte
        // float 4byte, double 8byte(기본)
        // 용기가 다른것임

        // 변수를 유효범위로 분류 : 지역변수 - 메소드 안 실행볼록 안에서 선언되어 유효한 변수
        // 인스턴스변수 - 클래스 안, 메소드를 밖에선언, 클래스 변수(정적변수) - static이 설정
        // 클래스로 부터 객체(object, instance)를 생성하는 것으로  instantiation(인스턴스 화)
        byte b = Byte.MAX_VALUE;
        short s = b;
        int i; // 1 -sign, 31 - 유효숫자가
        long l;

        ////17.34 둘다 값 표현은 되는것임 8바이트 4바이트로 표현해준거임
        double d =17.34;    // 1.743 * 10^   1 - sign, 11 - exponent(지수), 52 - mantissa(유효숫자)
        float f = 17.34f;   //  1 - sign, 8 - exponent(지수), 23 - mantissa(유효숫자)
        // 2_234_567_891 (정수)   =>  2.12345678 * 10 ^ 10 (실수)   891 같은경우 깨져버림 유실 생김
        // 이런걸 정밀도 상실 이라고함

        l = 12_341_234_123l; //  int형으로 12_341_234_123 이정도 숫자 처리 못함 long롱으로 처리해주면 됨
        //  12_341_234_123l 이값은 long형 리터럴임
        l = 20;
        i = (int)l; // 형변환 - 묵시적, (명시적)사용        i = l; 오류남 아무리 컵커도 넘칠까바 못하는거임

        System.out.println(Integer.MAX_VALUE);

         b = (byte) (b + 1);   // b + 1  => (int) b + 1  즉 둘다 인트값으로 계산하고 바이트 바꿔주는거  : 컴파일러 (묵시적 형변환)
         s = (short) (s + 1);
         i = i + 1;

    }
}
