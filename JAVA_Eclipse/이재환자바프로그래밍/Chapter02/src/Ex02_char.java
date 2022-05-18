public class Ex02_char
{
    public static void main(String[] args)
    {
        char ch1 = 'A';     // 자바가 인코딩을 합니다.
        char ch2 = 65;      // 10진수로 직접 문자의 값을 넣어줍니다.
        char ch3 = 0x41;    // 16진수로 직접 문자의 값을 넣어줍니다.
        char ch4 = 0b0000000001000001;
        					// 2진수로 직접 문자의 값을 넣어줍니다.

        System.out.println(ch1); // 자바가 문자형 변수인걸 확인해서 디코딩 해서 출력
        System.out.println(ch2); 
        System.out.println(ch3);
        System.out.println(ch4);
    }
}
