public class multi_dimensional_array {
    public static void main(String[] args) {
        /*
        10 X 10의 정수 랜덤 데이터를 생성하여 전체 데이터를 분석합니다.
        */
        int N = 50;
        int[][] array = new int[N][N];
        
        for(int i = 0; i < N; i++)  // 2차원 배열이기때문에 각각의 열과 행을 처리할수 있도록 두개의  변수를 이용해서 2중 for문을 만듬
        {
            for(int j = 0; j < N; j++)
            {
                array[i][j] = (int)(Math.random() * 10); // 0부터 9사이에 어떤 값을 만들어 배열에 넣음
            }
        }

        // 출력
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // 이렇게 해주면 한 행이 끝나면 다음 행 출력 
        }
    }
    
}
