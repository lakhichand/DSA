package BasicProgram;

public class Cond2 {

	public static void main(String[] args) {
		
		int a= 10;
		int b= 20;
		int c= 30;
		
		int large = a > b ? a:b;
		
		int largest = large > c ? large:c;
		
		System.out.println(largest);
	}
}
