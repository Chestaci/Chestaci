package Thinking_in_Java.Chapter_15;

public class Ex31 {
}

//interface Payable<T> {}
//class Employee implements Payable<Employee> {}
//class Hourly extends Employee
//        implements Payable<Hourly> {}

interface Payable {}
class Employee implements Payable {}
class Hourly extends Employee
        implements Payable {
    public static void main(String[] args) {
        new Employee();
        new Hourly();
    }
}
