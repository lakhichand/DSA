package BinarySearch;

import java.util.Arrays;

public class SortedTwoDArray {

	public static void main(String[] args) {
		
		int arr [][] = {
				{10,20,30,40},
				{12,24,36,48},
				{15,30,45,60},
				{20,40,61,70}
				};
		int target = 45;
		
		System.out.println(Arrays.toString(binary(arr,target)));
		
	}
	static int[] binary(int arr[][],int target) {
		
		int row = 0;
		int col = arr.length-1;
		while(row<arr.length&&col>=0) {
			
		if (arr[row][col] == target) {
			
			return new int [] {row ,col};
		}
		if(target<arr[row][col]) {
			col--;
		}else {//target>arr[row][col]
			row++;
		}
		}
		return new int [] {-1,-1};
	}
}
