package methods;

class Opera {

    static void greater(int a, int b) {
        boolean result = a > b;
        System.out.println("Greater: " + result);
    }

    static void less(int a, int b) {
        boolean result = a < b;
        System.out.println("Less: " + result);
    }

    static void greaterThan(int a, int b) {
        boolean result = a >= b;
        System.out.println("Greater than or equal: " + result);
    }

    static void lessThan(int a, int b) {
        boolean result = a <= b;
        System.out.println("Less than or equal: " + result);
    }

    static void equalTo(int a, int b) {
        boolean result = a == b;
        System.out.println("Equal: " + result);
    }

    static void notEqual(int a, int b) {
        boolean result = a != b;
        System.out.println("Not equal: " + result);
    }
}

public class Relational_operators {

    public static void main(String[] args) {

        Opera.greater(10, 20);
        Opera.less(10, 20);
        Opera.greaterThan(10, 20);
        Opera.lessThan(10, 20);
        Opera.equalTo(10, 20);
        Opera.notEqual(10, 20);
    }
}
