package iducs.java.pim201912047.pims.repository;

import java.util.List;

// 실제 데이터를 처리 하는 놈 에 대한 기준 을 인터페이스로 만드는 것임
public interface MemberRepository<T> {

    // 구현의 방향을 제시, 외부 사용법을 결정
    int create(T member); // 등록
    T readById(T member);  // 정보조회 - id 기준
    T readByEmail(T member); // 정보조회 - email 기준
    List<T> readList(); // 목록 조회
    int update(T member); // 수정
    int delete(T member); // 탈퇴
    void Search_Phone_Number(String p);
    List<T> getMemberList();
    void lowMemberList(String order);
    void setMemberList(List<T> memberList);

    List<T> readListByPerPage(int page, int perPage); // 페이지네이션

    long id_add_List();

    // 즉 위와 같은 메소들을 만들어서 써라 즉 크리에이스 메소드에 맴버 객체를 넘기면
    // 반환 값으로 int형 온다고 생각 하면 됨
}
