public class user_defined_function1 {
        //반환형, 함수명, 매개변수
        public static int function(int a, int b, int c) {
            int min;
            if(a > b)
            {
                if(b > c)
                {
                    min = c;
                }
                else
                {
                    min = b;
                }
            }
            else
            {
                if(a > c)
                {
                    min = c;
                }
                else
                {
                    min = a; 
                }
            }
            for(int i = min; i > 0; i--)
            {
                if(a % i == 0 && b % i == 0 && c % i == 0)
                {
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
    // 자바에서 메소드와 함수가 같은 의미임 
    /*
    3개의 수 최대 공약수를 찾는 프로그램을 작성합니다.
    약수 중 k번째로 작은 수를 찾는프로그램을 작성 합니다.
    문자열에서 마지막 단어를 반환하는 함수를 작성합니다.
    max()를 이용하여 최대값을 저장하는 프로그램을 작성합니다.
    */       
        System.out.println("400, 500 750의 최대 공약수: "+ function(400, 500, 750));
    }
}
