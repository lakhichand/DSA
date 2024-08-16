package VariableShadowing;

public class childDriver {
	
	public static void main(String[] args) {
		parent c1 = new child();
		
		System.out.println(c1.a);
		
		System.out.println(c1.s);
	}
}
