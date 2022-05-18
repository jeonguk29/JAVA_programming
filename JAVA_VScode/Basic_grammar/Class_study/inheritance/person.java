package Class_study.inheritance;

public class person {
    /*
    1. 하나의 사람을 의미하는 person클래스를 생성합니다.
    2. person을 상속받아 하나의 학생을 의미하는 Student 클래스를 의미합니다.
    3. Student 클래스를 이용하여 객체를 생성합니다.

    */

    private String name;
    private int age;
    private int height;
    private int weight;
    // 자바에서 기본적으로 보안적인 문제 때문에 프라이빗으로 클레스 변수를 생성하고
    // 이에 대한 값에 접근 하는건 set, get 함수를 이용하는게 표준임
    // 즉 어떤 변수를 만들던 간에 set, get함수를 2개 만들어 줘야함 세계적 표준으로 쓰이고 이클립스 경우 
    // 이것을 위한 단축키가 있음

    public int getWeight() {
        return weight;
    }



    public void setWeight(int weight) {
        this.weight = weight;
    }



    public int getHeight() {
        return height;
    }



    public void setHeight(int height) {
        this.height = height;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }
    
    
    // 생성자도 만들어 줘야함 생성자는 하나의 인스턴스를 만들때 자동으로 그 인스턴스가 가지는 각 변수들을
    // 초기화 하는걸 말함 
    public person(String name, int age, int height, int weight) {
        super(); // 자신에 부모클래스의 생성자를 실행하겠다는 뜻 
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);

    }



}
