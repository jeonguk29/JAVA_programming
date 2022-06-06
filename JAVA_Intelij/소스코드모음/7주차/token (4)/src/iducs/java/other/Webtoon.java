package iducs.java.other;

import java.util.Arrays; // 배열관련 기능 전부다가아닌 조금만 가져와서 쓸때 사용 사용빈도 높은걸로

public class Webtoon {

    private String[] ranking = {"내일", "키드갱", "무장", "화산귀한", "외모지상주의"};


    public String[] getRanking() {
        return ranking;
    }

    public void setRanking(String[] ranling) {
        this.ranking = ranling;
    }

    public void sortRanking()  //void는 리턴타입이 정해지지 않다 라는것 없다랑은 좀 다름
    {
        Arrays.sort(ranking); // 오름차순 정렬
        printRanking();
    }
    public void printRanking(){
        // for : 제어문 - 반복문(횟수제한) 시작을 알려주는 예약어
        // 배열객체는 length 필드를 가짐 (배열의 크기)
        for(int i =0; i < ranking.length; i++)
        {
            System.out.println(ranking[i]);
        }
    }

}
