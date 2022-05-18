public class conditional_repetitive2 {

        final static int N = 30;
    public static void main(String[] args) {
        int i = 0, sum = 0; // 이렇게 하면 한번에 2개 변수 초기화 가능 

        while(i <= 1000)
        {
            sum += i++;   // 참일때만 실행 
        }
        System.out.println("1부터 1000까지의 합은" + sum + "입니다.");
    
        // for문 : 초기화 부분, 조건 부분, 연산 부분
        for(int a = N; a > 0; a--)
        {
            for(int j = a; j > 0; j--)     // a가 30일때 이부분 30번 반복  즉 * 30번 출력 그리고 그냥 print라 줄바꿈 없이 이어서 출력 
            {
                System.out.print("*");
            }
            System.out.println();  // 안에 반복이 끝나면 한칸 줄바꿈 해줌 
        }

        /*
        하나의 비교 연산자는 TURE혹은 FALSE를 반환하게 됩니다.
        모든 조건문, 반복문에서는 웬만하면 무조건 괄호를 적용하세요.
        for문 혹은 while문은 얼마든지 중첩될수 있습니다.
        for(;;)는 while(true)와 같이 무한루프 라는 의미로 동작합니다.
        break;를 이용하여 반복문을 즉시 빠져나올 수 있습니다.

        */
        int count = 0;
        for(;;)
        {
            System.out.println("출력");
            count++;
            if (count == 10) {
                break; // 가장 가까운 실행되고 있는 방복문을 탈출시켜주는 구문임  즉 카운트가 10이되면 탈출됨 
            }
        }
    }
}
