public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }


    double uvelichenieZP() {
        salary = salary * 2;
        System.out.println(salary);
        return salary;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(156789, "Efremova", 26, 56.789, "GNLK");
        Employee employee2 = new Employee(156790, "Efremov", 25, 70.789, "GNLK");
        employee1.uvelichenieZP();
        employee2.uvelichenieZP();

    }

}
