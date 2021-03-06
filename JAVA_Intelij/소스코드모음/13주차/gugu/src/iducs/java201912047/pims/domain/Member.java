package iducs.java201912047.pims.domain;

public class Member { //  회원 정보 전송(transfer) 객체 : Data Transfer object(읽기/쓰기),
    // 또는 valuable Object (읽기) 전용
    private long id;  // 식별 번호
    private String email; // 로그인 아이디 역할 수행
    private String pw;
    private String name;
    private String phone;

    //getter /setter 메소드 정의
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    private String address;



}
