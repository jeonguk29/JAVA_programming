public class Ex02_TypeChange1
{
    public static void main(String[] args)
    {
    	int num1 = 1;  // 원래 정수 1,2,3 .. 다 int 4바이트에 해줘야함 
        byte num2 = 1; //  4바이트로 하기로 했는데 1바이트로 해주니까 자바 내부에서 자동 형변환되는거임
        byte num3 = 127;
        byte num4 = 128;
        
        short num5 = 1;

        num2 = num5;
        num2 = (byte)num5;
    }
}
