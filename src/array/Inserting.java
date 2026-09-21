package array;

public class Inserting {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int[] newArray = new int[5];

        for (int i = 0; i < 2; i++) {
            newArray[i] = numbers[i];
        }

        newArray[2] = 25;

        for (int i = 2; i < numbers.length; i++) {
            newArray[i + 1] = numbers[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
