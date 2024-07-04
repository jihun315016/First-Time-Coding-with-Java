package ch13.sec04_02;

public class MemberExec {
    public static void main(String[] args) {
        MemberPC m1 = new Member();
        m1.joinMember();
        m1.searchMember();

        MemberMobile m2 = new Member();
        m2.joinMemeberMobile();
        m2.searchMemberMobile();
        m2.breakApp();
    }
}
