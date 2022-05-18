import java.util.Scanner;

public class array1 {

    public static int max(int a, int b){
        return(a > b) ? a : b;
    }
    public static void main(String[] args) {

        /*
        원하는 개수 만큼의 배열 생성및 최대 값을 구하는 프로그램을 작성합니다.
        100개의랜덤 정수의 평균을 구하는 프로그램을 작성합니다

        배열 만드는 방법 
        int [] array = new int[100]; 
        이게 하나의 배열을 만드는 문법이라고 생각하기 int [] 인트형 배열을 만들거다 이릉은 array 
        new는 인스턴트를 생성하는 문법이라고 생각하기 int[100] 즉 int형 100개의 크기만큼 
        그리고 생성할 크기의 -1 빼는게 인덱스 마지막 즉 99 첫시작은 항상 0 
        */

        Scanner scanner = new Scanner(System.in);  // 스케너 라이브러리 이용해 입력값을 받을수 있도록 할거임 
        // 이런식으로 import를 사용하는 이유는  Scanner 라는 것은 java가 일반적으로 컴파일 단계에서 사용되는 라이브러리가 아니기 때문임 
        // 이러한 것들을 자바가 다 가지고 있다면 프로그램이 무거워 질거임  그래서 굉장히 이런식으로 가볍게 해준다음에 불러오는것임 
        System.out.print("생성할 배열의 크기를 입력하세요 : ");
        int number = scanner.nextInt(); 
        int[] array = new int[number];
        for(int i = 0; i < number; i++){
            System.out.print("배열의 입력할 정수를 하나씩 입력하세요(양수) : ");
            array[i] = scanner.nextInt();
        }
        int result = -1;
        for(int i = 0; i <  number; i++)
        {
            result = max(result, array[i]);
        }
        System.out.println("입력한 모든 정수중에서 가장 큰 값은 : " + result + "입니다.");
        scanner.close();

    }
}
