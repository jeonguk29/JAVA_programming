package iducs.java.pim201912047.pims.repository;

import iducs.java.pim201912047.pims.domain.Member;
import iducs.java.pim201912047.pims.view.MemberView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// 인터페이스를 이름뒤에 impl을 붙여 구현 클래스를 만드는게 관습임
public class MemberRepositoryImpl<T> implements MemberRepository<T> {
    // <> : Generic (제너릭) 1. 컴파일 시점에 유형을 확인 2. 사용시 형변환을 줄여줌
    // 파일 또는 데이터베이스를 접근하여 데이터를 처리함(Data Access : create, read, update, delete ...)
    public static long memberId = 1;
    Member memberDTO = null;
    public List<T> memberList = null;
    public List<T> memberList2 = null;
    MemberView memberView = null;

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
                //이메일과 비밀번호가 같으면 같다고 판단 해서 객체 리턴후 객체 하나만 출력
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
                memberList.set(idx, member);  //객체 이메일이 같다면 리스트에 이메일이같은 것에 데이터를 수정
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

    //Collections.sort(this.memberList, Collections.reverseOrder());
    //return this.memberList;
    // 폰번호 검색한거 참조 이름 비교해서

    // name순 오름차순으로 정렬
    // https://coding-today.tistory.com/38 참고



    public long id_add_List(){
        Collections.sort(memberList, new Add_Id().reversed());  // id 값 기준 내림차순을 수행후
         T f1  = memberList.get(0); // 가장큰 첫번째 인덱스에서
        return((Member) f1).getId(); // id 값을 리턴하여 최종적으로 가장큰 id값에 +1을 더하도록 만들었습니다.
    }

    @Override
    public void lowMemberList(String order) {

        if(order.equals("asc"))
        {
            Collections.sort(memberList, new NameComparator());   //이름 오름차순 정렬
            //Collections.sort(memberList, new PriceComparator());
            for (T m : memberList) {
               // System.out.printf("%-17s", ((Member) m).getId() + "\t");
                System.out.printf("%-17s", ((Member) m).getEmail() + "\t");
                System.out.printf("%-17s", ((Member) m).getName() + "\t");
                System.out.printf("%-17s", ((Member) m).getPhone() + "\t");
                System.out.printf("%-17s", ((Member) m).getAddress() + "\t");
                System.out.println();
            }

        }

        if(order.equals("desc")) {
            //System.out.println("price 순 내림차순 : " + memberList);
            Collections.sort(memberList, new NameComparator().reversed()); // name순 내림차순으로 정렬

            //Collections.sort(memberList, new PriceComparator().reversed());
            for (T m : memberList) {
               // System.out.printf("%-17s", ((Member) m).getId() + "\t");
                System.out.printf("%-17s", ((Member) m).getEmail() + "\t");
                System.out.printf("%-17s", ((Member) m).getName() + "\t");
                System.out.printf("%-17s", ((Member) m).getPhone() + "\t");
                System.out.printf("%-17s", ((Member) m).getAddress() + "\t");
                System.out.println();
            }

            //System.out.println("price 순 내림차순 : " + memberList);
            //memberView.printList((List<Member>) memberList);
        }
        }


    class NameComparator implements Comparator<T> {
        @Override
        public int compare(T f1, T f2) {
            return ((Member) f1).getName().compareTo(((Member) f2).getName());
        } // 기준 값 이름 말고 바꿀거면 여기 위에거 바꾸면됨
        // .compareTo 문자열 비교시 이용
        //string1 > string2인 경우: 양의 정수 반환
        //string1 < string2인 경우: 음의 정수 반환
        //string1 == string2인 경우: 0 반환


        }

    class PriceComparator implements Comparator<T> {
        @Override
        public int compare(T f1, T f2) {    // int형 비교 할거 있으면 여기서 비교하면 됨  현제 id 적용중
            if (((Member) f1).getId() > ((Member) f2).getId()) {
                return 1;
            } else if (((Member) f1).getId() < ((Member) f2).getId()) {
                return -1;
            }

            return 0;
        }
    }


    class Add_Id implements Comparator<T> {
        @Override
        public int compare(T f1, T f2) {    // int형 비교 할거 있으면 여기서 비교하면 됨  현제 id 적용중
            if (((Member) f1).getId() > ((Member) f2).getId()) {
                return 1;
            } else if (((Member) f1).getId() < ((Member) f2).getId()) {
                return -1;
            }

            return 0;
        }
    }



    public void Search_Phone_Number(String p) {
        System.out.println("입력된 정보에 의한 검색 회원");
        System.out.println("이메일             이름              폰번호             주소");
        for (T m : memberList) {
            if (((Member) m).getPhone().indexOf(p) != -1) {  // != 이기 때문에 같은 문자열이 있으면 반환
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

    @Override
    public List<T> readListByPerPage(int page, int perPage) {

        if(perPage <= 0 || page <= 0) {
            throw new IllegalArgumentException("invalid page size: " + perPage);
        }

        int fromIndex = (page - 1) * perPage; //1,3이면 0이되고 2,5면 5가됨    시작점을 정할수 있는거임

        if(memberList == null || memberList.size() <= fromIndex){
            return Collections.emptyList();
            /*
            Collections.emptyList();
            해당 메서드는 DB에서 User객체가 담긴 List를 조회해주는 메서드입니다.
            만약 결과가 없는 경우 메서드를 사용하는 클라이언트 클래스에서는 결과가 없다는것을 알 수 있도록 비어있는 List를 통해 전달해 줍니다.
             */
        }

        // toIndex exclusive
        return memberList.subList(fromIndex, Math.min(fromIndex + perPage, memberList.size())); //5 부터 10까지
        //Math.min 은 두 인자중  작은 값을 리턴 합니다

        /*
                 System.out.println(Math.min(12, 1));
            ex
            int 형 12 와 1의 비교 입니다.
            둘중 작은 값을 가져 오는 min() 함수를 이용하였으며 return data type 은 int  형입니다.
            실행 결과는 당연히 1이 리턴 됩니다.


            ex
                 List<Integer> sub = nums.subList(2, 5);    즉  인덱스 2부터 5전까지
                System.out.printf("nums: %s, sub: %s%n",nums, sub);
            위 코드의 결과는 다음과 같다.

            nums: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9], sub: [2, 3, 4]
         */

    }
}
