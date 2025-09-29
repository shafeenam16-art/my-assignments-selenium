package Week3.day1;

public class FindInterSection {

	public static void main(String[] args) {
		// First array
        int[] a = {3, 2, 11, 4, 6, 7};

        // Second array
        int[] b = {1, 2, 8, 4, 9, 7};

        System.out.println("Common elements:");

        // Compare each element of first array with second array
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }

	}


