package ch24.sec01_01;

public class Employee extends Person {
    private int salary;

    public Employee(String name, int salary) {
        super.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return " 이름 " + name + ", 급여 " + salary;
    }
}
