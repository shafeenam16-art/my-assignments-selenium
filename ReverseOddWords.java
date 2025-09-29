package Week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";

        // Split the sentence into words
        String[] words = test.split(" ");

        // Loop through words
        for (int i = 0; i < words.length; i++) {
            // Reverse odd-position words manually
            if (i % 2 != 0) {
                String reversed = "";
                char[] letters = words[i].toCharArray();
                for (int j = letters.length - 1; j >= 0; j--) {
                    reversed += letters[j];
                }
                words[i] = reversed;
            }
        }

        // Combine words into a sentence
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            if (i < words.length - 1) {
                result += " ";
            }
        }

        // Print result
        System.out.println(result);
    }
}