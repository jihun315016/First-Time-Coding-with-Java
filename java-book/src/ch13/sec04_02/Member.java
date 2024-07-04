package ch13.sec04_02;

public class Member implements MemberPC, MemberMobile {
    @Override
    public void joinMember() {        
        System.out.println("PC에서 회원 가입합니다.");    
    }
    
    @Override
    public void searchMember() {
        System.out.println("PC에서 회원을 조회합니다.");
    
    }
    @Override
    public void joinMemeberMobile() {
        System.out.println("모바일에서 회원 가입합니다.");
    }
    
    @Override
    public void searchMemberMobile() {
        System.out.println("모바일에서 회원을 조회합니다.");
    }
}
