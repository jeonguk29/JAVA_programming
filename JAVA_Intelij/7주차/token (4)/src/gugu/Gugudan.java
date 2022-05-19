package gugu;

public class Gugudan extends GugudanSuper{
    public void printAll(int rows) {  // 오버 로딩
        // 1, 2, 4, 8 만 가능  8인 경우 printAll()과 동일함  3인 경우 오류 메시지
        if (rows == 1 || rows == 2 || rows == 4){
            for(int i = 2; i < 10; i++) {
                System.out.println(i + "단을 출력 합니다.");
                for (int j = 1; j <= rows; j++) {
                    System.out.println(i + "x" + j +"=" + i*j );
                }
                System.out.println();
            }

        } else if (rows == 8) {
            super.printAll();
        } else {
            System.out.println(rows + "는 입력받을수 없습니다.");
        }

    }
}
