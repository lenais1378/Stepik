package FinalAndStatic.Homework;

public class FirstClass {
public final static double PI = 3.14;

    public static int Proizvedenie (int a, int b, int c) {
        int result = a*b*c;
        return result;
    }

    public static void Delenie (int a, int b) {
        int resultDel= a/b;
        int resOstatok = a%b;
        System.out.println("Celoe " + resultDel + " Ostatok " + resOstatok );
    }

    public double Ploshad(double radius) {
    double PloshadCruga = PI * radius*radius;
        return PloshadCruga;
    }
    public static double DlinaOkruzhnosty(double radius) {
    double Dlina = 2 * PI * radius;
    return Dlina;
    }
    public void showInfo(double radius) {
        System.out.println(radius);
        System.out.println(DlinaOkruzhnosty(radius));
        System.out.println(Ploshad(radius));
    }

}
