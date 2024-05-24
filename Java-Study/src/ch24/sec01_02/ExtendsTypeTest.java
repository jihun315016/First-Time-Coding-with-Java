package ch24.sec01_02;

import java.util.ArrayList;
import java.util.List;

import ch24.sec01_01.*;

public class ExtendsTypeTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("홍길동"));
        personList.add(new Person("김길동"));
        personList.add(new Person("박길동"));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("홍길동e", 20));
        employeeList.add(new Employee("김길동e", 30));
        employeeList.add(new Employee("박길동e", 10));

        printPersonList(personList);
        System.out.println("==============================");
        printEmployeeList(employeeList);
    }

    public static void printPersonList(List<?> list) {
        for (Object obj : list) {
            System.out.println(((Person)obj).getName());
        }
    }

    public static void printEmployeeList(List<? extends Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
    }

    public static void printStudentList(List<? extends Student> list) {
        for (Student student : list) {
            System.out.println(student.getName() + " " + student.getGrade());
        }
    }
}
