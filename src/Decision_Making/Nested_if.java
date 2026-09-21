package Decision_Making;

public class Nested_if {
    public static void main(String[] args) {
        int age = 20;
        boolean idCard = true;

        if (age >= 18) {

            if (idCard) {
                System.out.println("Entry allowed");
            }
        }
    }
}
