package iducs.java200412000.exceptions;

import java.awt.print.Pageable;

public class ReverseStringTest {
    public static void main(String[] args) {
        // 문자 배열 선언 및 초기화
        //char[] names = {'i', 'n', 'd', 'u', 'k'};
        // 입력 받는 방법 2가지 : 명령행 vs 키보드 입력
        String strName = "";
        // 예외 : 실행시간에 비정상적인 상황이 발생한 상태, 객체
        try { // 예외 검사
            if(args.length == 0) {
                throw new Exception("예외 "); // throw : 강제로 예외 발생시킴, checked exception
            }
            for (int i = 0; i < args.length; i++)
                strName = strName + args[i] + ",";
            System.out.println(strName.toUpperCase());
            for (int j = strName.length() - 1; j >= -1; j--)
                System.out.print(strName.charAt(j));
        } catch(Exception e){ // 예외 처리
            System.out.println(e.getMessage() + " 매개변수를 입력하시오");
        }

        /*
        char[] names = strName.toCharArray();
        for(int i = 0; i < names.length;i++)
            System.out.print(names[i]);
        System.out.print("\n");
        for(int j = names.length - 1; j >= 0; j--)
            System.out.print(names[j]);

         */
    }
}
