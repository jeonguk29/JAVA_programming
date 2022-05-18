import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        /*  앞서 배운 내용들에 scanner 클래스를 이용하여 다양한 프로그램을 작성합니다.

        특정한 정수를 입력받아서 그대로 출력하는 프로그램을 작성해봅시다.
        파일에 차례로 입력된모든 정수에 100을 곱해 출력하는 프로그램을 작성해봅시다.
        1단부터 9단 까지 구구단을 출력하는 프로그램을 작성해봅시다.
        */

        Scanner sc = new Scanner(System.in);
        //Scanner import하면 사용 가능함 자바에서 제공하는 기본 입출력 라이브러리 
        // Scanner 클레스 처럼 작성이 되어있음 클레스는 내부적 함수가 있다고 했음
        // System.in 일반적인 콘솔창에서 입력하는 데이터임 
        System.out.print("정수를 입력하세요");
        int i = sc.nextInt(); //sc라는 입출력 함수가 콘솔창에 입력되는 정수를 받아서 변수에 넣어줌
        System.out.println("입력된 정수는" + i + "입니다.");
        sc.close();  // 입출력 변수를 종료 해줌으로서 프로그램 안정적으로 종료 시켜주면됨 
    }
}
