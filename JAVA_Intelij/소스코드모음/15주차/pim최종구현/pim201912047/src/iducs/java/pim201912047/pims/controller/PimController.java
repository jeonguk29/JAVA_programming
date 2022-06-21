package iducs.java.pim201912047.pims.controller;


import iducs.java.pim201912047.pims.domain.Member;
import iducs.java.pim201912047.pims.service.MemberService;
import iducs.java.pim201912047.pims.service.MemberServiceImpl;
import iducs.java.pim201912047.pims.view.MemberView;
import iducs.java.pim201912047.pims.view.TUIView;

import javax.swing.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
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

    public void dispatch() throws IOException { // 가져오기 : 메뉴보이기, 선택한 메뉴 처리하기, 결과 반환 반복
        boolean isLogin = false; // 지역변수는 선언된 블록이 종료되면 메모리에서 사라짐 현제 디스패치가 끝나면 사라짐
        boolean isRoot = false;
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받아서 분석 반환
        memberService.readFile();//파일로 부터 사용자 목록 정보 읽기
        int menu = 0;
        int menu2 = 1;
        int n = 0;
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


            if(menu == 0 && isRoot == true)
            {
                msg = "종료";
                memberService.saveFile(); // memberdb.txt 에 저장
                System.out.println("관리자 정상 종료");
                menu2 = menu;

            }

            //BufferedReader br = new BufferedReader(new FileReader(fileName));
            //파일을 한 문장씩 읽어온다.
            //String str = br.readLine();
                /*
                File file = new File(fileName);
                FileInputStream fis = new FileInputStream(file);
                byte[] data = new byte[(int) file.length()];
                fis.read(data);
                fis.close();
                */

            loop:if(menu == 1)
            {
                String same ="";
                member = new Member(); // 동록 하기로 해서

                String fileName = "db201912047.txt";
                Scanner scan = new Scanner(new File(fileName));

                System.out.println("이메일을 입력해주세요");
                same = sc.next();

                String text = new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);

                //String str = new String(data, "UTF-8");

                if(same.indexOf("@") == -1)
                {
                    System.out.println("@ 값을 입력하시지 않았습니다");
                    break loop;
                }



                    if(text.indexOf(same) == -1) // 같은 문자열 없으면 -1 반환함
                    {

                        // id 자동증가
                        //double randomValue = Math.random();
                        //int id_num = (int)(randomValue * 100) + 1;
                        memberService.id_add(); // 현제 리스트 들어간거 다 출력
                        member.setId(memberService.id_add() + 1); // Long 값을 입력받음 자동증가 // 자동 아이디값 증가
                        member.setEmail(same); // String 값을 입력 받아 넣음
                        System.out.println("비밀번호를 입력해주세요");
                        member.setPw(sc.next());
                        System.out.println("이름을 입력해주세요");
                        member.setName(sc.next());
                        System.out.println("휴대폰 번호를 입력해주세요");
                        member.setPhone(sc.next());
                        System.out.println("주소를 입력해주세요");
                        member.setAddress(sc.next());
                        memberService.postMember(member); // 생성한걸 담음 즉 하나씩 입력하면 하나하나 들어가고 7번 누르면
                        memberView.printOne(member);
                        memberView.printMsg(msg + "를 성공했습니다.");
                    }
                    else{
                        System.out.println("같은 이메일이 있습니다.");
                        //System.exit(0);
                        member = null;
                        break loop;
                    }



                //int id_num = 0;


            }
            if(menu == 2) {
                msg = "로그인";
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
            }

            //루트일때 종료, 정보조희, 정보수정, 로그아웃, 목록조희 가능
            //사용자 정보조희, 정보수정, 로그아웃, 회원탈퇴 가능

            if(menu == 3 && isLogin == true) {
                msg = "정보조회";
                // printOne : 하나의 member 정보 출력
                memberView.printOne(memberService.getMember(
                        (Member) session.get("member")));
                memberView.printMsg(msg + "를 성공했습니다.");

            }
            if(menu == 4 && isLogin == true) {
                msg = "정보수정";
                member = new Member();
                member.setId(sessionMember.getId()); // id 변경 불가(같은 값으로 설정)
                member.setEmail(sessionMember.getEmail()); // email 변경 불가
                System.out.println("비밀번호 수정내용");
                member.setPw(sc.next());
                System.out.println("이름 수정내용");
                member.setName(sc.next());
                System.out.println("휴대폰 수정내용");
                member.setPhone(sc.next());
                System.out.println("주소 수정내용");
                member.setAddress(sc.next());
                if(memberService.putMember(member) > 0) {
                    memberView.printOne(member);
                    memberView.printMsg(msg + "를 성공했습니다.");
                }
                else
                    System.out.println("수정에 실패하였습니다. ");

            }

            if(menu == 5 && isLogin == true) {
                msg = "로그아웃";
                memberService.saveFile();
                memberService.readFile();
                if(session.get("member") != null) {  // 세션이 비어있지 않다면
                    session.remove("member");  //세션에 저장 된걸 지움
                }
                memberView.printMsg(msg + "를 성공했습니다.");

            }

            loop2:if(menu == 6 && isRoot == false  && isLogin == true) {
                msg = "회원탈퇴";

                if(memberService.deleteMember(sessionMember) == 0) {// 로그인 할때 가져온 세션멤버를 리스트에서 지우고
                    memberService.del_saveFile(); //파일에서 건너띄고 다시 작성해서 파일에서도 탈퇴 시킴
                    memberView.printOne(member); 
                    memberView.printMsg(msg + "를 성공했습니다.");
                    System.exit(0);
                }
                else {
                    System.out.println("수정에 실패하였습니다. ");
                    break loop2;
                }
                /*
                memberView.printOne(memberService.getMember(
                        (Member) session.get("member")));

                */


            }



            if(menu == 7 && isRoot == true) {
                msg = "목록조희";
                memberView.printList(memberService.getMemberList()); // 현제 리스트 들어간거 다 출력
                memberView.printMsg(msg + "를 성공했습니다.");

            }

            if(menu == 8 && isRoot == true) {
                msg = "번호조회 검색";
                String p ="";
                System.out.println("검색할 휴대폰 번호 전체 자리 혹은 끝 4자리를 입력해주세요.");
                p=sc.next();
                memberService.findMemberByPhone(p); // 폰번호 문자열 보내서 리스트 안에있는거 하나하나 비교하면서 같은게 있으면 그 객체값 출력
                memberView.printMsg(msg + "를 성공했습니다.");

            }

            loop3:if(menu == 9 && isRoot == true) {
                msg = "회원 정렬";
                String order = "";
                System.out.println("값을 입력해 주세요 desc면 내림차순, asc면 오름차순 (이름값을 기준)");
                order = sc.next();
                if (order.equals("desc") || order.equals("asc")) {
                    memberService.lowMemberList(order); // 현제 리스트 들어간거 다 출력
                    memberView.printMsg(msg + "를 성공했습니다.");
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                    break loop3;
                }

            }

            if (menu == 10 && isRoot == true) {
                msg = "페이지 출력";
                Scanner sc2 = new Scanner(System.in);
                int page = 0;
                int per_page = 0;
                System.out.println("지정할 페이지");
                page = sc.nextInt();
                System.out.println("페이지당 갯수");
                per_page = sc.nextInt();
                memberView.printList(memberService.paginateByPerPage(page,per_page));


            }

            else  {
                msg = "입력 코드 확인 :";
               // System.out.println("권한이 없습니다.");
            }

        } while(menu2 != 0);
    }
}