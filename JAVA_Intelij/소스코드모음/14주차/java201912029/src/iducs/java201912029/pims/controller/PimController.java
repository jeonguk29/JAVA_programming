package iducs.java201912029.pims.controller;

import iducs.java201912029.pims.domain.Member;
import iducs.java201912029.pims.repository.MemberRepository;
import iducs.java201912029.pims.repository.MemberRepositoryImpl;
import iducs.java201912029.pims.service.MemberService;
import iducs.java201912029.pims.service.MemberServiceImpl;
import iducs.java201912029.pims.view.MemberView;
import iducs.java201912029.pims.view.TUIView;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PimController {
    //JCF : java collection framework -
    // 집합 객체를 효과적으로 다루기 위한 자료구조, 알고리즘 등을 포함하는 클래스 라이브러리
    // Arraylist ,stack
    public static Map<String, Member> session = new HashMap<>(); //static : 메모리 상주
    public static  TUIView tuiView = new TUIView();
    final String MemberDB = "memberdb.txt"; //파일명, 디렉터리와 파일명으로 식별 가능함
    Member member = null;
    //MemberRepositoryImpl <Member> memberRepository = new MemberRepositoryImpl<>();

    MemberService<Member> memberService;
    MemberView memberView = null;
    public PimController(){
        memberService = new MemberServiceImpl<>(MemberDB);
        memberView = new MemberView();
    }

    public void dispatch() { // 가져오기 :메뉴 보이기, 선택한 메뉴 처리하기, 결과 반화 반복

        boolean isLogin = false; // 지역변수는 선언된 블록이 종료되면 메모리에서 사라짐 로그인 되어있는지
        boolean isRoot = false;
        Scanner sc = new Scanner(System.in); //키보드 입력을 받아서 분석 반환

        memberService.readFile(); //처음 실행 읽을 파일 없음
        int menu = 0;
            do{
                String msg = "";
                tuiView.showMenu(isLogin,isRoot); //isRoot(관리자 로그인)
                menu = sc.nextInt(); //숫자 입력 후 엔터키키
                switch (menu) {
                    case 0: msg = "종료";
                    memberService.saveFile(); // memberdb.txt에 저장
                    break;

                    case 1: msg = "등록";
                    member = new Member();
                    member.setId(sc.nextLong()); // Long
                    member.setEmail(sc.next()); // String
                    member.setPw(sc.next());
                    member.setName(sc.next());
                   // member.setPhone(sc.next());
                    //member.setAddress(sc.next());
                    //memberRepository.create(member);
                        memberService.postMember(member);
                        memberView.printOne(member);
                    break;

                    case 2: msg = "로그인";break;
                    case 3: msg = "정보조회";break;
                    case 4: msg = "정보수정";break;
                    case 5: msg = "로그아웃";break;
                    case 6: msg = "회원탈퇴";break;
                    case 7: msg = "회원 목록 조회";
                        memberView.printList(memberService.getMemberList());

                        /*
                        for(Member m : memberRepository.readList())
                        System.out.println(m.getEmail()+ ":" + m.getName());
                        */

                     break;
                    default: msg = "입력 코드 확인:";break;
                }
                    System.out.println(msg + "메뉴를 선택하셨습니다");
            } while(menu != 0);
    }
}
