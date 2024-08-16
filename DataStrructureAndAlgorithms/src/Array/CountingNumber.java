package Array;

import java.util.Scanner;

public class CountingNumber {

	public static void main(String[] args) {
		
		int a []= {1,2,3,4,5,4,5};
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the no that you want count");
		int se = s.nextInt();
		int c = 0;
		for(int i =0;i<a.length;i++) {
			if (se == a[i]) {
				c++;
			}
		}
		System.out.println("The element  found that much time "+c);
	}
}
