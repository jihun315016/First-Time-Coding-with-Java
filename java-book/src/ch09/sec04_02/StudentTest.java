package ch09.sec04_02;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 3);
        System.out.println("학생의 이름 : " + s1.name);

        // grade는 private 필드라 접근 불가능
        System.out.println("학생의 학년 : " + s1.getGrade());
    }
}
