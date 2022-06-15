package iducs.java200412000;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ClassConversionTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        Stack<String> stack = new Stack<>();
        vector.parallelStream();

        stack.peek();
        stack.parallelStream();//java.util.Collection 인터페이스로 부터 정의한 추상메소도드

        Object object = stack;
        ((Stack) object).peek();




        String str = new String("String");
        StringBuffer sb = new StringBuffer("StringBuffer");
        str = str + "append"; // 객체가 2개, "String"와 ""Stringappend" 객체가 존재
        sb.append("append"); // 객체가 하나 "StringBuffer" 대신 "StringBufferappend" 새 객체만 존재
        System.out.println(str);
        System.out.println(sb);
        if(str instanceof String)
            System.out.println("str is String");
        if(sb instanceof Object)
            System.out.println("sb is String");

        List listOfString = new ArrayList(); // 배열&리스트 클래스 : 배열을 효과적으로 다루기 위해서
        listOfString.add("String"); // Object가 모든 클래스의 최상위 클래스
        listOfString.add(new Object());
        listOfString.add(Integer.valueOf(100)); // String, Integer 클래스도 Object 클래스를 상속받고 있음
        listOfString.add(new Gugudan());


        Object s1 = (String) listOfString.get(0); // String 유형이 들어가 있음, 다운캐스팅
        ((String) s1).substring(2,4);
        Gugudan s2 = (Gugudan) listOfString.get(2); // Integer 유형이 들어가 있음
        s1 = (Gugudan) listOfString.get(3); // Integer 유형이 들어가 있음
        //s2.printAll();
        // s3.printAll(); 오류, s3은 Object 형 객체를 참조하는 변수라고 문법적으로 간주함
        ((Gugudan)s1).printAll();

        List<String> listOfString1 = new ArrayList(); // Genrics : 컴파일 시점에 유형을 확인
        listOfString1.add("String");
        //listOfString1.add(new Gugudan());
        //listOfString1.add(Integer.valueOf(100));
    }
}
