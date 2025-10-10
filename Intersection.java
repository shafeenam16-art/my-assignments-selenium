package Week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		   // Declare arrays
        Integer[] arr1 = {3, 2, 11, 4, 6, 7};
        Integer[] arr2 = {1, 2, 8, 4, 9, 7};
        
        // Convert arrays to lists
        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        
        // Use retainAll() to keep only common elements
        list1.retainAll(list2);
        
        // Print the intersection
        System.out.println("Intersection of numbers: " + list1);
    }
}


	

