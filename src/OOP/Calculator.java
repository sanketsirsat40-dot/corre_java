package OOP;

import java.util.Scanner;

class opretion{
    Scanner sc=new Scanner(System.in);
    int num1,num2;

    void add(){
        System.out.print("enter number :");
        num1=sc.nextInt();
        System.out.print("enter number :");
        num2=sc.nextInt();
        System.out.println(num1+"+"+num2+"="+(num1+num2));
    }

    void sub(){
        System.out.print("enter number :");
        num1=sc.nextInt();
        System.out.print("enter number :");
        num2=sc.nextInt();
        System.out.println(num1+"-"+num2+"="+(num1-num2));
    }

    void mul(){
        System.out.print("enter number :");
        num1=sc.nextInt();
        System.out.print("enter number :");
        num2=sc.nextInt();
        System.out.println(num1+"*"+num2+"="+(num1*num2));
    }

    void div(){
        System.out.print("enter number :");
        num1=sc.nextInt();
        System.out.print("enter number :");
        num2=sc.nextInt();
        System.out.println(num1+"/"+num2+"="+(num1/num2));
    }



}
public class Calculator {
    static void main(String[] args) {
        opretion s1=new opretion();

        opretion s2=new opretion();

        s1.add();
        s1.sub();
        s1.mul();
        s1.div();

        s2.add();
        s2.sub();
        s2.mul();
        s2.div();
    }
}
