
package Abstraction;

public class Windows extends Calculator {
	
	public void add(int a,int b)
	{
		int res = (a+b);
		
		System.out.println(res);
	}
	
	public void  sub(int a,int b) {
		int res = (a-b);
		
		System.out.println(res);
	}
	
	public void div(double x,double y)
	{
		double  res = (x/y);
		System.out.println(res);
	}
	public void mul(int p,int q) {
		
		int res = (p*q);
		
		System.out.println(res);
	}
}
