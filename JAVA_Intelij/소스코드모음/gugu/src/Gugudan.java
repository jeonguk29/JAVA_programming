public class Gugudan extends GugudanSuper {
    public void printAll(int rows)
    {
        if(rows == 1 || rows == 2 || rows == 4)
        {
            for(int i = 2; i <= 9; i++)
            {
                System.out.println(i + "단을 출력 합니다");
                for (int j = 1; j <= rows; j++)
                {
                    System.out.println(i + "X" + j + "=" + (i * j));
                }
                System.out.println();
            }
        }
        else if(rows == 8)
        {
            super.printAll();
        }
        else
        {
            System.out.println(rows + "는 입력 받을수 없습니다");
        }

    }
}
