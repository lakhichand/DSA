package Abstraction;

public class Linux extends Calculator{
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
	public void sub(int a ,int b) {
		
		System.out.println(a-b);
	}
	public void div(double x,double y) {
		
		System.out.println(x/y);
	}
	public void mul(int p ,int q) {
		
		System.out.println(p*q);
	}

}
