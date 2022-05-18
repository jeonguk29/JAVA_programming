package gugu;

public class Gugudan extends GugudanSuper {//     Gugudan.java  GugudanSuper 클래스를 상속받아 구현한다
    public static void printAll(int rows) 
    {
        
        for(int i = rows; i <= 9 ; i++)
        {
            for(int j = 1; j <= 9 ; i++)
            {
                System.out.println(i* j);
            }
        }
    }
//  printAll() : 지정한 row 수로 출력한다.  1, 2, 4, 8 만 가능  8인 경우 printAll()과 동일함  3인 경우 오류 메시지
}
