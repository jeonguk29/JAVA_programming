
public class conditional_repetitive {
    public static void main(String[] args) {
        /*
        논리적인 흐름의 기본인 조건문과 반복문을 알아봅니다.

        if문을 활용하여 문자열이 특정 문자열을 포함하는 확인하는 프로그램을 작성합니다.
        점수에 따라서 다른 메세지를 출력하는 프로그램을 작성해봅시다.
        문자열과 정수형을 각각 조건문을 이용해 활용해보고 그 차이점을 공부합니다.
        while을 이용하여 1부터 100까지의 합을 출력하는 프로그램을 작성해봅시다.
        for문을 이용하여 삼각형을 출력하는 프로그램을 작성해봅시다
        for문을 이용하여 원을 출력하는 프로그램을 작성해봅시다.
        */

        String a = "I Love you. ";
        if (a.contains("Love")) { // 스트링은 비 원시적 자료형이라고함 내부적으로 클레스 기반으로 만들어저서 내부적 함수가 있다고 했음 contains 함수는 특정한 변수가 어떠한 문자를 포함하는지 알려줌
            System.out.println("Me Too."); // 포함하는 경우 실행되는 부분
        
        } else {
             // 포함하지 않는 경우 실행되는 부분
            System.out.println("I hate you.");    
        }
        
        int score = 95;

        if (score >= 90) {
            System.out.println("A+ 입니다");
        } 
        else if (score >= 80) {
            System.out.println("B+ 입니다");
        }
        else if (score >= 70) {
            System.out.println("C+ 입니다");
        }
        else {
            System.out.println("F 입니다");
        } 


        String b = "Man";
        int c = 0;

        // 자바는 string을 비교할때 equal()을 이용합니다.       같을때만 참 반환
        // 그이유는 string은 다른 자료형과 다른 문자열 자료형이기 때문 
        
        if (b.equals("Man")) {
            System.out.println("남자입니다.");
        } 
        else {
            System.out.println("남자가 아닙니다.");
        }

        if (c == 3) {
            System.out.println("b는 3입니다.");
        } else {
            System.out.println("b는 3이 아닙니다.");
        }

        if (b.equalsIgnoreCase("man") && c == 0) {   // equalsIgnoreCase 는 대소문자 구분 안하고 같은지 검사함 
            System.out.println("참입니다");
        } else {
            System.out.println("거짓입니다");
        }
    }
}
