package string;

public class String_Methods {

    public static void main(String[] args) {

        String text = "  Hello Java Programming  ";
        String word = "Java";

        // 1. length()
        System.out.println("Length: " + text.length());

        // 2. charAt()
        System.out.println("Character at index 2: " + text.charAt(2));

        // 3. toUpperCase()
        System.out.println("Uppercase: " + text.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + text.toLowerCase());

        // 5. substring()
        System.out.println("Substring: " + text.substring(8, 12));

        // 6. contains()
        System.out.println("Contains Java: " + text.contains(word));

        // 7. startsWith()
        System.out.println("Starts with spaces: " + text.startsWith("  "));

        // 8. endsWith()
        System.out.println("Ends with spaces: " + text.endsWith("  "));

        // 9. equals()
        String a = "Java";
        String b = "Java";
        System.out.println("a equals b: " + a.equals(b));

        // 10. equalsIgnoreCase()
        String c = "JAVA";
        System.out.println("a equals c: " + a.equalsIgnoreCase(c));

        // 11. indexOf()
        System.out.println("Index of Java: " + text.indexOf("Java"));

        // 12. replace()
        System.out.println("Replace Java: " + text.replace("Java", "Python"));

        // 13. trim()
        System.out.println("After trim: " + text.trim());
    }
}

