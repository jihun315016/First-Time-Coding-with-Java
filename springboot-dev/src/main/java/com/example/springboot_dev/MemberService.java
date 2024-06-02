package com.example.springboot_dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void test() {
        System.out.println("1 =====");
        memberRepository.save(new Member(1L, "A"));
        printList(memberRepository.findAll());

        Optional<Member> member = memberRepository.findById(1L);

        System.out.println("2 =====");
        List<Member> allMember = memberRepository.findAll();
        printList(allMember);

        System.out.println("3 =====");
        memberRepository.deleteById(1L);
        printList(memberRepository.findAll());
    }

    public void printList(List<Member> list) {
        for (Member member : list) {
            System.out.print(member.getId() + " " + member.getName() + " / ");
        }
        System.out.println();
    }
}
