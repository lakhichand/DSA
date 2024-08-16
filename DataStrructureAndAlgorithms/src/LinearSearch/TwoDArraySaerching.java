package LinearSearch;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraySaerching {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		 int [][]arr = {
				{1,2,3,4,5},
				{45,7,8,9,2},
				{4,5,1,2}
		};
		 System.out.println("write searching element");
		 
		 int target = s.nextInt();
		 System.out.println(Arrays.toString(search(arr, target)));
		 
	}
	static int[] search(int arr[][],int target) {
		
		for(int row = 0;row<arr.length;row++) {
			for(int col =0;col<arr[row].length;col++){
				if ( arr[row][col] ==target) {
					return new int []{row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	
		
	
		
}

