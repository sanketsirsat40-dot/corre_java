package Operators;

class oper {
    void add(int a, int b) {
        int c = a + b;
        System.out.println("addition :" + c);
    }

    void sub(int a, int b) {
        int c = a - b;
        System.out.println("subtraction :" + c);
    }

    void mul(int a, int b) {
        int c = a * b;
        System.out.println("multiplaction :" + c);
    }

    void div(int a, int b) {
        int c = a / b;
        System.out.println("divi :" + c);
    }
}
    public class Arithmetic_operators {
    static void main(String[] args) {
        oper sc =new oper();
        int a=10,b=5;
        sc.add(a,b);
        sc.sub(a,b);
        sc.mul(a,b);
        sc.div(a,b);

    }
}
