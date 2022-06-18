package iducs.java.pim201912047.pims.repository;

import iducs.java.pim201912047.pims.domain.Member;
import iducs.java.pim201912047.pims.view.MemberView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// 인터페이스를 이름뒤에 impl을 붙여 구현 클래스를 만드는게 관습임
public class MemberRepositoryImpl<T> implements MemberRepository<T> {
    // <> : Generic (제너릭) 1. 컴파일 시점에 유형을 확인 2. 사용시 형변환을 줄여줌
    // 파일 또는 데이터베이스를 접근하여 데이터를 처리함(Data Access : create, read, update, delete ...)
    public static long memberId = 1;
    Member memberDTO = null;
    public List<T> memberList = null;
    public List<T> memberList2 = null;
    private MemberView memberView;

    public MemberRepositoryImpl() { // 생성자 아래게 있어야 이개 돌아감 이 객체를 가지고 노는거라
        // Array 배열 : (정적인 크기를 가진) 동일한 자료형을 인덱스를 활용하여 접근하는 객체
        memberList = new ArrayList<T>(); // Array + List : (동적 - 늘어남) 배열과 리스트 장점
    }

    @Override
    public int create(T member) {
        int ret = 0; // 실패
        try {
            memberList.add((T) member); // 형변환
            ret = 1; // 성공
        } catch (Exception e) { // add 하다 잘못되면 예외처리 메세지 출력
            System.out.println(e.getMessage());// 예외 메시지 찍어라
        }
        return ret; // 처리 했으니 리턴 해
    }

    @Override
    public T readById(T member) {
        return null;
    }

    @Override
    public T readByEmail(T member) {
        for (T m : memberList) { // memberList 객체에 존재하는지 확인
            if (((Member) m).getEmail().equals(((Member) member).getEmail())
                    && ((Member) m).getPw().equals(((Member) member).getPw()))
                return m;
        }
        return null;
    }

    @Override
    public List<T> readList() {
        return memberList;
    }

    @Override
    public int update(T member) {
        int ret = 0; // 실패
        int idx = 0;
        for (T m : memberList) {
            if (((Member) m).getEmail().equals(((Member) member).getEmail())) {
                memberList.set(idx, member);
                ret++;
            }
            idx++;
        }
        return ret;
    }

    @Override
    public int delete(T member) {
        memberList.remove((T) member);
        return 0;
    }


    @Override
    public List<T> getMemberList() {
        return this.memberList;
    }

    @Override
    public List<T> lowMemberList() {

        Collections.sort(this.memberList, Collections.reverseOrder());
        return this.memberList;
        // 폰번호 검색한거 참조 이름 비교해서 
    }

        /*
        Collections.sort(list);
        System.out.println("오름차순 : " + list); // [A, B, C, a]
        */
        // 내림차순으로 정렬
        //Collections.sort(this.memberList, Collections.reverseOrder());
        //System.out.println("내림차순 : " + memberList); // [a, C, B, A]
        // //
        //Collections.sort(this.memberList, Collections.reverseOrder());



    public void Search_Phone_Number(String p) {
        for (T m : memberList) {
            if (((Member) m).getPhone().indexOf(p) != -1) {
                System.out.println("입력된 정보에 의한 검색 회원");
                System.out.printf("%-17s", ((Member) m).getEmail() + "\t");
                System.out.printf("%-17s", ((Member) m).getName() + "\t");
                System.out.printf("%-17s", ((Member) m).getPhone() + "\t");
                System.out.printf("%-17s", ((Member) m).getAddress() + "\t");
                System.out.println();
            }
        }
    }



    @Override
    public void setMemberList(List<T> memberList) {
        this.memberList = memberList;
    }
}
