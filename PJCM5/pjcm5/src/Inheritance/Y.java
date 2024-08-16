package Inheritance;

public class Y extends x{
	
	int s= 10;
	public void abc ()
	{
		System.out.println(s);
		
		System.out.println(super.s);
		
		super.abc();
	}

}
