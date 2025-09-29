package Week3.day2;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		  String test = "changeme";

	        // Convert the String to a character array
	        char[] charArray = test.toCharArray();

	        // Iterate through each character from start to end
	        for (int i = 0; i < charArray.length; i++) {
	            // Check if the index is odd
	            if (i % 2 != 0) {
	                // Convert the character at odd index to uppercase
	                charArray[i] = Character.toUpperCase(charArray[i]);
	            }
	        }

	        // Print the modified character array
	        for (char c : charArray) {
	            System.out.print(c);
	        }
	    }
	}

