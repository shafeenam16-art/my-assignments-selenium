package week2.day1200925;

public class LibraryAssignment {

	// Method to add a book
	String book;
    public void addBook(String Title) {
    	book = Title;
        System.out.println("Book added successfully:  " + Title);
        
    }

    // Method to issue a book
    public void issueBook() {
        System.out.println("Book issued successfully:  " + book);
        
    }
    public void returnBook() {
    	System.out.println("Book returned successfully: " + book);
    }
    //main method to run program
    public static void main(String[]args) {
    	LibraryAssignment lib = new LibraryAssignment();
    	lib.addBook("Quran");
    	lib.issueBook();
    	lib.returnBook();
    	
    	
    }
    	
}
