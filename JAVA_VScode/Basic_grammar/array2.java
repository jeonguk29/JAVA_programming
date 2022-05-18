public class array2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < 100; i++){
            array[i] = (int) (Math.random() * 100 + 1);
            // Math.random()은 0 <  N  < 1   을 반환함 실수형태로 즉 0.112312 , 0.23343 이런식으로 
            // 그 값에 100을 곱하면 0 < N < 100   거기다 1을 더하면 1 <  X < 101 
            // 즉 1부터 100까지의 숫자가 되는것임 그리고 (int) 해줌으로 .12312 같은 실수를 다 뺴버림 즉 정수만 남음 

        }
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += array[i];
        }
        System.out.println("100개의 랜덤 정수의 평균값은 : " + sum / 100 + "입니다.");

        /*
            몇번 실행해도 50에 가까운 수 나옴 지금 데이터가 100개인데 1부터 100까지라 통개적으로 그 평균 값인 50에 수렴하는 것임 
        */
    } 
    
}
