package com.example.springboot_dev;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 엔티티는 반드시 기본 생성자가 있어야 <- 기본 생성자 지정
@AllArgsConstructor
@Getter
@Entity // JPA가 관리하는 엔티티로 지정 == 클래스와 테이블을 매핑시킨다.
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    // 필드와 테이블의 칼럼을 매핑해준다.
    // Column 속성
    // name : 매핑할 칼럼명, 지정하지 않으면 필드명으로 지정된다.
    // nullable : null 허용 여부
    // unique : 유일값
    // columnDefinition : 기본값 설정
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    public Member(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}