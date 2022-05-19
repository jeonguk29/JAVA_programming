package iducs.java.Study;

import iducs.java.token.Datatype;

public class Main {
    public static void main(String[] args) {
        char[] uppercase = new char[26];
        char[] uppercase2 = new char[26];
        char ch = 'A';
        for(int i = 0; i < 26; i++) {   // 대문자 소문자 바꾸는거 시험
            // 가우스 더하는거 시험 반복문 안쓰고 1부터 100까지 합
            uppercase[i] = (char) (ch + i + 32);  // 배열에 소문자 저장
            uppercase2[i] = (char) (ch + i); // 배열에 대문자 저장
            System.out.printf("%c\n",uppercase[i]); // 여기에는 이렇게하면 소문자 26개가 들어가게 됨
            System.out.printf("%c\n",uppercase2[i]); // 대문자 출력
            //System.out.printf("%c\n", (char) (ch + i)); 일반 대문자 배열에 저장 안하고 출력
        }

        int i2 = 0;
        boolean end = true;
        while(end) {// true or false
            System.out.println(i2 + "무한반복");
            if(i2 >= 10)
                end = false;
            //break;
            i2++;
        }

        System.out.println(ch);
        System.out.printf("%c\n",(char)(ch + 1)); //(ch + 1) 이런식으로 숫자화 한다음 char형변환 명시적 형변환, 묵시적 형변환도 있음
        System.out.printf("%d\n",(int)ch); // char -> int 명시적 형변환 : 0~65535. 2byte)
        System.out.printf("%d\n",(int)Character.toLowerCase(ch));  // 입력받은값을 소문자로 리턴해줌 근데 그걸 인트형으로 바꿔서 출력
        System.out.println(Datatype2.toBinary(ch)); // 비트 패턴으로 표현


        System.out.println("00000000" + Datatype2.toBinary(12345678));  // 2의보수 확인차 0추가
        System.out.println(Datatype2.toBinary(-12345678));
        System.out.println(Datatype2.toBinary(12345678).length()); // 반환값이 스트링이라 스트링 메소드 랭스 사용하는거임   () 붙어있으니 메소드 : 스트링객체에 랭스 메소드
        // 웹툰클래스에 ranking.length는 메소드가 아님 () 없으니까 이건 배열의 특징값임  : 배열객체의 랭스 필드
        // 위 출력 값을 4비트씩 짜른다면 16진수로 표현도 가능할거임

        System.out.println(Datatype2.name); // 에러안남  name 정적 변수는 객체 생성전에 사용 가능 (이미 메모리 올라와 있어서)
        // System.out.println(Datatype.year);  접근 불가 : 객체가 생성되어 있지 않음 (아직 메모리 올라가지 않음)

        Datatype2 datatype = new Datatype2();
        System.out.println(datatype.year); // 객체를 생성하고 참조변수를 활용하여 인스턴스 변수 접근

    }
}
