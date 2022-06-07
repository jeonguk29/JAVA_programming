package iducs.java201912029.pims.service;

import iducs.java201912029.pims.domain.Member;
import iducs.java201912029.pims.repository.MemberRepository;
import iducs.java201912029.pims.repository.MemberRepositoryImpl;

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
        return null;
    }

    @Override
    public void logout() {

    }

    @Override
    public int postMember(T member) {
        if(memberRepository.create(member) > 0){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public T getMember(T member) {
        return null;
    }

    @Override
    public int pubMember(T member) {
        return 0;
    }

    @Override
    public int deleteMember(T member) {
        return 0;
    }

    @Override
    public List<T> getMemberList() {
        return memberRepository.getMemberList();
    }

    @Override
    public List<T> findMemberByPhone(T member) {
        return null;
    }

    @Override
    public void readFile() {
    File file = new File(memberdb);
    if(file.canRead()) {
        try {
            MemberFileReader<T> mfr = new MemberFileReader<>(file);
            memberRepository.setMemberList(mfr.readMember());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }else  {
        try {
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    }

    @Override
    public void saveFile() {
        File file = new File(memberdb);
        try {
            MemberFileWriter<Member> mfw = new MemberFileWriter<>(file);
            mfw.saveMember((List<Member>) memberRepository.readList());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void applyUpdate() {
     saveFile();
     readFile();
    }
}
