package Operators;

class opre{
    void Add(int a){
        int valu=10;
         valu+=a;
        System.out.println(valu);
    }
    void Subtract(int a) {
        int valu = 10;
        valu -= a;
        System.out.println(valu);
    }

    void Multiply(int a) {
        int valu = 10;
        valu *= a;
        System.out.println(valu);
    }
    void Divide(int a) {
        int valu = 10;
        valu *= a;
        System.out.println(valu);
    }

    void mode(int a) {
        int valu = 10;
        valu %= a;
        System.out.println(valu);
    }

}
public class Assignment_operators {
    static void main(String[] args) {
        opre sc=new opre();
        sc.Add(50);
        sc.Subtract(5);
        sc.Multiply(10);
        sc.Divide(2);
        sc.mode(2);
    }
}
