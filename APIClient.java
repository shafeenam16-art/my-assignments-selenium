package Week3.day2;

public class APIClient {

	// First version of sendRequest: accepts only endpoint
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request sent successfully.\n");
    }

    // Second version of sendRequest: accepts endpoint, requestBody, and requestStatus
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        if(requestStatus) {
            System.out.println("Request was successful.\n");
        } else {
            System.out.println("Request failed.\n");
        }
    }

    // Main method to demonstrate method overloading
    public static void main(String[] args) {
        // Create an object of APIClient
        APIClient client = new APIClient();

        // Call first version of sendRequest
        client.sendRequest("Api client users");

        // Call second version of sendRequest
        client.sendRequest("Api client users", "{Name: 'Shafeena', age: 30}", true);
    }
}
	
