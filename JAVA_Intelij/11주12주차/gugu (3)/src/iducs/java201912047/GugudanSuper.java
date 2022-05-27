package iducs.java201912047;

public class GugudanSuper {

    void printDan(int dan) {
        for(int row = dan; row <= dan; row++)
            for(int col = 1; col <= 9; col++) {
                System.out.printf("%2d * %2d = %2d", row, col, (row * col));
                System.out.print("\n");
            }
    }
    void printAll() { // 같은 패키지 사용가능 디폴트 접근 수정자라
        for(int row = 2; row <= 9; row++ )
            printDan(row);
    }
}
