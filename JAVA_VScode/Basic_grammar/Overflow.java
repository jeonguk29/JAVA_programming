public class Overflow {

    final static int INT_MAX = 2147483647; // int형이 나타낼수 있는 최대 값 
    public static void main(String[] args) {
    // 자료형에 따른 각각의 자료형은 자기가 나타낼수 있는 숫자의 한계를 가지고 있음 즉 정해진 범위 내에서만 출력가능함 
    int a = INT_MAX;  // 2147483647
    System.out.println(a+1); // -2147483648    int형이 가질수 있는 가장 작은 값 

    // 저장할수 있는 가장 큰값에서 값이 커지면 가장 작은 값으로 돌아가버림 

    
    // 사칙연산 
    int b = 1;
    int c = 2;
    System.out.println("b + c = " + (b + c));
    System.out.println("b - c = " + (b - c));
    System.out.println("b * c = " + (b * c));
    System.out.println("b / c = " + (b / c));

    }   
}
