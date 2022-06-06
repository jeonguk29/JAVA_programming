//package iducs.java; // 패키지 선언

public class Hap { // 클래스 선언
    // member field : 객체의 특징, 속성, 자료구조 ...
    int total; // instance variable : 인스턴스 변수, 같은 패키지 안의 클래스는 접근 허용(default)
    private int from, to; // 인스턴스 변수 : 초기화 하지 않는 경우 디폴트 초기화 함 0
    // constructor : 생성자, 객체 초기화
    public Hap(int f, int t) { // f, t를 매개 변수
        from = f; // = : assignment operator , not equality operator
        to = t;
    }
    // method : 객체의 기능, 연산
    public int sum() {
        total = 0;
        // for 예약어, i 지역변수, from 인스턴스 변수, ; 구분자, <= 연산자, ++ 연산자
        for(int i = from; i <= to;i++ ) // i를 지역변수, 초기화하지 않고 사용하면 오류
            total = total + i;           //메소드 안 선언 변수를 지역 변수라고함
        return total;
    }
    // method
    public int gauss() {
        // 식별자는 _, $, 문자, 숫자만 사용할 수 있음 : 식별을 위해 사용하는 명칭
        // 변수 이름, 메소드 이름, 클래스이름, 인터페이스 이름 ..
        total = 0;     //int to-al; 오류남 이렇게 선언하면
        //Gaussian summation
        // 1 ~ 100 합은 1+100, 2+99 ... 100+1                      (시험)
        total = (from + to) * (to - from + 1) / 2; // 1, 2를 숫자리터럴
        // 1부터 백이면 total = (from + to) * (to - from + 1)
        return total;
    }

}