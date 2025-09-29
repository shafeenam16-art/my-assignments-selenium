package Week3.day2;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";

        // Split the text into words
        String[] words = text.split(" ");

        // Initialize count for duplicates
        int count = 0;

        // Nested loops to find duplicates
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                // Case-insensitive comparison
                if (words[i].equalsIgnoreCase(words[j]) && !words[i].isEmpty()) {
                    words[j] = "";  // Replace duplicate with empty string
                    count++;        // Increment duplicate count
                }
            }
        }

        // Print the modified array only if duplicates are found
        if (count > 0) {
            System.out.print("Modified text without duplicates: ");
            for (String word : words) {
                if (!word.isEmpty()) {
                    System.out.print(word + " ");
                }
            }
        }
    }
}


