package week1.day2140925;

public class PalindromAssignment3 {

	 
		 public static void main(String[] args) {
		        int input = 12345;   // You can change the number to test
		        int output = 0;    // To store the reversed number
		        int rem;           // To store remainder

		        // Reverse the number using for loop
		        for (int i = input; i > 0; i = i / 10) {
		            rem = i % 10;                  // get last digit
		            output = (output * 10) + rem;  // build reversed number
		        }

		        // Check if palindrome
		        if (input == output) {
		            System.out.println(input + " is a Palindrome.");
		        } else {
		            System.out.println(input + " is NOT a Palindrome.");
		        }
		    }
}
