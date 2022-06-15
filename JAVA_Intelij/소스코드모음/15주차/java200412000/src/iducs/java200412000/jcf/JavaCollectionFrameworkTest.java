package iducs.java200412000.jcf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaCollectionFrameworkTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(); // <String> : Generic
        //ArrayList strArrayList = new ArrayList();
        // ArrayList intArrayList = new ArrayList();
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        String[] elements = args;
        // enhanced for statement, for-each statement
        // sequential access 용이
        elements[2] = "아르곤";
        int i = 1;
        for(String s : elements) {
            System.out.print(s + ", ");
            arrayList.add(s);
        }
        // elements[5] = "오류 발생";
        System.out.println("");
        /*
        arrayList.set(2, 1);
        System.out.println(arrayList.size());
        arrayList.add(5, 3);
        System.out.println(arrayList.size());
        Arrays.sort(arrayList.toArray());
                 */
        Collections.sort(arrayList);
        // Vector : 동적 배열, ArrayList : 동적 배열 리스트 : 자료형 다양 -> 지정
        for(Object s : arrayList) {
            System.out.print(s + ", ");
        }
    }
}
