package Encapsulation;

public class MobileDriver {
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("redmi","Black","snapdragon", 12000.00, 64,
				2, 4, 4000, 4)
				;			
		m1.insertsim("jio","4G","nano",9075538847l);
		
		
		m1.s1.displaySim();
	}

}
