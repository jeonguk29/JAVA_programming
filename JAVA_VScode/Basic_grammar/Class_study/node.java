 package Class_study;

public class node {
    
     // 노드라는건 하나의 좌표를 의미함 2차원 공간에서 어떠한 위치를 말함 
    private int x;
    private int y;  // x랑 y를 외부에서 함부로 바꿀수 없게 프라이빗으로 만들어줌 
    
    public int getX()
    {  // x와 y의 값을 가져오기위해 따로 함수를 만들어서 외부에서 접근할수 있도록 만들어줌 퍼블릭으로 
        return x;
    }
    public void setX(int x) {  // 이건 x의 값을 설정하기위해 만듬
        this.x = x; 
        //  지금 이 클래스 안 x 를 외부에서 지정해준 x값으로 바꾸겠다라는 뜻 

    }
    
    public int getY()
    {
        return y;
    }
    public void setY(int y) {  
        this.y = y; 
    }
    
    public node(int x, int y)   //생성자 인스턴스 즉 객체를 만들어줄때 자동으로 값들을 초기화 해주는 하나의 함수임 
    {  // 생성자 특징은 클레스랑 동일한 이름을 가짐 
        this.x = x;
        this.y = y;
    }
    
    public node getCenter(node other){
            //  getCenter(node other) 다른 노드를 매개변수로 받음  즉 자신이 가지고있는 x,y좌표와 입력받은 다른 노드의 x, y좌표를 비교해서 정확히 
            // 정중앙을 가지는 좌표를 반환할수 있도록 하는 거임 그래서 반환형이 node임 
        return new node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
            // x, y좌표의 정중알값을 가지는 하나의 노드 인스턴스를 반환 
    }
    }
    


