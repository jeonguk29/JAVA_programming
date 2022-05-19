package iducs.java.other; // 오퍼레이터랑 패키지 다름

import iducs.java.operator.MyCalculator;

public class OtherTest {
    public static void main(String[] args) {
        MyCalculator myOperator = new MyCalculator(77,0,"/");
        //System.out.println(myOperator.express());  // .express() 다른 패키지에서 접근 못하게 해서 오류남
    }
}
