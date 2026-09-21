package array;
import java.util.Scanner;
public class Array_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        numbers[3] = sc.nextInt();
        numbers[4] = sc.nextInt();

        System.out.println("First number: " + numbers[0]);
        System.out.println("Last number: " + numbers[4]);
    }
}
