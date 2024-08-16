package Encapsulation;

public class ATM {
	
	private String name;
	private String location;
	private double money;
	private int id;
	
	ATM(){}
	
	ATM(String name,String location,double money,int id)
	{
		this.name = name;
		this.location = location;
		this.money =  money;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getBalance(long accno,int pin) {
		long acno = 123456789l;
		int pin1 = 1234;
		
		String bal = "5000.00";
		
		if(acno == accno && pin == pin1) {
			return bal;
		}
		return"Invalid credential..accno.retry!";
	}
	public void setmoney(long accno,int pin,double amount) {
	
		long acno = 123456789l;
		int pin1 = 1234;
		
		if (acno == accno && pin1 == pin) {
			System.out.println("Loggeed in successfully!");
			
			if (amount<=money) {
				money = (money-amount);
				System.out.println("Withdraw successfully");
			}
			else {
				System.out.println("No cash");
			}
		}
		else {
			System.out.println("Invalid credential..retry!");
		}
	}
	 public static void main(String[] args) {
			
		   ATM a1 = new ATM("SBI","DECCAN",500000.00,123456);
		   
		   System.out.println(a1.getName());
		   
		   System.out.println(a1.getBalance(123456789, 1234));
		   
		   a1.setmoney(123456789, 1234, 1000.00);
	   }

}
