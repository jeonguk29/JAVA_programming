package iducs.java200412000;

public class Gugudan extends GugudanSuper {
    void printAll(int rows) { // 2행, 4 cols, GugudanSuper의 printAll()를 중첩함
        // 중첩(overloading) : 메소드 이름은 같고,
        // 나머지 시그니쳐(매개변수 갯수, 매개변수 타입)가 다른 메소드를 생성하는 것
        // T || T -> T, T || F -> T, F || T -> T
        // && : 하나만 F여도 전체가 F
        if(rows != 1 && rows != 2 && rows != 4 && rows != 8) { // rows가 2이면 첫 조건 T
        //if((8 % rows) != 0) { // rows가 8의 약수인 경우, 1, 2, 4, 8인 경우 0이 아닌 경우
            System.out.println(rows + " is invalid row number! input 1, 2, 4, 8");
        }
        else { // 조건식의 결과가 0이면, 1거나 2거나 4거나 8인 경우
            int cols = 8 / rows; // rows 1, cols 8, rows 2, cols 4, rows 4, cols 2
            //System.out.printf("%d, %d\n", rows, cols);
            for (int srow = 2; srow <= 9; srow = srow + cols) { // rows = 8 / cols 반복
                for (int mul = 1; mul <= 9; mul++) {
                    for (int dan = srow; dan < (srow + cols); dan++)// 한 rows에 cols 만큼 반복
                        System.out.printf("%2d * %2d = %3d\t", dan, mul, (dan * mul));
                    System.out.println("");
                }
            }
        }
    }
}
