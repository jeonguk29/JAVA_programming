package iducs.java201912029.pims;

import iducs.java201912029.pims.controller.PimController;
import iducs.java201912029.pims.view.TUIView; // 다른 패키지의 클래스 또는 인터페이스 사용할 수 있게함

public class Main {
    public static void main(String[] args) {
        PimController pimController = new PimController();
        pimController.dispatch();
    }
}