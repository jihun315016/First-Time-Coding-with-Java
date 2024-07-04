package ch09.sec03_05;

public class Employee {
    protected String name;
    protected int payPerMonth;
    protected int commision;

    public Employee(String name, int payPerMonth, int commision) {
        this.name = name;
        this.payPerMonth = payPerMonth;
        this.commision = commision;
    }

    int calcTotalPay() { 
        int totalPay = 12 * payPerMonth + commision;
        return totalPay;
    }
}
