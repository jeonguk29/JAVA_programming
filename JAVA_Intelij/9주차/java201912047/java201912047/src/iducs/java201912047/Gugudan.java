package iducs.java201912047;

public class Gugudan extends GugudanSuper{
    public void printAll(int rows) {
        if(rows == 1)
        {
            int i,j; // i=단
            for(i=2;i<=9;i++) {

                for(j=1;j<=9;j++) {
                    System.out.printf("%2d * %2d = %2d", i, j, (i * j));
                }

            }
        }

        else if(rows == 2 )
        {
            int startDan = 2;   // 시작 단
            int endDan = 9;     // 끝 단
            int danPerLine = 4; // 한 줄에 출력할 단수.
            int maxGudan = 9;   // 계산할 구단수

            for (int dadan = startDan; dadan <= endDan; dadan += (rows+2)) {
                // dadan: 맨 왼쪽 단
                for (int gudan = 1; gudan <= maxGudan; gudan++) {
                    int currentDanMax = dadan + ((rows+2) - 1);  // 현재 줄에서 가장 오른쪽에 놓일 단
                    for (int danline = dadan;
                         danline <= ((currentDanMax <= endDan) ? currentDanMax : endDan);
                         danline++) {
                        // 왼쪽 단부터 오른쪽 단까지 한 단씩 출력.
                        // 단 오른쪽 단이 계산할 구단수보다 많으면 그 단 출력 안 함.
                        System.out.print(danline + " * " + gudan + " * " + (danline * gudan) + "\t");
                    }
                    // 다음 줄로 넘기기
                    System.out.println();
                }
                // 지난 문단의 단들과 간격 만들기

            }

        }
        else if(rows == 4 )
        {
            boolean flag = true;
//밑에 3개 변수의 수를 변경하면 구구단 출력형태 변경
            int count = 2; // 옆으로 출력할 단 개수
            int danCount = 9; // 몇 단까지 출력할지
            int hangCount = 9; // 밑으로 출력할 행 개수
            for (int i = 2; i <= danCount; i += count) {
                for (int j = 1; j <= hangCount; j++) {
                    for (int k = 0; k < count; k++) {
                        if (i + k <= danCount) {
                            if (flag) {


                                flag = false;
                            }
                            System.out.print(i + k + " * " + j + " = " + (i + k) * j + "\t");
                        } // end first if
                    } // end third for
                    System.out.println();
                } // end second for
                flag = true;

            } // end first for
        }


        else if(rows == 8)
        {
            super.printAll();
        }
        else
        {
            System.out.println(rows + " is invalid row number! input 1, 2, 4, 8");
        }

    }
}
