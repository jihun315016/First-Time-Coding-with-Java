package ch12.member;

import ch12.common.DataUtil;

public class Member {
    String memberData;

    public String viewMember(MemberVO vo) {
        DataUtil.decodeData(memberData);
        memberData = "회원 아이디 : " + vo.id + 
            "\n회원 비밀번호 : " + vo.password + 
            "\n회원 이름 : " + vo.name;

            return memberData;
    }

    public void regMember(MemberVO vo) {
        memberData = "회원 아이디 : " + vo.id + 
            "\n회원 비밀번호 : " + vo.password + 
            "\n회원 이름 : " + vo.name;

        DataUtil.encodeData(memberData);
    }
}
