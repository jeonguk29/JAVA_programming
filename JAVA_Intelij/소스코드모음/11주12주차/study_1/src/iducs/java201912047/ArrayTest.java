package iducs.java201912047;

public class ArrayTest {
    public static void main(String[] args) {
        // 정수형 배열 객체를 선언, 초기화 후 배정 ( =, assignment)
        int[] grade = {70, 75, 80, 85, 90, 95};

        try {
            for (int i = 0; i <= grade.length; i++) // i <= grade.length; 되면 예러남  < 면 에러 안남
                System.out.println(grade[i]); // grade.length은 6이다. 6번은 없다. 그래서 예러남

        }catch (ArrayIndexOutOfBoundsException aioobe) { // unchecked exception        케시 주석처리 하면 오류남
            System.out.println("인덱스 오류가 발생하여 처리함 ");
        }
        System.out.println("계속 실행되면 좋은데");
    }
}
