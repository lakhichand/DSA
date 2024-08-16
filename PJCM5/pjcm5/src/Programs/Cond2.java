package Programs;

public class Cond2 {
	public static void main(String[] args) {
		
	int A = 10;
	int B= 20;
	int C = 40;
	
	int large = A>B?A:B;
	
	int largest = large>C?large:C;
	
	System.out.println(largest);
	}
	
}
