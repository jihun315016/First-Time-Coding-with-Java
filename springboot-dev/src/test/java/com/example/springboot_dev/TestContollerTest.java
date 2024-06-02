package com.example.springboot_dev;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// BeforeAll
// 전체 테스트 시작 전 처음 한 번만 실행
// BeforeEach
// 테스트를 시작하기 전 매번 실행
// AfterAll
// 테스트를 종료하기 전 한 번만 실행
// AfterEach
// 각 테스트 케이스를 종료하기 전 매번 실행
// 여기서 매번의 기준은 @Test 애너테이션이 붙은 메서드

@SpringBootTest
@AutoConfigureMockMvc // MockMvc를 생성하고 자동으로 구성하는 애너테이션
class TestContollerTest {
    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    public void mockMvcSetUp() {
        System.out.println("mockMvcSetUp 실행");
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        System.out.println("mockMvcSetUp 종료");
    }

    @AfterEach
    public void cleanUp() {
        System.out.println("cleanUp 실행");
        memberRepository.deleteAll();
        System.out.println("cleanUp 종료");
    }

    @DisplayName("getAllMembers: 아티클 조회에 성공한다.")
    @Test
    public void getAllMembers() throws Exception {
        // given : 테스트 실행을 준비하는 단계
        final String url = "/test";
        Member savedMember = memberRepository.save(new Member(1L, "홍길동"));

        // when : 테스트를 진행하는 단계
        final ResultActions result = mockMvc.perform(get(url) // perform() : 요청을 전송하는 역할
                .accept(MediaType.APPLICATION_JSON)); // accept 어떤 타입으로 응답을 받을지 결정

        // then : 테스트를 검증하는 단계
        // andExpect 메서드 응답 검증
        // $[0].필드명 -> 0번 배열에 들어있는 객체의 필드명 값 가져오고 저장된 값과 같은지 확인
        result
                .andExpect(status().isOk()) // isOk() : 응답 코드가 200인지 확인
                .andExpect(jsonPath("$[0].id").value(savedMember.getId()))
                .andExpect(jsonPath("$[0].name").value(savedMember.getName()));
    }
}

// application.properties 파일에서
// spring.jpa.show-sql=false 설정을 통해 Hibernate 로그가 안 보이게 할 수 있음


/*
> Task :compileJava UP-TO-DATE
> Task :processResources UP-TO-DATE
> Task :classes UP-TO-DATE
> Task :compileTestJava
> Task :processTestResources NO-SOURCE
> Task :testClasses
23:51:48.379 [Test worker] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.example.springboot_dev.TestContollerTest]: TestContollerTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
23:51:48.598 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.example.springboot_dev.SpringbootDevApplication for test class com.example.springboot_dev.TestContollerTest

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.6)

2024-06-01T23:51:49.381+09:00  INFO 18388 --- [springboot-dev] [    Test worker] c.e.springboot_dev.TestContollerTest     : Starting TestContollerTest using Java 17.0.7 with PID 18388 (started by jihun in D:\springboot-dev)
2024-06-01T23:51:49.384+09:00  INFO 18388 --- [springboot-dev] [    Test worker] c.e.springboot_dev.TestContollerTest     : No active profile set, falling back to 1 default profile: "default"
2024-06-01T23:51:50.525+09:00  INFO 18388 --- [springboot-dev] [    Test worker] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2024-06-01T23:51:50.626+09:00  INFO 18388 --- [springboot-dev] [    Test worker] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 80 ms. Found 1 JPA repository interface.
2024-06-01T23:51:51.342+09:00  INFO 18388 --- [springboot-dev] [    Test worker] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-06-01T23:51:51.594+09:00  INFO 18388 --- [springboot-dev] [    Test worker] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:587b20c2-07bc-4419-952d-0253ebd1562f user=SA
2024-06-01T23:51:51.597+09:00  INFO 18388 --- [springboot-dev] [    Test worker] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-06-01T23:51:51.682+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-06-01T23:51:51.842+09:00  INFO 18388 --- [springboot-dev] [    Test worker] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.4.8.Final
2024-06-01T23:51:51.898+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2024-06-01T23:51:52.311+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2024-06-01T23:51:53.384+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate:
    drop table if exists member cascade
Hibernate:
    create table member (
        id bigint generated by default as identity,
        name varchar(255) not null,
        primary key (id)
    )
2024-06-01T23:51:53.435+09:00  INFO 18388 --- [springboot-dev] [    Test worker] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2024-06-01T23:51:54.114+09:00  WARN 18388 --- [springboot-dev] [    Test worker] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2024-06-01T23:51:55.011+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-06-01T23:51:55.011+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-06-01T23:51:55.020+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 2 ms
2024-06-01T23:51:55.116+09:00  INFO 18388 --- [springboot-dev] [    Test worker] c.e.springboot_dev.TestContollerTest     : Started TestContollerTest in 6.248 seconds (process running for 8.577)
mockMvcSetUp 실행
2024-06-01T23:51:55.930+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2024-06-01T23:51:55.930+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2024-06-01T23:51:55.931+09:00  INFO 18388 --- [springboot-dev] [    Test worker] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 1 ms
mockMvcSetUp 종료
Hibernate:
    select
        m1_0.id,
        m1_0.name
    from
        member m1_0
    where
        m1_0.id=?
Hibernate:
    update
        member
    set
        name=?
    where
        id=?
Hibernate:
    select
        m1_0.id,
        m1_0.name
    from
        member m1_0
cleanUp 실행
Hibernate:
    select
        m1_0.id,
        m1_0.name
    from
        member m1_0
Hibernate:
    delete
    from
        member
    where
        id=?
Hibernate:
    delete
    from
        member
    where
        id=?
Hibernate:
    delete
    from
        member
    where
        id=?
cleanUp 종료
2024-06-01T23:51:56.525+09:00  INFO 18388 --- [springboot-dev] [ionShutdownHook] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
Hibernate:
    drop table if exists member cascade
2024-06-01T23:51:56.532+09:00  INFO 18388 --- [springboot-dev] [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2024-06-01T23:51:56.535+09:00  INFO 18388 --- [springboot-dev] [ionShutdownHook] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
> Task :test
BUILD SUCCESSFUL in 12s
4 actionable tasks: 2 executed, 2 up-to-date
오후 11:51:56: Execution finished ':test --tests "com.example.springboot_dev.TestContollerTest"'.
*/