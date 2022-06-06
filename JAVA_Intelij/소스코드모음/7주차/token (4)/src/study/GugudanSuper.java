package study;

public class GugudanSuper {
    public void printDan(int dan)
    {
        for(int x = 1;  x <= 9; x++)
        {
            System.out.println(dan + " X " + x + " = " + (dan * x));
        }
    }

    public void printAll()
    {
        for(int i = 2; i <= 9; i++)
        {
            for(int j = 1; j <= 9; j++)
            {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }



    // printDan(int dan) : 지정한 단을 출력한다

  //printAll() : 2 ~ 9 단을 출력한다

}
