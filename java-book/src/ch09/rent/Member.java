package ch09.rent;

import ch09.common.Base;

public class Member extends Base {
    String id;
    String password;
    String name;
    String address;
    String phoneNum;

    public Member() { }

    public Member(String id, String password, String name, String address, String phoneNum) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public String viewMember() {
        System.out.println("\n회원 정보를 조회합니다.");
        System.out.println("회원 조회 시간 : " + showTime());
        return "아이디 : " + id +
            "\n회원번호 : " + password + 
            "\n주소 : " + address + 
            "\n전화번호 : " + phoneNum;
    }

    public void regMember(String id, String password, String name, String address, String phoneNum) {
        System.out.println("\n회원 가입합니다.");
        System.out.println("회원 가입 시간 : " + showTime());
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }
}
