package Week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseCollectionString {

	public static void main(String[] args) {
		
		// Step 1: Declare a String array
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Step 2: Add array elements to a List
        List<String> companyList = new ArrayList<>(Arrays.asList(companies));

        // Step 3: Sort the list in ascending order
        Collections.sort(companyList);

        // Step 4: Reverse the order using reverse loop and print
        for (int i = companyList.size() - 1; i >= 0; i--) {
            System.out.print(companyList.get(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }     

	}

}
