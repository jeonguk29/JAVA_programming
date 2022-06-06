package iducs.java201912047.inheritance;
//import java.util.*; // 이렇게 상대접근 방식 쓰면 아래 java.util. 이거 나올때 마다 쓸 필요 없음 * 이건 안에 있는 클래서 다가져와라 라는 뜻
// import iducs.java201912047.polymorphism.SUperNumber;        import  있는게 우선임
import java.util.ArrayList;
public class SUperNumberTest {
    public static void main(String[] args) {
        SuperNumber superNumber = new SuperNumber();

        // CLASSPATH 환경변수 : 클래스 라이브러리들을 찾기위한 경로 정보를 저장한 환경 변수
        // ArrayList<String > list = new ArrayList<>(); 이렇게만 하면 못씀
        // 절대경로 : 클래스 라이브러리 중에 해당 되는 패키지 정보와 클래스 이름으로 직접 접근
        // 상대경로 : import 사용, 패키지 정보를 공유
        java.util.ArrayList<String > list = new ArrayList<>(); // 절대경로 이용
        list.add("induk");
        list.add("university");
        list.add("dept");
        list.add("computer");
        list.add("software");
        // list.add(7); 오류남 위에 <String >  넣으라고 했으니 이런걸 제너릭 이라고함

        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        java.util.Collections.sort(list);   // 리스트를 오름 차순으로 정렬
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));





        /* Number Class 상속받은 결과, 추상메소드를 재정의만 가능, 사용법이 정해짐
          superNumber.intValue(7);
          if(superNumber.intValue().equals("0"));
        */
        if(superNumber.intValue() == 0)
        {
            System.out.println("Super Number : return value is zero");
        }
    }
}
