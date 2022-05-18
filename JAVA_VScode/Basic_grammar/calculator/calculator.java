package calculator;
import java.util.Scanner;


public class calculator{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true)
    {
        System.out.println("메뉴를 선택하세요");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("0 끝내기");

        int num = sc.nextInt();
        if(num == 0)
        {
            System.out.println("프로그램이 종료되었습니다0");
            break;
        }
        else
        {
            if(num > 4){
                System.out.println("잘못 입력하셨습니다");
            }

            System.out.print("1번째 숫자 입력 : ");
            int num2 = sc.nextInt();
            System.out.print("2번째 숫자 입력 : ");
            int num3 = sc.nextInt();

            if(num == 1){
                System.out.println(num2 + " + " + num3 + "= " + (num2 + num3));
            }
            if(num == 2){
                System.out.println(num2 + " - " + "num3 = " + (num2 - num3));
            }
            if(num == 3){
                System.out.println(num2 + " X " + "num3 = " + (num2 * num3));
            }
            if(num == 1){
                System.out.println(num2 + " % " + "num3 = " + (num2 / num3));

            }

        }
    }
    
    }
}