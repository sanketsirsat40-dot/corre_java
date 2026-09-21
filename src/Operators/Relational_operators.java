package Operators;
class opera{

    void Greater(int a, int b){
        boolean sam=a>b;
        System.out.println(sam);

    }

    void less(int a, int b){
        boolean sam=a<b;
        System.out.println(sam);
    }

    void Greaterthen(int a, int b){
        boolean sam= a>=b;
        System.out.println(sam);
    }

    void Greaterless(int a, int b){
        boolean sam= a<=b;
        System.out.println(sam);
    }

    void equalto(int a, int b){
        boolean sam=a==b;
        System.out.println(sam);
    }

    void notequal(int a, int b){
        boolean sam= a!=b;
        System.out.println(sam);
    }

}
public class Relational_operators {
   public static void main(String[] args) {
        opera sc=new opera();
        sc.Greater(10,20);
        sc.less(10,20);
        sc.Greaterthen(10,20);
        sc.Greaterless(10,20);
        sc.equalto(10,20);
        sc.notequal(10,20);

    }
}
