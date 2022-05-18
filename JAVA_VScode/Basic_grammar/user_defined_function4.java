
public class user_defined_function4 {
    public static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }
    public static int function(int a, int b, int c)
    {
        int result = max(a, b);      // 이렇게 함수를 여러개 만들어서 각각 모듈화해서 아주 짧게 코드를 작성할수 있음 
        result = max (result, c);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("(345, 567, 789)에서 가장 큰 값은" + function(345, 567, 789) + "입니다.");
        // 참고로 main 메서드 또한 하나의 함수라고 할수 있음 main 메서드는 종료되면 프로그램이 종료되는것과
        // 같이 때문에 반환형이 없다라는 뜻의 void를 사용하는 걸 알수 있음 
        //String[] args 이거는 처음에 콘솔창에서  프로그램을 실행할때 인자 값을 넣어주는걸 말하는데
        //사실  사용되는 경우가 없음 신경 안써도 됨 
    }
}
