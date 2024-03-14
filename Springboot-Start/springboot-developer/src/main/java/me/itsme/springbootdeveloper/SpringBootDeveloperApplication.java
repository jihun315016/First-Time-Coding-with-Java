package me.itsme.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);

        // 실행 시 오류 발생했음
        // Execution failed for task ':SpringBootDeveloperApplication.main()'.
        // > Process 'command 'C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2\jbr\bin\java.exe'' finished with non-zero exit value 1

        // Settings... - Build, Execution, Deployment - Build Tools - Gradle - Build and Run using, Run tests using : IntelliJ IDEA로 값 변경하여 해결
    }
}
