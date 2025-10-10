package Week4.day1;

public class Amazon extends CanaraBank{

public void upiPayments() {
	System.out.println(" upi payments");
	
}
public void CardPayments() {
	System.out.println(" card payments");
}
public void internetiBanking() {
	System.out.println(" internet banking");
	
}

@Override
public void cashonDelivery() {
	System.out.println("cash on delievery");
	}
	

@Override
public void recordPaymentDetails1() {
	super.recordPaymentDetails();
	System.out.println(" record payment details in canara bank");
	
}
public static void main(String[]args) {
	Amazon orderOptions=new Amazon();
	orderOptions.CardPayments();
	orderOptions.cashonDelivery();
	orderOptions.internetiBanking();
	orderOptions.upiPayments();
	orderOptions.recordPaymentDetails();
	
}
}
