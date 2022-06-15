package iducs.java200412000;

public class GugudanSuper {
    // 한 단을 출력
    void printDan(int dan) {
        for(int row = dan; row <= dan; row++) // 1번 반복
            for(int col = 1; col <= 9; col++) {
                System.out.printf("%2d * %2d = %2d", row, col, (row * col));
                System.out.print("\n");
            }
    }
    // 2 ~ 9 단을 출력,
    void printAll() {
        for(int row = 2; row <= 9; row++ )
            printDan(row); // 8번 호출
    }
}
