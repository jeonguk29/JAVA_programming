public class Main {
    // 예약어(reserved word, keyword) : package, public, class, static, void, if, else
    // 언어를 정의하는 시점에서 그 용도가 미리 정해진 단어, 식별자(identifer)로 사용이 불가능하다.
    public static void main(String[] args) {
        // <- 자바에서 한줄 주석:
        // 문자열 (String)을 저장할 수 참조할수 있는 참조변수 input을 선언하고, string "1"을 배정 (초기화)
        String input = "1";// 여기 "1"이것도 리터럴


        int i = 0;
        i = i + 1;// 0, 1 리터럴임
        // + =는 연산자
        // i 식별자
        //  main은 메소드  (식별자 안에 포함됨 )
        // ;을 구분자 라고 함 ex int i = 0. j = 0, k = 0; 각변수별 구분 즉 컴퓨터가 잘 이애할수 있도록 해주는 역할 구분자
        // {} 이런것도 구분자임 + 스페이스 즉 공백도 구분자임
        // ; 한문장이 끝나는걸 의미
// 정적링킹, 동적링킹 뭔지 검색해봐

        if (input == "1") {
            System.out.println(input + "을 입력하셨습니다.");
        } else {
            System.out.println("입력한 값은 1이 아닙니다.");
        }
    }
}

