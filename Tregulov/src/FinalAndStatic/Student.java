package FinalAndStatic;

public class Student {
    String name;
    int course;
    static  int count;

    public Student(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student # " + count+ " sozdan");
    }

}
class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 1);
        Student s2 = new Student("Misha", 4);
        Student s3 = new Student("Masha", 2);


    }
}
