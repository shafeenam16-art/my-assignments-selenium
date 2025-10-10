package Week4.day2;

public class JavaConnection implements DatabaseConnection {

	// Implement connect()
    public void connect() {
        System.out.println("Connecting to the database");
    }

    // Implement disconnect()
    public void disconnect() {
        System.out.println("Disconnecting from the database");
    }

    // Implement executeUpdate()
    public void executeUpdate() {
        System.out.println("Executing update query on the database");
    }

	
	public static void main(String[] args) {
		 JavaConnection connection = new JavaConnection();

	        connection.connect();
	        connection.executeUpdate();
	        connection.disconnect();
	    }
	}

	

