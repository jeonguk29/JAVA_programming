public class user_defined_function3 {

    public static char function(String input){ // 하나의 문자열을 받아서 단어 하나를 반환함 
        return input.charAt(input.length() -1);
        // String은 클레스로 작성되어서 이러한 내부에 다양한 함수를 이용 할수 있음 
        // charAt 문자를 하나 뽑아오는 함수
        // input.length() -1  인풋이라는 문자열 길이에서 -1 가장 마지막에 있는 문자 하나를 가져오는걸 알수있음
    }
    public static void main(String[] args) {
        System.out.println("Hello world 의 마지막 단어는 " + function("Hello world") + "입니다.");
    }
}
