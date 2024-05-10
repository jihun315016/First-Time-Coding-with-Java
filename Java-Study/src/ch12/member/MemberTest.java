package ch12.member;

public class MemberTest {
    public static void main(String[] args) {
        MemberVO vo = new MemberVO("LeeId123", "1234", "Lee");
        Member member = new Member();

        member.regMember(vo);
        System.out.println();
        member.viewMember(vo);
    }
}
