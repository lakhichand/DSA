package MethodShadowing;

public class Child extends Parent{
	
	public void m1 ()
	{
		System.out.println("new design");
	}
	public static void abc ()
	{
		System.out.println("from child class ststic method");
	}
}
