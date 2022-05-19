package iducs.java.Study;

import java.util.Objects;

public class Member {
    private String id; // 기본 자료형 또는 참조형을 활용해서 새로운 자료형 정의, 연산도 함께 정의
    private String pw;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Short year;     // short :    Short : short  기본형을 효과적으로 다루기위한 Wrapper class
    private Byte month;
    private Byte day;

    @Override
    public boolean equals(Object o) {  // 두객체가 같은지 확인 현재 ID, NAME, EMAIL 같으면 각은객체라고 판단
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name) && Objects.equals(email, member.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    @Override
    public String toString() {  // 클래스로 만드는객체를 스트링화 (좀더 편하게 보기위해 스트링으로 만들어 주는거임)
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public Member(String id, String pw, String name, String email, String phone, String address, Short year, Byte month, Byte day) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public Byte getMonth() {
        return month;
    }

    public void setMonth(Byte month) {
        this.month = month;
    }

    public Byte getDay() {
        return day;
    }

    public void setDay(Byte day) {
        this.day = day;
    }
}
