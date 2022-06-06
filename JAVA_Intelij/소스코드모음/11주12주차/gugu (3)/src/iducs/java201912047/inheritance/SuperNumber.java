package iducs.java201912047.inheritance;

public class SuperNumber extends Number {

    public  int addValue(){  // 메소드 추가    (시그니처가 다다르니까)
        return 1;
    }

    public int intValue(float f) {     // 중첩(overloading)
        System.out.println("Super Number : intValue()");
        return 0;
    }
    @Override // annotation
    public int intValue(){
        return 0;
    }


    public long longValue() {
        return 0;
    }


    public float floatValue() {
        return 0;
    }

    public double doubleValue() {
        return 0;
    }

}
