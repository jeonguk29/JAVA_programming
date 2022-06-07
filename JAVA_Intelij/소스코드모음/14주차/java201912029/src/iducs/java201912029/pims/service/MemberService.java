package iducs.java201912029.pims.service;

import java.util.List;

public interface MemberService<T> {
    T login(String email, String pw);
    void logout();

    int postMember(T member); //등록
    T getMember (T member); // 조회
    int pubMember(T member); // 수정
    int deleteMember(T member); // 삭제 탈퇴

    List <T> getMemberList(); // 목록 조회 : 관리자
    List<T> findMemberByPhone(T member); // 전회번호로 검색

    //file 사용으로 필요한 연산
    void readFile();
    void saveFile();
    void applyUpdate();

}
