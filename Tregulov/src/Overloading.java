public class Overloading {
    int sum () {
        System.out.println(0);
        return 0;
    }

    int sum (int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    int sum (int a, int b, int d) {
        int c = a + b + d;
        System.out.println(c);
        return c;
    }

    int sum (int a) {
        System.out.println(a);
        return sum(a);
    }

    int sum (int a, int b, int d, int v) {
        int c = a + b + d + v;
        System.out.println(c);
        return c;
    }

}
