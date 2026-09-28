package string;

public class StringImmutability {
    public static void main(String[] args) {

        String name = "Sanket";

        System.out.println("Before: " + name);

        name.concat(" Sirsat");

        System.out.println("After concat(): " + name);

        name = name.concat(" Sirsat");

        System.out.println("After assigning: " + name);

    }
}