
package iducs.java201912047.pims.view;
// import iducs.java201912047.pims.view.TUIView; 다른 패키지 클래스 또는 인터페이스 사용 할수 있게됨   지워저셔 주석처리함

public class TUIView { // TUI 텍스트 유져 인터페이스 약자 임

    public void showMenu(boolean isLogin, boolean isRoot){
        if(isLogin == false){
            System.out.print("0, 종료\t");       // 루트가 아니면 기본적인것만 나오게 함
            System.out.print("1, 등록\t");
            System.out.print("2, 로그인\t");
        }
        else{
            if(isRoot == false){
                System.out.print("3, 정보조회\t");
                System.out.print("4, 정보수정\t");
                System.out.print("5, 로그아웃\t");
                System.out.print("6, 회원탈퇴\t");
            }else{
                System.out.print("0, 종료\t");
                System.out.print("3, 정보조회\t");
                System.out.print("4, 정보수정\t");
                System.out.print("5, 로그아웃\t");
                System.out.print("7, 목록조회\t");

            }
        }
    }
}
