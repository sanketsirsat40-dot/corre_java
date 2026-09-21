package array;

public class Minimum {
    public static void main(String[] args) {


    int[] numbers = {25, 10, 45, 5, 30};

    int min = numbers[0];

for (int i = 1; i < numbers.length; i++) {

        if (numbers[i] < min) {
            min = numbers[i];
        }
    }

System.out.println("Minimum = " + min);
    }
}
