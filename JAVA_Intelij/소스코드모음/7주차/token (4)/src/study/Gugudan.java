package study;

public class Gugudan extends GugudanSuper {
    public void printAll(int rows) {  // 오버 로딩
        // 1, 2, 4, 8 만 가능  8인 경우 printAll()과 동일함  3인 경우 오류 메시지
        if(rows == 8)
        {
            super.printAll();
        }
        else if(rows == 1 || rows == 2 || rows == 4 )
        {
            super.printDan(rows);
        }
        else
        {
            System.out.println( rows + "는 입력받을수 없습니다.");
        }

    }
}
