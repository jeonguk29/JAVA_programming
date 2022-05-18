public class Data_Type {
    public static void main(String[] args) {
        /*
        자바에서는 변수 초기화를 하지 않으면 사용할 수 없습니다.
        정수를 나타내는 타입만 해도 shot, int, long으로 다양합니다
        정수 변수 안에 실수를 넣으면 정수 부분만 변수에 저장됩니다
        실수 값을 반올림 할때는 변수에 0.5를 더한뒤에 정수형으로 형변환을 하면 됩니다
        반올림한 값 = (int) (실수 + 0.5);
        */

        // int a = (int) 0.5;  // (int) 해줌으로 실수형을 정수형으로 형변환 소수점 자리 뒷 부분제거됨 

        double b = 0.5;
        int up = (int) (b + 0.5); // 어떤 실수형이던 반올림해서 넣어줌 
        System.out.println(up);
        
        /*
        double 형을 이용하여 평균을 구하는 프로그램을 작성합니다.
        아스키 코드 기반의 char형을 사용해 a부터 z까지 출력하는 프로그램을 작성합니다.
        10진수를 8진수 혹은 16진수로 바꾸어 출력해 봅시다.
        string의 substring함수를 활용해봅니다

        */
        double a1 = 10.3;
        double a2 = 9.6;
        double a3 = 10.1;
        System.out.println((a1 + a2 +a3) / 3);
    
        for(char i = 'a'; i <= 'z'; i++)
        {
            System.out.print(i+" ");  // 내부적으로 a부터 z까지는 아스키코드라는걸 사용해서 컴퓨터 내부적으로 1식 증가시키면서 다음 알파벳으로 넘어감             
        }

        int a = 200;
        System.out.println("10 진수 : " + a);
        System.out.format("8 진수 : %o %n" , a);   // %n \n 은 줄바꿈        https://plas.tistory.com/18   참고 
        System.out.format("16 진수: %x \n" , a);

        // substring 메서드 : https://jamesdreaming.tistory.com/81 참고 
        String name = "woogie hi";
        System.out.println(name);
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(3,6)); // sting 자료형안에는 내부적으로 substring라는 함수를 담고 있음 

        // sting 자료형이 비원시 자료형으로 불리는 이유는 내부적으로 substring 같은 내부적인 함수가 존재하기 때문임 한마디로 훨씬 편리하고 이자바에서 제공하는 어떠한 특징적이고
        // 특수한 자료형이라고 할 수 있음 

        /*
        기본적으로 정수를 나타내는 자료형이 많은 이유는 각 자료형이 차지하는 메모리 공간의 크기가 다르기 때문
        double 형이라고 하더라도 과도하게 큰수를 저장하고자 하면 잘못된 계산 결과가 나올수 있습니다
        소수점 표기 형식을 지수 형식으로 출력하고 싶르면 %e 를 이용하면 됩니다
        
        자바에서 string형은 내부적으로char형에 배열로 되어있습니다 자바에서 string 최대 크기는 어떻게 될까요? => 무려 4기가 바이트   몇억글자  ㅎㄷㄷ... 거의 무한에 가까움
        자바에 string은 클래스 기반의 비원시적인 자료형입니다

        */
    }
}
