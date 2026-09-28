package array.Arrays_Utility_Class;
import java.util.Arrays;
public class Fill_an_Array {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        Arrays.fill(numbers, 10);

        System.out.println(Arrays.toString(numbers));
    }
}
