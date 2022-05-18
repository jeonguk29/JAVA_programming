public class iterative_recursive_function1 {
    
    public static int factorial(int number){
        //5! = 5 X 4 X 3 X 2 X 1
        int sum = 1;
        for(int i = 2; i <= number; i++)
        {
            sum *= i;         // 5팩토리얼 이면 i가 5까지 증가하면서 계속 sum에 값을 곱함
        }
        return sum;
    }

    public static int factorial2(int number){
        // 재귀 함수로 구현
        if(number == 1)
            return 1;
        else
            return number * factorial2(number - 1);    // 5! = 5 * 4! 수학적으롭 보면 식이 이러한데 그대로 적용되는걸 알수 있음
    }
    public static void main(String[] args) {
        /*
            1.팩토리얼을 재귀함수로 구현할수 있습니다.
            2.팩토리얼을 반복함수로 구현할수 있습니다.
            3.피보나치 수열을 재귀 함수로 구현할 수 있습니다.
            4.피보나치 수열을 반복함수로 구현 할수 있습니다.
        */

        System.out.println("10팩토리얼은 " + factorial(10));
        System.out.println("10팩토리얼은 " + factorial2(10));
        // 출력 값이 같음 즉 구현 방식에 차이일뿐 똑같은 기능을 함 


        /*
        재귀 함수 같은경우는 이런 재귀함수가 어떻게 작동하는지 머리속으로 그려보는게 중요함 
        f5가 실행되기 위해서는 f4가 필요 f5가 실행됬을때는  5Xf4를 소환하기 때문임 
        이런식으로 f4를 실행하려면 f3 => f2 이렇게 가다가 f2가 f1을 실행하면 1을 반환함 그럼 
        역으로 다시 반환값에서 순차적으로 2X1    =>  3X2 => 6 X 4  이런식으로 진행이 되는 거임 

        즉 어떤 수를 소환했을때 함수를 타고들어가서 마지막 반환값을 가지고 타고나오는게 재귀함수의 특징임 
        */
    }
}
