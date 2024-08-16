package Abstraction;

public class CalDriver {
	public static void main(String[] args) {
		
		Calculator w1 = new Windows();
		
		w1.add (10,20);
		
		w1.sub (10,20);
		
		Calculator l1 = new Linux();
		
		l1.add(30,20);
		
		l1.div(4, 2);
		
	}

}
