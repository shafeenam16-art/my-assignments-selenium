package Week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		
	    // Step 1: Declare array and convert to list
        List<Integer> list = new ArrayList<>();
        int[] numbers = {3, 2, 11, 4, 6, 7};
        for (int num : numbers) {
            list.add(num);
        }
        
        // Step 2: Find the largest number
        int largest = Collections.max(list);
        
        // Step 3: Remove the largest number from the list
        list.remove(Integer.valueOf(largest)); // use Integer.valueOf() to remove by value
        
        // Step 4: Find the second largest number
        int secondLargest = Collections.max(list);
        
        // Step 5: Print the result
        System.out.println("Second Largest Number: " + secondLargest);
	}

}
