package LinearSearch;

public class TwoDArray {

	public static void main(String[] args) {
		
		int [] []arr = {
				{1,2,3,4,5},
				{45,7,8,9,2},
				{4,5,1,2}
		};
		
		for(int row =0;row<arr.length;row++) {
			for(int col =0;col<arr[row].length;col++){
				
				System.out.print(arr[row] [col]+" ");
			}
			System.out.println( );
		}
		
	}
}

