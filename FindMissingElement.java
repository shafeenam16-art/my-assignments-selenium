package Week3.day1;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		// Given input array
	              // 0  1  2  3  4  5  6	 
        int[] arr = {1, 4, 3, 2, 8, 6, 7};

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Loop through the array to find missing number
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                System.out.println("Missing number: " + (arr[i] + 1));
                break;
            }
        }
    }
}
	


