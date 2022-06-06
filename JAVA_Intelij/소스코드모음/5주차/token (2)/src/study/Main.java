package study;

public class Main {
    public static void main(String[] args) {
        Arr s = new Arr();
        String[] s2 = {"A","C","B"};
        s.sort();
        s.setStr(s2);
        s.sort();


        char[] ch = {'\"','i', 'n', 'd', 'u', 'k', '\"'}; // 2byte 코드 체계임
        for(int idx = 0; idx < ch.length; idx++)
        {
            System.out.print(ch[idx]);// \n : new line을 의미하는 이스케이프 문자

        }


    }
}
