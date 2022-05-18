public class Variable {

    final static double PI = 3.141592; // 상수는 메인함수 밖에선언이 되고 
    //  final은  한번 선언되면 절대 바뀔수 없는것을 의미함 즉 상수   
    // static이라는건 하나의 클래스(class Variable)에서 공유하는 어떤 자원이라는걸 말함 

    public static void main(String[] args) {

        int intType = 100; 
        double doubleType = 150.5;
        String stringType = "woogie";

        // 자료형 변수명 값 순서   이런식으로 변수를 초기화 함 

        System.out.println(intType); // println 은 ()내용을 출력후 한칸 줄바꿈 을 해라 
        System.out.println(doubleType);
        System.out.println(stringType);

        // 상수를 이용한 원의 넚이 구하기 
        int r = 30;
        System.out.println(r * r * PI);


    }
}
