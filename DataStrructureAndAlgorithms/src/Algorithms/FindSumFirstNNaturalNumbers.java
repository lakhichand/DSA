package Algorithms;

public class FindSumFirstNNaturalNumbers {

	public static void main(String[] args) {
		hii(8);
		hello(8);
	}
	public static void hello(int a) {
		System.out.println(a*(a+1)/2);
	}
	public static int hii(int n) {
		int sum = 0;
		for(int i = 0;i<=n;i++) {
			sum = sum+i;
		}
	 return sum;
	}
}
// 