package Recursion;
//program printing first n sum of natural no
public class Recursion3 { 
	
	public static void sum(int a ,int n,int sum) {
		
		if (a == n) {
			sum +=a;
			System.out.println(sum);
			return;
		}
		
		sum = sum+a;
		
		sum(a+1,n,sum);
	}
	public static void main(String[] args) {
		sum(1, 5, 0);
	}

}
