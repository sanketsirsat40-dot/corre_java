package string;
import java.util.Scanner;
public class user_input_nextLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Your full name is: " + name);
    }
}
