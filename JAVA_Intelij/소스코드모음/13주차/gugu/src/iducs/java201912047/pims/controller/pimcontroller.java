package iducs.java201912047.pims.controller;

import iducs.java201912047.pims.repository.MemberRepository;
import iducs.java201912047.pims.repository.MemberRepositorylmpl;
import iducs.java201912047.pims.view.TUIView;
import iducs.java201912047.pims.domain.Member;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pimcontroller {
    //JCF : java collection framework 집합 객체를 효과적으로 다루기 위한 자료구조, 알고리즘 등을 포함하는 클래스 라이브러리
    // 집합 객체를 효과적으로 다루기 위한 자료구조, 알고리즘 등을 포함하는 클래스 라이브러리
    // ArrayList, Stack
    public static Map<String, Member> session = new HashMap<>();  // static  메모리 상주
    public static TUIView tuiView = new TUIView();
    final String MemberDB = "member,txt"; // 파일명, 디렉터리와 파일명으로 식별 가능함
    Member member = null;
    MemberRepository<Member> memberRepository = new MemberRepositorylmpl<>();

    public void dispatch(){ // 가져오기 : 메뉴보여주기, 선택한 메뉴 처리하기, 결과 반환 반복
        TUIView tuiView = new TUIView();
        boolean isLogin = true;  // 이러한 지역변수는 블록이 종료되면 메모리에서 사라짐
        boolean isRoot = false;
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받아서 분석 반환

        int menu = 0;
        do {
            String msg = "";
            tuiView.showMenu( isLogin, isRoot);
            menu = sc.nextInt(); // 숫자 입력 후 엔터키
            //키 입력에 따라 처리
            switch (menu) {
                case 0: msg = "종료"; break;
                case 1: msg = "등록";
                    member = new Member();
                    member.setId(sc.nextLong()); // long
                    member.setEmail(sc.next()); // String
                    member.setPw(sc.next());
                    member.setName(sc.next());
                    //member.setPhone(sc.next());
                    //member.setAddress(sc.next());
                    memberRepository.create(member);
                    break;
                case 2: msg = "로그인"; break;
                case 3: msg = "정보조회"; break;
                case 4: msg = "정보수정"; break;
                case 5: msg = "로그아웃"; break;
                case 6: msg = "회원탈퇴"; break;
                case 7: msg = "회원목록조회";
                    for(Member m : memberRepository.readList())
                        System.out.println(m.getEmail() + ":" + m.getName());
                break;


                default: msg = "입력코드 확인 : "; break;
            }
            System.out.println(msg + "메뉴를 선택하셨습니다.");
        }while (menu != 0); // 메뉴 종료가 0 이라 0이 나니면 계속 반복 해서 도는 거임

    }
}
