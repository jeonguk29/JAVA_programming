import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input_Output2 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        // File 입출력은 자바에서 지원하는 FLIE 클래스 사용함 File("input.txt"); 이파일을 읽어와서 이 파일을 file변수가 처리할수 있도록 해주는것
        try {
            Scanner sc = new Scanner(file); //입력을 사용자가 하는게 아니라 파일이 해서 파일변수를 넣어주면됨
            while(sc.hasNextInt())
            {
                System.out.println(sc.nextInt() * 100);
            }
            sc.close(); // 정상적으로 파일 입출력 끝나면 종료시켜줌 
        } catch (FileNotFoundException e) {
            System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
        }


        /*
        try catch문을 이용해서 파일이 없는경우에 대한 예외처리를 할도록 자바에서는 권고함 FileNotFoundException라는 오류생기면
        내려가서 메세지 출력시킴 

        sc.hasNextInt()    sc가 읽어오는 파일에서 정수가 있는지 물어보는것임 
        정수가 있다면 그 값에 100을 곱함 


        기본 입출력 팁!
        1. 자바에서는 Scanner 클래스만 장 활용해도 다양한 입출력 형태를 자유자재로 구사할수 있습니다.
        2. 주석은 일단 최대한 많이 작성하는 습관을 들이세요. 주석은 컴파일 단계에서 제거 되기에 프로그램의 크기와는 상관 없습니다
        3. Scanner로 문자열을 입력받고 싶을때는 next()함수와 nextLine()을 적절히 사용할수 있습니다.
        */
    }
}
