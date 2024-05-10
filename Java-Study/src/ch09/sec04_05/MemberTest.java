package ch09.sec04_05;

public class MemberTest {
    public static void main(String[] args) {
        Member member = new Member();
        member.setName("홍길동");
        member.setAdult(true);

        System.out.println("이름 : " + member.getName());
        System.out.println("어른 : " + member.isAdult());
    }
}
