package FinalAndStatic;

public class Test1 {
//    public final int a = 10;
    public int a = 10;

    public Test1() {
//        a = 10;
    }
    public Test1(boolean b) {
//        a = 10;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.a = t.a*2;
        System.out.println(t.a);
    }
}
class Car {
    String color = "blue";


public static void main(String[] args) {
    final Car car = new Car();
//    car = new Car();
    car.color = "red";
}
}

