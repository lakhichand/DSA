package Recursion;

public class Recursion1 {// program for printing no 1 to 5

	public static void print(int i) {
		int n = 6;
		if (i == n) {
			return;
		}
		System.out.print(i);
		print(i+1);
	}
	public static void main(String[] args) {
		print(1);
	}
}
