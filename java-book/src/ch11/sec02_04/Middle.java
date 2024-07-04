package ch11.sec02_04;

public class Middle extends Student {
    public Middle(String name, int grade, String teacher) {
        super(name, grade);
        super.teacher = teacher;
    }

    public String getClassTeacher() {
        return "박길순 선생님";
    }

    @Override
    public String getTeacher() {
        return "담임 선생님 : " + teacher;
    }
}
