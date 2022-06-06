package iducs.java.other;

public class WebtoonTest {
    // java application의 시작점
    public static void main(String[] args) {

        int i = Integer.MAX_VALUE;
        int j;
        j = i + 1;  // overflow 발생
        float f;
        f = i;

        System.out.println(i + " : " + j);
        System.out.println(i + " : " + f); // 2147483638 6백 단위까지느 손상이 없으나 그 아아래는 손상됨        (5e9로 나옴)
        //  float 가 더 큰숫자를 표현 할수 있지만 ppt 10쪽 유효숫자 잘봐 유효숫자 아는게 중요함

        Webtoon webtoon = new Webtoon();
        webtoon.printRanking();
        webtoon.sortRanking();
        // string 배열 객체, 인덱스는 0 시작
        // 배열 객체: 동일한 자료형을 갖는 순서가 있는 원소들의 집합을 다루는 객체
        String [] newRanking = {"판사이한영", "장풍전", "베가본드"};
        webtoon.setRanking(newRanking);
        webtoon.printRanking();
        // 문자 배열
        char[] ch = {'\"','i', 'n', 'd', 'u', 'k', '\"'}; // 2byte 코드 체계임
        for(int idx = 0; idx < ch.length; idx++)
        {
            System.out.print(ch[idx]);// \n : new line을 의미하는 이스케이프 문자

        }
    }
}
