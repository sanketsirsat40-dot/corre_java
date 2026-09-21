package Operators;

class logic {

    void And(int a, int b) {
        boolean sam = a > 5 && b > 5;
        System.out.println(sam);
    }

    void Or(int a, int b) {
        boolean sam = a > 5 || b > 5;
        System.out.println(sam);
    }

    void Not(int a) {
        boolean sam = !(a > 5);
        System.out.println(sam);
    }

}

public class Logical_operators {

    public static void main(String[] args) {

        logic sc = new logic();

        sc.And(10, 5);
        sc.Or(10, 20);
        sc.Not(10);

    }
}
