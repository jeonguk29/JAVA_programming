package Class_study;

public class Cl_ass {
    public static void main(String[] args) {
                /*
        클래스에 대한 개념을 바르게 이해하고 이를 활용합니다.
        1. 하나의 점을 의미하는 node 클래스를 생성할수 있습니다.
        2. node 클래스를 이용하여 두점 사이의 중점을 구하는 프로그램을 작성합니다.
        */

        node one = new node(10,20); //이부분이 실행됨과 동시에 클래스 안에 생성자가 돌아가서 초기값 설정함 
        node two = new node(30,40);
        node result = one.getCenter(two);
        // 원이라는 노드 인스턴스에서 getCenter(two); 실행해서 원과 투에 정중앙 노드를 생성해서 반환 
        System.out.println("x : " + result.getX() + ", y : " + result.getY()); 
    
        // 즉 클래스는 어떠한 사물의 특징을 살려서 하나의 틀을 만드는것 
        // 실제로 변수로 뽑아내서 사용하는걸 인스턴스화 한다고함 
    }
    
}
