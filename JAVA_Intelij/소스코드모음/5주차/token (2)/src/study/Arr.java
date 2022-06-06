package study;

import java.util.Arrays;

public class Arr {

    private String[] str = {"나","가","다","라"};

    public String[] getStr() {
        return str;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public void sort()
    {
        Arrays.sort(str); // 중요
        prtstr();
    }

    public void prtstr()
    {
        for(int i=0; i < str.length; i++)
        {
            System.out.println(str[i]);
        }
    }


}
