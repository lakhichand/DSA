package Recursion;

public class Recursion2 {// program for printing no 5 to 1
 
	public static void print(int i)
	{
		if (i == 0) {
			return;
		}
		System.out.println(i);
		print(i-1);
	}
	public static void main(String[] args) {
		print(5);
	}
}
