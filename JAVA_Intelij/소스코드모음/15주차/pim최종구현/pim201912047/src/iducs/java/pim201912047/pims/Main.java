package iducs.java.pim201912047.pims;
// 다른 패키지의 클래스 또는 인터페이스 사용할 수 있게 함
import iducs.java.pim201912047.pims.controller.PimController;

import java.io.IOException;

public class Main {
    public static void main(String[] arg) throws IOException {
        PimController pimController = new PimController();
        pimController.dispatch(); // 결론적으로 핌컨트롤러 안에 있는 디스패치 호출
        // 컨트롤 + 알트 누르고 메서드 누르면 그 위치로 감

        // Array + List : 배열의 장점, 리스트의 장점을 융합하여 제공

    }
}
