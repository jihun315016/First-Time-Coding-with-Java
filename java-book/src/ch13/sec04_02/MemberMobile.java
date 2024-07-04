package ch13.sec04_02;

public interface MemberMobile {
    public void joinMemeberMobile();
    public void searchMemberMobile();
    
    public default void breakApp() {
        System.out.println("마켓이 폐쇄되었습니다.");
    }
}