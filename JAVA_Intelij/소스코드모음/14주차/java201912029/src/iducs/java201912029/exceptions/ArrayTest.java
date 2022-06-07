package iducs.java201912029.exceptions;

public class ArrayTest {
    public static void main(String[] args) {
        //정수형 배열 객체를 선언, 초기화 후 배정 (=, assignment)
        int[] grade = { 70, 75, 80, 85, 90, 95}; // 0 - 70, 5 -95
        try {

            for (int i = 0; i < grade.length; i++)
                System.out.println(grade[i]); // grade length은 6이다. 없다.
        } catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("인덱스 오류가 발생하여 처리함");
            System.exit(0);
        }
        System.out.println("계속 실행되면 좋은데");
    }
}
