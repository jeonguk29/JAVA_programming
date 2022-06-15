package iducs.java200412000.modules;

public class ModulesTest {

    public static void main(String[] args) {
        class Modules { // 중첩클래스, 클래스 안에서만 사용하는 것을 목적으로 함. 상속되지 않음
            public void print() {
                System.out.println("Modules");
            }
        }
        Modules m = new Modules();
        m.print();
        String myString = "Induk University, Dept of Computer Software";
        System.out.println(myString);
        System.out.println(myString.substring(0, 5)); // 0~4번 인덱스 까지, 5개
        // substring(int begin, int end)
        /*
        MyPhone myPhone = new MyPhone();
        myPhone.play();
         */
        new MyPhone().play(); // 익명 클래스(anonymous), 1회성 목적의 객체 생성
    }
}

