// 연관된 클래스, 인터페이스, 예외, 열거형의 모음
// 패키지 안에 존재하는 요소들간의 더 많은 접근을 허용 (default 접근 허용)
// private, default, protected, public
// package iducs.java

// Main class
public class Main {
    // main method
    public static void main(String[] args) {
        System.out.println("standard io : run11");
        // Hap 클래스로 부터 객체를 생성하고
        // 그 객체에 대한 참조정보를 hap이라는 참조변수에 배정
        // hap에게 요청하면 hap가 실제 객체에게 전달
        Hap hap = new Hap(1, 100);
        // hap.total 접근 허용, hap.from 접근 불허용
        System.out.println("합은 " + hap.gauss());
        System.out.println("합은 " + hap.sum());
    }
}
