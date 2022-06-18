package iducs.java.pim201912047.pims.domain;
// 나중에 빨간거 뜨면 알트 엔터로 패키지 추가 시켜주면 오류 안남

public class Member { // 회원 정보 전송(transfer) 객체( : Data Transfer Object (읽기/쓰기)
    // 즉 저장 하기위해 전송하는 놈임
    // Valuable Object (읽기)
    private long id; // 식별 번호
    private String email; // 로그인 아이디 역할 수행
    private String pw;
    private String name;
    private String phone;
    private String address;
    // getter / setter 메소드를 정의

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
}
