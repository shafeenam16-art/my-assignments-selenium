package week1.day2140925;

public class IsprimeNumber {
	public static void main(String[] args)  {
	  int num=1;
	  boolean isprime=true;
	  for(int i=2;i<= num;i++) {
		  if(num % i==0) {
			  isprime=false;
			  break;
		  }
	  }
	  System.out.println(isprime);
  }
	
	
}
