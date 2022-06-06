package iducs.java201912047.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        //System.in : 표준입력, 일반적으로 키보드 입력
        // Scanner : java.util 패키지에 포함된 클래스, 어휘 분석을 할 수 있는 기능 제공
        Scanner sc;
        sc = new Scanner(System.in); // 엔터 입력 전까지 입력한 것을 공백 문자 기준으로 구분 분석
        // 33 + 34 입력 -> 67\

        try {
            int operand1 = sc.nextInt();
            String operator = sc.next();
            int operand2 = sc.nextInt();
            int result = 0;

            if (operator.equals("+")) {
                result = operand1 + operand2;
            } else if (operator.equals("-")) {
                result = operand1 - operand2;
            } else if (operator.equals("*")) {
                result = operand1 * operand2;
            } else if (operator.equals("/")) {
                result = operand1 / operand2;
            } else if (operator.equals("%")){
                result = operand1 % operand2;   // 나머지 연산자
            }
            else
                throw new MyException("연산자는 : + - * / % 만가능");  // Exception("연산자는 : + - * / % 만가능");

            System.out.println(operand1 + " " + operator + " " + operand2 + " = " + result);
        } catch (InputMismatchException e){ // unchecked exception : 안하면 자바 시스템에서 체크
            System.out.println("정상적인 입력은 : 숫자 연산자 숫자 입니다. "); // 안에 e.getMessage() 넣어주면 예외 발생시 예외안에 있는 메세지만 출력해라 라는 듯
        } catch (MyException e){ // checked exception : 프로그래머가 체크
            System.out.println("예외발생 :" + e.getMessage()); // 32 번 라인 예외처리
        }
        System.out.println("예외가 발생하고, 처리하지 않으면  도달 하지 않음");
        // InputMismatch 없어도 애러 안남 MyExcep 없으면 에러남



        /*
        System.out.print("입력?");  //
        while(sc.hasNext())
        {
            String str = sc.next();
            System.out.println("키보드 입력은 : " + str);
        }
        */
    }

}

class MyException extends Exception{
    public MyException(String s){ // String 유형의 매개변수로 초기화
        super(s);
    }
}
