package Week3.day2;
import java.util.Arrays;
public class AnagramCheck {

	public static void main(String[] args) {
		 // Step 1: Define two input strings
        String text1 = "stops";
        String text2 = "potss";

        // Step 2: Check if lengths are equal
        if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
            return; // Exit program
        }

        // Step 3: Convert both strings to character arrays
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        // Step 4: Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 5: Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }
    }

	}


