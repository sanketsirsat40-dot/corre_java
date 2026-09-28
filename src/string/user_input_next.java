package string;
import java.util.Scanner;
public class user_input_next {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("Your name is: " + name);
    }
}
