package MethodShadowing;

public class ChildDriver {
	
	public static void main(String[] args) {
		
		Parent c1 = new Child();
		
		c1.m1();
		
		c1.abc();
	}

}
