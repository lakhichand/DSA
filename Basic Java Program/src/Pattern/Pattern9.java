package Pattern;

public class Pattern9 {
  
	public static void main(String[] args) {
		left(5);
	}
	
	public static void left (int n) {
		
		for(int i =1;i<=n;i++) {
			
			for(int j = n-i+1;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

//54321
//4321
//321
//21
//1
