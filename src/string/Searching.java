package string;

public class Searching {
    public static void main(String[] args) {

        String text = "Java is easy and Java is powerful";

        // 1. indexOf()
        System.out.println("First Java: " + text.indexOf("Java"));

        // 2. lastIndexOf()
        System.out.println("Last Java: " + text.lastIndexOf("Java"));

        // 3. contains()
        System.out.println("Contains easy: " + text.contains("easy"));

        // 4. startsWith()
        System.out.println("Starts with Java: " + text.startsWith("Java"));

        // 5. endsWith()
        System.out.println("Ends with powerful: "
                + text.endsWith("powerful"));
    }
}
