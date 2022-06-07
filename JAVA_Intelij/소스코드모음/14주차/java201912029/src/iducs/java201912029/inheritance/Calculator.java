package iducs.java201912029.inheritance;

public interface Calculator {
    // 모든 필드는 public static final 임
    // 모든 메소드는 abstarct 메소드임 표시하지 않음
    String name = "Calculator Interface";
    void calculate(); // 공통적으로 구현해야할 외부 인터페이스를 정의

}

