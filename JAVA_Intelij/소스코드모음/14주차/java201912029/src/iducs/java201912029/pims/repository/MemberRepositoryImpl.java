package iducs.java201912029.pims.repository;

import iducs.java201912029.pims.domain.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepositoryImpl<T> implements MemberRepository <T>{
    //<>: Generic (제너릭) 1.컴파일 시점에 유형을 확인 2.사용시 형변환을 줄여줌
    //파일 또는 데이터베이스를 접근해서 데이터를 처리함 (Data Access : create, read, update, delete...)
    public static long memberId = 1;
    //Member memberDTO
    public List<T> memberList = null;
    public MemberRepositoryImpl(){
        // Array 배열: (정적인 크기를 가진) 동일한 자료형을 인덱스를 활용하여 접근하는 객체
        memberList = new ArrayList<T>(); //Array + List : (동적 - 늘어남) 배열과 리스트 장점
    }
    @Override
    public int create(T member) {
        int ret = 0;
        try{
            memberList.add((T) member); //형변환
            ret = 1;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ret;
    }

    @Override
    public T readById(T member) {
        return null;
    }

    @Override
    public T readByEmail(T member) {
        return null;
    }

    @Override
    public List<T> readList() {
        return memberList;
    }

    @Override
    public int update(T member) {
        return 0;
    }

    @Override
    public int delete(T member) {
        return 0;
    }

    @Override
    public List<T> getMemberList() {
        return this.memberList;
    }

    @Override
    public void setMemberList(List<T> memberList) {
    this.memberList = memberList;
    }
}
