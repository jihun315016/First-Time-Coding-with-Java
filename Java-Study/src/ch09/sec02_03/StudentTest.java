package ch09.sec02_03;

public class StudentTest {
    public static void main(String[] args) {
        String studentInfo = null;
        Middle m = new Middle("홍길동", 2);
        Colleage c = new Colleage("김길동", 3, 20);

        studentInfo = m.getStudentInfo();
        System.out.println("학생 정보");
        System.out.println(studentInfo);
        
        System.out.println();
        
        studentInfo = c.getStudentInfo();
        System.out.println("학생 정보");
        System.out.println(studentInfo);
        System.out.println("수강 학점 : " + c.getCourses() + "점");
    }
}
