package iducs.java201912029;

public class Gugudan extends GugudanSuper {
    public void printDan(){ // 2단 출력
        //overloading (메소드 이름만 같고, 매개변수 유형/갯수가 다름), 메소드 추가
        super.printDan(2); // 상위클래스(GugudanSuper)로 부터 생성된 객체의 메소드 호출
    }
    public void printDan(int reverse){ // 2단 출력
        //overriding (메소드 이름뿐만 아니라 매개변수 유형/갯수가 같음), 메소드 수정
        super.printDan(11-reverse); // 상위클래스(GugudanSuper)로 부터 생성된 객체의 메소드 호출
    }
    public void printAll(int rows) {
        int cols = 8 / rows; // 한 행에 나타나는 단의 수.
        //rows 4인경우 cols 2
        // 2단 3단 1번째 row
        //4단 5단  2번째 row
        //6단 7단  3번째 row
        //8단 9단  4번째 row
        //rows 2인경우 cols 4
        // 2단 3단 4단 5단  1번째 row
        //6단 7단 8단 9단  2번째 row

        if (rows != 1 && rows != 2 && rows != 4 && rows != 8) {
            System.out.println("error>" + rows + "is invalid row number");
        } else {
            for (int sRow = 2; sRow <= 9; sRow = sRow + cols) {
                for (int mul = 1; mul <= 9; mul++) {
                    for (int dan = sRow; dan < sRow + cols; dan++) { // 한 행에 cols 만큼 출력
                        System.out.printf("%2d * %2d = %2d\t", dan, mul, (dan * mul));
                    }
                    System.out.println("");
                }
                for (int i = 0; i < cols; i++) {
                    for (int j = 0; j < 12; j++) {
                        System.out.print("-");
                        System.out.print("\t");
                    }
                    System.out.print("\n");
                }
            }
        }
    }
}