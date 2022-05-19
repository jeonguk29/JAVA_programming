public class GugudanSuper {
    public void printDan(int dan)
    {
        System.out.println(dan + "단을 출력 합니다");
        for (int i = 1; i <= 9; i++)
        {
            System.out.println(dan + "X" + i + "=" + (dan * i));
        }
        System.out.println();
    }

    public void printAll()
    {
        for(int j = 2; j <= 9; j++)
        {
            System.out.println(j + "단을 출력 합니다");
            for (int k = 1; k <= 9; k++)
            {
                System.out.println(j + "X" + k + "=" + (j * k));
            }
            System.out.println();
        }
    }
}
