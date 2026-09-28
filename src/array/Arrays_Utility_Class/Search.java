package array.Arrays_Utility_Class;
import java.util.Arrays;
public class Search {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int result = Arrays.binarySearch(numbers, 30);

        System.out.println(result);
    }
}
