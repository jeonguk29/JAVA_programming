package iducs.java200412000.exceptions;

public class Calculator {
    // expression : 3 + 4 => 3 + 4 = 7, 4 / 2 => 4 / 2 = 2
    private String operandFirst;
    private String operator;
    private String operandSecond;

    public String calc(String expression) {
        int result = 0;
        String[] elemnets = expression.split(" ");
        int op1 = Integer.parseInt(elemnets[0]); // 0 인덱스 : 3
        int op2 = Integer.parseInt(elemnets[2]); // 2 인덱스 : 4
        operator = elemnets[1];
        String message = "";
        try {
            if (operator.equals("+"))
                result = op1 + op2;
            else if (operator.equals("/"))
                result = op1 / op2; // 예외가 발생할 수 있음, unchecked exception, 시스템 알아서 처리
            else
                // 필요하여 예외를 발생시킴 : 반드시 체크 필요함 - checked exception
                throw new MyException("Hahahoho");
            message = expression + " = " + result;
        } catch (MyException e) { // ArithmeticException은 Exception을 상속 받음, Exception 으로도 일반화하여 처리 가능
            message = "my exception : " + e.getMessage();
        } finally { // 예외 발생에 관계 없이 반드시 실행해야 하는 코드를 작성
            return message;
        }

    }
}
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
