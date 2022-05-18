
public class iterative_recursive_function2 {

    public static int fibonacci(int number){
        int one = 1;
        int two = 1;
        int result = -1; // 문제가 발생하면 -1 반환 피모나치 수는 몇번째 수던 간게 -1 나올수가 없음 
        
        if(number == 1){
            return one;
        }
        else if(number == 2){
            return two;
        }
        else
        {
            for(int i = 2; i< number; i++)
            {
                result = one + two;
                one = two;   // 계산한다음 한칸씩 밀려야함 
                two = result;
            }
        }
        return result; 
    }

    public static int fibonacci2(int number){
        if(number == 1)
        {
            return 1;
        }
        else if(number == 2)
        {
            return 1;
        }
        else{
            return fibonacci2(number-1) + fibonacci2(number -2);
            // 특정 피보나치 원소 같은 경우는 그 한칸 전의 값과 두칸전의 값을 더한것과 동일 하기 때문임 ex  1 1 2 3 5 8 13   : 13 이면 8 과 5를 더해야함 
        }
    }
    public static void main(String[] args) {
        System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10));
        System.out.println("피보나치 수열의 -10번째 원소는 " + fibonacci(-10));

        System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci2(10));
        // 재귀함수 문제 사진 보면 알수 있듯이 50 번째 구하려면 우주 명망할때 까지도 못구함
        // 즉 같은연산을 너무 비효율적으로 반복해서 수행하고 입력값이 클수록 기하급수적으로 계산량이 늘어남 
        // 재귀함수는 때에따라서는 간결한 코드를 재공하지만 더욱더 많은 시간이 소요될수 있다는걸 알아두기 반복연산에서는 위에 문제점이 하나도 없음  
    }
}
