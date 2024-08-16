package Pattern;

public class Pattern6 {

	public static void main(String[] args) {
		
		int n= 5;
		
		for(int i = 1;i<=n;i++) {
			
			for(int j = 1;j<=i;j++) {
				int sum = i+j;
				if (sum %2 == 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
//1   use matrix combination of two no addition if zero then put 1
//01    apna college
//101
//0101
//10101
