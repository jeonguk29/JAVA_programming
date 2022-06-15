package iducs.java200412000.exceptions;

public class ArrayTest {
    public static void main(String[] args) {
        int[] grade = {95, 90, 85, 80, 75, 70, 65, 60};
        String[] strGrade = {"96", "구십", "85"};
        for(String s : strGrade) {
            try {
                System.out.println(ArrayTest.numberToString(Integer.parseInt(s)));
            } catch (NumberFormatException nfe) {
                System.out.println(s + "는 정상적인 값이 아닙니다. ");
                System.exit(0);
            }
        }
        /*
        // for(int i = 0; i < grade.length; i++)
        for(int i = 0; i <= grade.length - 1; i++) {
            int k = 1000 / (grade[i] % 80);
            try {

            } catch(Exception e) { // 모든 checked exception의 수퍼 클래스
                System.out.println(e.getMessage().equals("/ by zero")? "0으로 나눌수 없습니다.":e.getMessage());
            }
            System.out.println(ArrayTest.numberToString(grade[i]));
        }
         */
    }
    public static String numberToString(int i) { // 정적 메소드, 클래스 메소드
        String rtn;
        if(i <= 100 && i >= 95)             rtn = "A+";
        else if(i >= 90)            rtn = "A0";
        else if(i >= 85)            rtn = "B+";
        else if(i >= 80)            rtn = "B0";
        else if(i >= 75)            rtn = "C+";
        else if(i >= 70)            rtn = "C0";// 70 <= i < 75
        else            rtn = "F";
        return rtn;
    }
}
