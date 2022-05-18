package Class_study.inheritance;

public class Student extends person {
    // extends person 이렇게 해주면 상속을 하라는 뜻임 
    private String studentID;
    private int grage;
    private double GPA;
    public String getStudentID() {
        return studentID;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double gPA) {
        this.GPA = gPA;
    }
    public int getGrage() {
        return grage;
    }
    public void setGrage(int grage) {
        this.grage = grage;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Student(String name, int age, int height, int weight, String studentID, int grage, double gPA) {
        // 변수 안에는 name, age 이런게 없는데 있는이유는 개발 편의성을 생각해서 
        // 자식이 상속받은 클래스의 변수또한 한번에 초기화 해주는걸 의미함 
        super(name, age, height, weight); // super()는 아까 말했든이 자신에 부모가 가진 생성자를 실행하겠다는 의미임
        this.studentID = studentID;
        this.grage = grage;
        GPA = gPA;
    }
    // 즉 이런식으로 Student가 person 의 상속을 받았기 때문에 코드안에는 안나와 있지만 자동적으로 name, age, height,weight
    // 까지 한번에 자신의 변수로 사용하게 되는 겁니다. 
    public void show() {
        System.out.println("-------------------------------------");
        System.out.println("학생이름 : " + getName());
        System.out.println("학생나이 : " + getAge());
        System.out.println("학생 키 : " + getHeight());
        System.out.println("학생 몸무게 : " + getWeight());
        System.out.println("학번 : " + getStudentID());
        System.out.println("학년 : " + getGrage());
        System.out.println("학점 : " + getGPA());
    }
}
