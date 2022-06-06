package study;

public class ConstructorTest {
    public static void main(String[] args) {
        Myconstructor mc = new Myconstructor(); // 객체 생성후 참조변수에 배정          mc가 참조변수임
        // int i = 10 그냥 변수느느 저장 메모리 주소를 따라가면 10이 있고
        // mc는 따라가보면 주소가 있는거임 Myconstructor객체의 주소가 인트랑 똑같이 mc 이놈도 4바이트임 몇 100 바이트 있는 주소만 가지고 있는거라

        System.out.println(mc.getName());
        mc = new Myconstructor("induk");
        System.out.println(mc.getName());

        // 현제 하나의 파일에 두개에 클래스 작성 두개 이상 클래스 작성가능함 하나의 파일에서
        // 이전에는 하나의 파일에 클래스 하나 만듬

        //int 효과적으로 다루기 위한 클래스 integer 정의
        System.out.println(Integer.toBinaryString(1000));
    }
}

class Myconstructor {
    private String name;
    // 디폴트 생성자 - 생성자 중에서 매개변수가 없는 가장 기본이 되는 생성자
    public Myconstructor() { name = "default constructor" ; }
    // 생성자 : 클래스 이름과 같고 리턴타입이 없는 초기화 목적의 메소드
    public Myconstructor(String name) {this.name = name;}
    public String getName(){return name;}
}