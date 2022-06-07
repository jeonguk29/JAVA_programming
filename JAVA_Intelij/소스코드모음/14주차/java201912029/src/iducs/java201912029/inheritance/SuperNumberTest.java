/*
package iducs.java201912029.inheritance;
// ==> import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import iducs.java201912029.polymorpshim.SuperNumber;

public class SuperNumberTest {
    public static void main(String[] args){
        // CLASSPATH 환경변수 : 클래스 라이브러리들을 찾기 위한 경로 정보를 저장한 환경 변수
        //절대 경로 :클래스 라이브러리 중에 해당되는 패키지 정보와 클래스 이름으로 직접 접근
        //상대 경로 :import 사용, 패키지 정보를 공유
        ArrayList<String> list = new ArrayList<>();
        list.add("induk");
        list.add("university");
        list.add("dept");
        list.add("computer");
        list.add("software");

        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        java.util.Collections.sort(list);

        for(int i = 0; i < list.size(); i++) //리스트를 오름차순으로 정렬
            System.out.println(list.get(i));

        SuperNumber superNumber = new SuperNumber();
        System.out.println(superNumber.pubStr);
        System.out.println(superNumber.string);

        /* Number Class  상속 받은 결과 추상 메소드를 재정의만 가능 사용법이 정해짐
        superNumber.intValue();
        if(superNumber.intValue().equals("0"));
        */


         /* if(superNumber.intValue() == 0)
            System.out.println("Super Number : return value is zero");

    }

}
*/
