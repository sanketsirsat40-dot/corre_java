package array;

public class Deleting {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int deleteIndex = 2;

        int[] newArray = new int[numbers.length - 1];

        for (int i = 0; i < deleteIndex; i++) {
            newArray[i] = numbers[i];
        }

        for (int i = deleteIndex; i < newArray.length; i++) {
            newArray[i] = numbers[i + 1];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
