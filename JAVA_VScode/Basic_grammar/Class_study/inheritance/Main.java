package Class_study.inheritance;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("홍길동", 20, 175, 70, "20170101", 1, 4.5);

        Student student2 = new Student("이순신", 30, 175, 70, "20190101", 1, 4.5);
        student1.show();
        student2.show();

        // 메인함수가 엄청 간결해짐 메인함수는 만들어놓은 클래스를 불러서 아용만 할뿐임 
        // 실제 코드를 이런식으로 체계적으로 분류해서 설계하게 되면은 객체지향 장점을 그대로 누릴수 있는거임
        // 이게 객체지향이 가질수 있는 가장 큰장점이자 개별적인 특성을 세부적으로 분류해서 관리할수 있는 기법이 되는거임
    }
}
 