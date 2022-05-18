public class operator_연산자 {
    
    final static int SECOND = 1000;

    public static void main(String[] args) {
    /*
        초를 입력 받아 몇분 몇초인지 계산하는 프로그램을 작성해봅시다.
        ++와 -- 연산의 개념(증감연산자)을 바르게 이해하고 프로그램을 작성해봅시다
        % 연산자의 사용법을 숙지하고 프로그램을 작성해 봅시다.
        ==, >, <, &&, ||, ! 연산의 개념을 바르게 이해하고 프로그램을 작성해 봅시다.
        '조건 ? 참 :거짓' 연산의 형태를 숙지하고 프로그램을 작성해 봅시다
        pow()를 이용한 거듭제곱 연산 프로그램을 작성해 봅시다   
    */

        int minute = SECOND /60;
        int second = SECOND % 60;
        System.out.println(minute + "분" + second + "초");

        int a = 10;
        System.out.println("현재의 a는 " + a + "입니다.");
        a++;                            
        System.out.println("현재의 a는 " + ++a + "입니다.");  // 증감 연산자가 출력할때 앞에붙으면 더하고 출력 뒤에 붙으면 출력하고 더함 
        System.out.println("현재의 a는 " + a++ + "입니다.");
        System.out.println("현재의 a는 " + a + "입니다.");
    
        System.out.println(1 % 3);
        System.out.println(2 % 3);
        System.out.println(3 % 3);
        System.out.println(4 % 3);
        System.out.println(5 % 3);
        System.out.println(6 % 3);

        int num1 = 50;
        int num2 = 50;

        System.out.println("num1와 num2가 같은가요? " + (num1 == num2));
        System.out.println("num1가 num2보다 큰가요? " + (num1 > num2));
        System.out.println("num1가 num2보다 작은가요? " + (num1 < num2));
        System.out.println("num1가 num2와 같으면서 num1가 30보다 큰가요? " + ((num1 == num2) && (num1 > 30)));
        System.out.println("num1가 50이 아닌가요? " + !(num1 == 50)); // !은 반대로 만듬 flase는 ture로 

        int num3 = 50;
        int num4 = 60;
        System.out.println("최댓값은 " + MAX(num3, num4) + "입니다.");


        double num5 = Math.pow(3.0, 20.0); // math라는 클레스에 있는 pow 거듭제곱 메소드    3의 20제곱을 a에 넣어줌
        System.out.println("3의 20제곱은 " + (int) num5 +"입니다!");  // 정수형으로 바꿔서 출력 
        




        /*
        연산자 추가 개념
        i++와  ++i는 단수이 값을 증가시키려는 목적이라면 그 기능이 통일합니다.

        100 < x < 200은 잘못된 표현 입니다. (100 < x) && (x < 200)로 표현하는 것이 올바른 연식 표현입니다
        i++는 i+= 1과 동일한 표현입니다. 또한 i = i + 1과도 동일한 표현입니다. 모두 1만큼 증가시킨다는 의미를 가지고 있습니다.

        */

        int i = 20;
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        i += 1;
        System.out.println(i);
    }
    // 반환형, 함수 이름, 매개 변수        함수는 이렇게 만듬         그리고 static (클레스 전반에 사용하는 함수)인걸 적어서 알려줘야함  다시말해 main메소드에서 이러한 함수를 사용하려면 붙여줘야함  
    static int MAX(int a, int b) {                                
        int result = (a > b) ? a: b;  // a가 b보다 크다면 그게 참이라면 a 반환 거짓이라면 b 반환     
        //3항 연산자라고도 함
        return result;
    }
}
