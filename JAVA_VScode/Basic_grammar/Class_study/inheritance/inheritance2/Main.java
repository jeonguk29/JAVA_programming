package Class_study.inheritance.inheritance2;

import java.util.Scanner;

import javax.swing.text.GapContent;


public class Main {
    public static void main(String[] args) {
        
        // Teacher teacher1 = new Teacher("김교수", 40, 180, 50, "19921214", 303000, 13);
        // teacher1.show();

        Student[] students = new Student[10];
        for(int i = 0; i < 10; i++){
            // 학생들이 엄청 많을때는 배열을 이용함 물론 안에 값은 이런식으로 들어가지 앟겠지만 출력시
            // 학번은 다 다르게 적용되는걸 알수 있음 
            students[i] = new Student("홍길동", 20, 175, 70, i + "", 1, 4.5);
            students[i].show();

        }
        // 이게 정말 우리가 실질적으로 사용하고 있는 학생정보 시스템에서 많이 사용하는 관리방법임


        // 사용자 입력 받아 만들어보기
        Scanner scan = new Scanner(System.in);
        System.out.print("총 몇명의 학생이 존재합니까? ");
        int number = scan.nextInt();
        Student[] students2 = new Student[number];
        for(int i = 0; i < number; i++)  // 사용자가 입력한 만큼 배열만들고 입력할수있게함
        {
            String name;
            int age;
            int height;          //임시적으로 일단 변수 만들어줌 초기화 해주기 위해
            int weight;
            String studentID;
            int grage;
            double gPA;
            System.out.print("학생의 이름을 입력하세요 : ");
            name = scan.next();  // 문자열은 그냥 next 하나의 띄어쓰기가 포함되지 않은 문자열 받을수 있음
            System.out.print("학생의 나이를 입력하세요 : ");
            age = scan.nextInt();
            System.out.print("학생의 키를입력하세요 : ");
            height = scan.nextInt();
            System.out.print("학생의 몸무게을 입력하세요 : ");
            weight = scan.nextInt();
            System.out.print("학생의 학번을 입력하세요 : ");
            studentID = scan.next();
            System.out.print("학생의 학년을 입력하세요 : ");
            grage = scan.nextInt();
            System.out.print("학생의 학점을 입력하세요 : ");
            gPA = scan.nextDouble(); // 실수형은 이렇게 해줘야함 

            students2[i] = new Student(name, age,  height, weight, studentID, grage, gPA);

        }
        for(int i = 0; i < number; i++)
        {
            students2[i].show();
        }

        }
    }

