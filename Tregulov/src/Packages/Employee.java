package Packages;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id) {
        this.id = id;
    }
    Employee(String surname) {
        this.surname = surname;
    }
    private Employee(double salary) {
        this.salary = salary;
    }

    public void showID() {
        System.out.println(id);
    }
    public void showSurname() {
        System.out.println(surname);
    }
    public void showSalary() {
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(5);
        Employee emp2 = new Employee("Ivanov");
        Employee emp3 = new Employee(400.0);
        emp1.showID();
        emp1.showSalary();
        emp1.showSurname();
        emp2.showID();
        emp2.showSalary();
        emp2.showSurname();
        emp3.showID();
        emp3.showSalary();
        emp3.showSurname();

    }
}

