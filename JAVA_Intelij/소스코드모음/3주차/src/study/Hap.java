package study;

public class Hap {
    int total;
    private int from, to;
    public Hap(int a, int b) {
        this.from = a;
        this.to = b;

    }

    public int Sum()
    {
        int total = 0;
        for(int i = from; i <= to; i++)
        {
            total = total + i;
        }
        return total;
    }

    public int gauss()
    {
        total = 0;     //int to-al; 오류남 이렇게 선언하면
        //Gaussian summation
        // 1 ~ 100 합은 1+100, 2+99 ... 100+1                      (시험)
        total = (from + to) * (to - from + 1) / 2; // 1, 2를 숫자리터럴
        return total;

    }
}
