package iducs.java200412000;

public class PolymorphismTest {
    public static void main(String[] args) {
        int k = 15; //
        // 32bit :  00 00 00 0F (16진법), 0000 0000 0000 0000 0000 0000 0000 1111 (2진법)
        int i = 509;
        String s = "" + i; // "" + i : i 정수값을 문자열화, int -> String 형변환
        System.out.println(i + " 이진수 표기는 ? " + Integer.toBinaryString(i));
        Human human = new Adult();
        human.fee();
        human = new Child();
        human.fee();
        human = new Teenager();
        human.fee();
    }
}
