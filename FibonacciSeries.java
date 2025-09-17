package week1.day2140925;

public class FibonacciSeries {
	 public static void main(String[] args) {
	        int range = 8;   // fixed range
	        int first = 0, second = 1;

	        System.out.print(first + ", " + second);

	        int next;
	        for (next = first + second; next <= range; next = first + second) {
	            System.out.print(", " + next);
	            first = second;
	            second = next;
	        }

	        // print one extra number after range
	        System.out.print(", " + (first + second));
	    }
	
}
