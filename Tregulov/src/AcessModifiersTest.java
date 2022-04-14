import Packages.Employee;

public class AcessModifiersTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(5);
//        Employee emp2 = new Employee("Ivanov");
//        Employee emp3 = new Employee(400.0);
        emp1.showID();
        emp1.showSalary();
        emp1.showSurname();
//        emp2.showID();
//        emp2.showSalary();
//        emp2.showSurname();
//        emp3.showID();
//        emp3.showSalary();
//        emp3.showSurname();
    }
}
