package iducs.java202212000.pims.view;

public class TUIView { //TUI : Text User Interface, CUI(Character UI)
    public void showMenu(boolean isLogin, boolean isRoot) {
        if(isLogin == false) {
            System.out.print("0. 종료\t");
            System.out.print("1. 등록\t");
            System.out.print("2. 로그인\n");
        } else {
            if(isRoot == false) {
                System.out.print("3. 정보조회\t");
                System.out.print("4. 정보수정\t");
                System.out.print("5. 로그아웃\t");
                System.out.print("6. 회원탈퇴\n");
            } else {
                System.out.print("0. 종료\t");
                System.out.print("3. 정보조회\t");
                System.out.print("4. 정보수정\t");
                System.out.print("5. 로그아웃\t");
                System.out.print("7. 목록조회\n");
            }
        }
    }
}
