package Recursion;

public class Recursion0 {
   
	public static void print(int i)
	{
		if(i == 6) {
			return;
		}
		System.out.println("hello world");
		print(i+1);
	}
	public static void main(String[] args) {
		print(1);
	}
}
