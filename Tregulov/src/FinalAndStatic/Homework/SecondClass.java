package FinalAndStatic.Homework;

public class SecondClass {
    public static void main(String[] args) {
        System.out.println(FirstClass.Proizvedenie(4,5,6));
        FirstClass.Delenie(4,5);

        FirstClass c2 = new FirstClass();
        FirstClass.DlinaOkruzhnosty(4);
        c2.Ploshad(4);
        c2.showInfo(4);
    }
}
