package Inheritance;

public class Employee {

    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showInformation() {
        System.out.println("Employee name: " + name);
        System.out.println("Salary: Q" + salary);
    }

    public void work() {
        System.out.println(name + " is working on assigned tasks.");
    }
}