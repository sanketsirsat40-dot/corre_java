package OOP;

import java.util.Scanner;

class new_car{

    Scanner sc=new Scanner(System.in);
    String brand;
    String color;

    void display(){
        brand=sc.next();
        color=sc.next();
        System.out.println(brand+" "+color);
    }
}
public class car {
    static void main(String[] args) {
        new_car s1=new new_car();

        s1.display();
    }
}
