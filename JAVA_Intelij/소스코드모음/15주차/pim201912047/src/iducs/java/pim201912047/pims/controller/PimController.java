package iducs.java.pim201912047.pims.controller;


import iducs.java.pim201912047.pims.domain.Member;
import iducs.java.pim201912047.pims.service.MemberService;
import iducs.java.pim201912047.pims.service.MemberServiceImpl;
import iducs.java.pim201912047.pims.view.MemberView;
import iducs.java.pim201912047.pims.view.TUIView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PimController {
    // JCF : Java Collection Framework -
    // 집합 객체를 효과적으로 다루기 위한 자료구조, 알고리즘 등을 포함하는 클래스 라이브러리
    // ArrayList, Stack
    public static Map<String, Member> session = new HashMap<>(); // static : 메모리 상주
    // 키와 벨류를 다루는 객체를 말함

    public static TUIView tuiView = new TUIView(); // 계속 매뉴 보여주도록 하는놈임 스태틱이라 전체에서 사용가능하게 만들어줌

    final String MemberDB = "db201912047.txt"; // 파일명, 디렉터리와 파일명으로 식별 가능함
    Member member = null; // 객체 안에 입력된 숫자에 따라 작업을할 사용자 객체 생성
    MemberService<Member> memberService;
    MemberView memberView = null;
    public PimController() {
        memberService = new MemberServiceImpl<>(MemberDB);
        memberView = new MemberView();
    }

    public void dispatch() { // 가져오기 : 메뉴보이기, 선택한 메뉴 처리하기, 결과 반환 반복
        boolean isLogin = false; // 지역변수는 선언된 블록이 종료되면 메모리에서 사라짐 현제 디스패치가 끝나면 사라짐
        boolean isRoot = false;
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받아서 분석 반환
        memberService.readFile();//파일로 부터 사용자 목록 정보 읽기
        int menu = 0;
        do {
            Member sessionMember = (Member) session.get("member");
            if(sessionMember != null) {
                isLogin = true; // 로그인 표시
                if(sessionMember.getEmail().contains("admin"))
                    isRoot = true; // 관리자 표시
            } else {
                isLogin = false;
                isRoot = false;
            }

            String msg = "";
            tuiView.showMenu(isLogin, isRoot); // 쇼매뉴 메소드로 매뉴 보여줌
            menu = sc.nextInt(); // 숫자 입력 후 엔터키 숫자 받아서 아래와 같은 작동을 처리
            switch(menu) {
                case 0: msg = "종료";
                    memberService.saveFile(); // memberdb.txt 에 저장
                    break;
                case 1: msg = "등록";
                    member = new Member(); // 동록 하기로 해서
                    member.setId(sc.nextLong()); // Long 값을 입력받음
                    member.setEmail(sc.next()); // String 값을 입력 받아 넣음
                    member.setPw(sc.next());
                    member.setName(sc.next());
                    member.setPhone(sc.next());
                    member.setAddress(sc.next());
                    memberService.postMember(member); // 생성한걸 담음 즉 하나씩 입력하면 하나하나 들어가고 7번 누르면
                    memberView.printOne(member);
                    memberView.printMsg(msg + "를 성공했습니다.");
                    break;
                case 2: msg = "로그인";
                    String id = sc.next();
                    String pw = sc.next();
                    member = (Member) memberService.login(id, pw);
                    if(member != null) {
                        isLogin = true;
                        if(member.getEmail().contains("admin"))
                            isRoot = true;
                        session.put("member", member);
                        memberView.printMsg(msg + "를 성공했습니다.");
                    }
                    else
                        memberView.printMsg("로그인 정보 확인 바랍니다. "); // View 전달
                    break;
                case 3: msg = "정보조회";
                    // printOne : 하나의 member 정보 출력
                    memberView.printOne(memberService.getMember(
                            (Member) session.get("member")));
                    memberView.printMsg(msg + "를 성공했습니다.");
                    break;
                case 4: msg = "정보수정";
                    member = new Member();
                    member.setId(sessionMember.getId()); // id 변경 불가(같은 값으로 설정)
                    member.setEmail(sessionMember.getEmail()); // email 변경 불가
                    member.setPw(sc.next());
                    member.setName(sc.next());
                    member.setPhone(sc.next());
                    member.setAddress(sc.next());
                    if(memberService.putMember(member) > 0) {
                        memberView.printOne(member);
                        memberView.printMsg(msg + "를 성공했습니다.");
                    }
                    else
                        System.out.println("수정에 실패하였습니다. ");
                    break;
                case 5: msg = "로그아웃";
                    memberService.saveFile();
                    memberService.readFile();
                    if(session.get("member") != null) {
                        session.remove("member");
                    }
                    memberView.printMsg(msg + "를 성공했습니다.");
                break;
                case 6: msg = "회원탈퇴";
                    memberView.printMsg(msg + "를 성공했습니다.");
                    break;
                case 7: msg = "회원목록조회";
                    memberView.printList(memberService.getMemberList()); // 현제 리스트 들어간거 다 출력
                    memberView.printMsg(msg + "를 성공했습니다.");
                    break;
                default:
                    msg = "입력 코드 확인 :"; break;
            }
        } while(menu != 0);
    }
}
