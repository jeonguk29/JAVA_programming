package gugu;

public class GugudanSuper {
    public void printDan(int dan)
    {
        System.out.println(dan + "단을 출력 합니다.");
        for(int x = 1;  x <= 9; x++)
        {
            System.out.println(dan + " X " + x + " = " + (dan * x));
        }
    }

    public void printAll()
    {
        for(int i = 2; i <= 9; i++)
        {
            System.out.println(i + "단을 출력 합니다.");
            for(int j = 1; j <= 9; j++)
            {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
