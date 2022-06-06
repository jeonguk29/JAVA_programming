package iducs.java201912047;

public class Gugudan extends GugudanSuper{
    public void printDan(){
        // 2단출력 overloading (메소드 이름만 같고, 매개변수 유형/ 갯수가 다름), 메소드 추가
        super.printDan(2); // 상위 클래스 (GugudanSuper)로 부터 생성된 객체의 메소드 호출
    }

    public  void printDan(int reverse)
    { // overriding 재정의 (메소드 이름 뿐 아니라 매개변수 유형/ 갯수가 같음), 메소드 수정
        super.printDan(11 - reverse); // 3단 출력시 8 단나옴
    }
    public void printAll(int rows) // 이것도 overloading
    {
        int cols = 8 / rows; // 한행에 나타나는 단의 수,
        // rows 4인경우 cols2
        // 2단 3단 : 1번째 row
        // 4단 5단 : 2번째 row
        // 6단 7단 : 3번째 row
        // 8단 9단 : 4번째 row
        // rows 2인경우 cols4
        // 2,3,4,5 단 : 1번째 row
        // 6.7.8.9 단 : 2번째 row

        if(rows != 1 && rows !=2 && rows !=4 && rows !=8)
        { // 1,2,4,8 아닌경우 ex 3,5,6,7       if((8% rows) != 0) 위에 이렇게도 가능
            System.out.println("Error>" + rows + "is invalid row number");

        }
        else {
            //1 이거나 2거나 4거나 8인 경우
            for(int sRow = 2; sRow <= 9; sRow = sRow + cols) //rows 만큼 반복
            {
                for(int mul = 1; mul <=9; mul++)
                {
                    for(int dan = sRow; dan < sRow + cols; dan++) // 한 행에 cols 만큼 출력
                    {
                        System.out.printf("%2d * %2d = %2d\t", dan, mul, (dan * mul));
                    }
                    System.out.println();
                }
                for(int i = 0; i < cols; i++){
                    for(int j = 0; j < 12; j++) {
                        System.out.print("-");
                    }
                        System.out.print("\t");
                    }
                    System.out.print("\n");
                }

            }
        }
    }



