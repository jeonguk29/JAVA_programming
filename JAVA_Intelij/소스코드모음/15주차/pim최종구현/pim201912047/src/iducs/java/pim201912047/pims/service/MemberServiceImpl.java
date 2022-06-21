package iducs.java.pim201912047.pims.service;


import iducs.java.pim201912047.pims.domain.Member;
import iducs.java.pim201912047.pims.repository.MemberRepository;
import iducs.java.pim201912047.pims.repository.MemberRepositoryImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class MemberServiceImpl<T> implements MemberService<T> {
    // MemberView memberView = new MemberView();
    MemberRepository<T> memberRepository = null;
    private String memberdb = null;
    // Object temporary = null;

    public MemberServiceImpl(String db) {
        memberRepository = new MemberRepositoryImpl<>();
        this.memberdb = db;
    }

    @Override
    public T login(String email, String pw) {
        // T : Generic - 1. 컴파일 시점에 자료형 확인할 수 있음.
        // 2. 여러 유형을 처리하는 하나의 메소드로 처리 가능 : ArrayList<String>, ArrayList<Integer> ...
        T member = (T) new Member();
        ((Member) member).setEmail(email);
        ((Member) member).setPw(pw);
        return memberRepository.readByEmail(member);
    }

    @Override
    public void logout() {

    }

    @Override
    public int postMember(T member) {
        return memberRepository.create(member);
    }

    @Override
    public T getMember(T member) {
        return memberRepository.readByEmail(member);
    }

    @Override
    public int putMember(T member) {
        return memberRepository.update(member);
    }

    @Override
    public int deleteMember(T member) {
        //memberRepository
        return memberRepository.delete(member);
    }

    @Override
    public List<T> getMemberList() {
        return memberRepository.getMemberList();
    }


    @Override
    public void lowMemberList(String order) {
        memberRepository.lowMemberList(order);
    }

    public long id_add()
    {
        return memberRepository.id_add_List();
    }

    @Override
    public void findMemberByPhone(String p)
    {
        memberRepository.Search_Phone_Number(p);
    }


    @Override
    public void readFile() {
        File file = new File(memberdb);
        if(file.canRead()) {
            try {
                MemberFileReader<T> mfr = new MemberFileReader<>(file);
                memberRepository.setMemberList(mfr.readMember()); // 파일 -> memberList
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            try {
                file.createNewFile();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void saveFile() { // throws : 예외 전파, throw : 예외 발생
        File file = new File(memberdb);
        try  {
            MemberFileWriter<Member> mfw = new MemberFileWriter<>(file);
            mfw.saveMember((List<Member>) memberRepository.readList());
        } catch(IOException e) { // 예외를 직접 처리, unchecked exception
            e.printStackTrace();
        }
    }

    public void del_saveFile() { // throws : 예외 전파, throw : 예외 발생
        File file = new File(memberdb);
        try  {
            MemberFileWriter<Member> mfw = new MemberFileWriter<>(file);
            mfw.delsaveMember((List<Member>) memberRepository.readList());   // 현제 리스트 값을 가져와서 멤버형 리스트로 형 변환후
        } catch(IOException e) { // 예외를 직접 처리, unchecked exception
            e.printStackTrace();
        }
    }


    @Override
    public void applyUpdate() {
        saveFile();
        readFile();
    }

    @Override
    public List<T> paginateByPerPage(int pageNo, int perPage) {
        return memberRepository.readListByPerPage(pageNo,perPage);
    }


}
