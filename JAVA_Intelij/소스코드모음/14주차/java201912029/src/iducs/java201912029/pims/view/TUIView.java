package iducs.java201912029.pims.view;

import iducs.java201912029.pims.Main;

public class TUIView { //TUI : Text User Interface
    public void showMenu(boolean isLogin, boolean isRoot) {
        if(isLogin == false) {
            System.out.print("0. 종료\t");
            System.out.print("1. 등록\t");
            System.out.print("2. 로그인\t");
        } else {
            if(isRoot == false) {
                System.out.print("3. 정보조회\t");
                System.out.print("4. 정보수정\t");
                System.out.print("5. 로그아웃\t");
                System.out.print("6. 회원탈퇴\t");
            } else {
                System.out.print("0. 종료\t");
                System.out.print("3. 정보조회\t");
                System.out.print("4. 정보수정\t");
                System.out.print("5. 로그아웃\t");
                System.out.print("7. 목록조회\t");
            }
        }
    }
}
