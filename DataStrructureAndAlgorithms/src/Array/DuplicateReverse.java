package Array;

public class DuplicateReverse {

	public static void main(String[] args) {
		int a [] = {1,2,3,4};
		
		int b[]  = new int[a.length];
		int c = a.length-1;
		
		for(int i = 0;i<b.length;i++) {
			b[c] =a[i];
			c--;
			
		}
		for(int i = 0;i<b.length;i++) {
			System.out.print( b[i] );
		}
	}

}
