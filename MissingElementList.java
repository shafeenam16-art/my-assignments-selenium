package Week4.day2;


	import java.util.*;

	public class MissingElementList {
	    public static void main(String[] args) {
	        // Declare an array
	        Integer[] numbers = {1, 2, 3, 4, 10, 6, 8};

	        // Convert array to list
	        List<Integer> list = Arrays.asList(numbers);

	        // Sort the list in ascending order
	        Collections.sort(list);

	        System.out.println("Sorted List: " + list);

	        System.out.println("Missing Numbers:");
	        // Loop through the list and check for missing numbers
	        for (int i = 0; i < list.size() - 1; i++) {
	            int current = list.get(i);
	            int next = list.get(i + 1);

	            // Check if there is a gap
	            if (next != current + 1) {
	                // Print all missing numbers between current and next
	                for (int missing = current + 1; missing < next; missing++) {
	                    System.out.println(missing);
	                }
	            }
	        }
	    }
	}


