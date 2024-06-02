package com.example.springboot_dev;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // <Member, Long> 제네릭의 첫 번째 타입은 엔티티 클래스 타입이고 두 번째는 식별자 타입
    // 복합키라서 식별자가 여러 개인 경우 아래와 같이 EmbeddedId 또는 IdClass를 사용하여 구현할 수 있다.
}

/*
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MemberId implements Serializable {
    private Long idPart1;
    private Long idPart2;

    // 기본 생성자, getter, setter, equals, hashCode 메소드
}

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.EmbeddedId;

@Entity
public class Member {
    @EmbeddedId
    private MemberId memberId;

    // 기타 필드 및 메소드
}

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, MemberId> {
    // 추가적인 쿼리 메소드 정의 가능
}
*/

/*
import java.io.Serializable;

public class MemberId implements Serializable {
    private Long idPart1;
    private Long idPart2;

    // 기본 생성자, getter, setter, equals, hashCode 메소드
}

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(MemberId.class)
public class Member {
    @Id
    private Long idPart1;

    @Id
    private Long idPart2;

    // 기타 필드 및 메소드
}

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, MemberId> {
    // 추가적인 쿼리 메소드 정의 가능
}
 */
