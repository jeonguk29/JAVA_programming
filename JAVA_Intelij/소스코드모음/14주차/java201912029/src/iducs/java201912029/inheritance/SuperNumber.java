package iducs.java201912029.inheritance;

public class SuperNumber extends Number{
    public int addValue() { //메소드 추가
        return 1;
    }



    public int intValue(float f) { // 중첩(overloading)
        System.out.println("Super Number : intValue()");
        return 0;
    }

    @Override //annotation
    public int intValue() {
         return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
