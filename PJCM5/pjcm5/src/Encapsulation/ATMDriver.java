package Encapsulation;

public class ATMDriver {

   public static void main(String[] args) {
	
	   ATM a1 = new ATM("SBI","DECCAN",500000.00,123456);
	   
	   System.out.println(a1.getName());
	   
	   System.out.println(a1.getBalance(123456789, 1234));
	   
	   a1.setmoney(123456789, 1234, 1000.00);
   }

}
