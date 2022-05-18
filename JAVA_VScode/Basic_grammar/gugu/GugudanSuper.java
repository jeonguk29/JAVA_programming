package gugu;

public class GugudanSuper {

    public static void printDan(int dan)
    {
        // printAll(int rows) : 지정한 row 수로 출력한다.  1, 2, 4, 8 
        //만 가능  8인 경우 printAll()과 동일함 
        // 3인 경우 오류 메시지

        if(dan == 8)
        {
            for(int i=2; i < 10; i++) 
            { 
                System.out.println(i + "단을 출력 합니다."); 
                for(int j=1; j < 10; j++) 
                { 
                    System.out.println(i + " x " + j + " = " + i * j); 
                } 
                System.out.println();
            }
        }
        else if(dan == 3) 
        {

            System.out.println("응구 ㅆㅃ");
        }
        else if(dan == 1) 
        {
                System.out.println(dan + "단을 출력 합니다."); 
                for(int j=1; j < 10; j++) 
                { 
                    System.out.println(dan + " x " + j + " = " +  dan * j); 
                } 
                System.out.println();
        }
        else if(dan % 2 == 0)
        {
            System.out.println(dan + "단을 출력 합니다."); 
                for(int j=1; j < 10; j++) 
                { 
                    System.out.println(dan + " x " + j + " = " + dan * j); 
                } 
                System.out.println();
        } 


        
    }

    public static void printDan2(int dan)
    {
        
            System.out.println(dan + "단을 출력 합니다."); 
            for(int j=1; j < 10; j++) 
            { 
                 System.out.println(dan + " x " + j + " = " + dan * j); 
            } 
            System.out.println();
        
    }

    public static void printAll() //printAll() //: 2 ~ 9 단을 출력한다
    {
        for(int i=2; i < 10; i++) 
        { 
            System.out.println(i + "단을 출력 합니다."); 
            for(int j=1; j < 10; j++) 
            { 
                 System.out.println(i + " x " + j + " = " + i * j); 
            } 
            System.out.println();
        }
    }


    
}
