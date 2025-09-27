package Week3.day1;
import java.util.Arrays;

public class PrintDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 7, 5, 9, 2, 3};

        // Sort the array
        Arrays.sort(arr);

        // Print sorted array
        System.out.print("Sorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Find duplicates using simple for loop
        System.out.print("\nDuplicates: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}




