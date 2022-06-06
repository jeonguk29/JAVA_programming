package study.operator;

public class MyCalculator {
    // 인스턴스 변수, 멤버 필드
    private  int operand1, operand2; // 피연산자
    private String operator; // 연산자  : +, - ,*,/,% 만 할거임

    public MyCalculator() {  // 디폴트 생성자, 생성자 오버로딩(overloading)
        operand1 = 1;
        operand2 = 2;
        operator = "+";
        //result = 1;     calculate()에 있는건 접근 안됨 내부에서 쓰겠다고 한거라

    }

    public MyCalculator(int op1, int op2, String op){ // AllArguments 생성자,
        operand1 = op1;
        operand2 = op2;
        operator = op;
    }

    String express(){  // 식도출 메서드 // 같은 패키지에서만 접근 가능하게 만듬

        return operand1 + operator + operand2 + " = " + calculate();   // 이건 계산이 아니라 연결 연산임!!!!!!!!!!!!!! 알아서 문자열로 계산해줌
    }

    private String calculate(){  // 외부에서는 못쓰지만 내부에서는 쓸수 있음

        String result = ""; // 지역변수                           // 변수 지역범위별로 나누면 멤버, 클레스 , 인스턴수 변수 3가지임
        if(operator.equals("+"))
            result = result + (operand1 + operand2);
        else if (operator.equals("-"))
            result = result + (operand1 - operand2);   // 나누기할때 operand2가 0인지 확인해야함 시험 힌트
        else if (operator.equals("/")) {
            if (operand2 != 0)
                result = result + (operand1 / operand2);
            else
                result = result + "divider는 0이면 계산 불가";
        }
        else
            ;

        return result; // return - 분기문(jump statement), 호출한 메소드로 반환
    }
}


/*

간단한 사칙연산 프로그램 만드는거
클레스 만들업는거 (퍼블릭 프라이빗 등 중요 )

 */