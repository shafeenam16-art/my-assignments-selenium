package week1.day2140925;

public class PalindromAssignment3 {

	 public static void main(String[] args) {
	        int number = 12345;  // you can change the number to test
	        int original = number;
	        int reversed = 0;

	        // Reverse the number
	        while (number > 0) {
	            int digit = number % 10;
	            reversed = (reversed * 10) + digit;
	            number = number / 10;
	        }

	        // Check palindrome
	        if (original == reversed) {
	            System.out.println(original + " is a Palindrome.");
	        } else {
	            System.out.println(original + " is not a Palindrome.");
	        }
	    }
}
