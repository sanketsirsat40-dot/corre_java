package Decision_Making;
import java.util.Scanner;
public class if_op {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your age:");
        int age= sc.nextInt();


        if (age>=18){
            System.out.println("your eligibel to vote");
        }
    }
}
