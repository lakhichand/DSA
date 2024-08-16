package BinarySearch;

import java.util.Arrays;

public class StrictlySortedArray {

	public static void main(String[] args) {
		
		int arr[][]={
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		
		int target = 11;
		
		System.out.println(Arrays.toString(binary(arr, target)));
	}
	static int[] search(int [] [] matrix,int row,int cstart,int cend,int target) {
		
         while(cstart<=cend){
			
        	 int mid = cstart+(cend-cstart)/2;
        	 
        	 if(matrix[row][mid] == target) {
        		 return new int[] {row,mid};
        	 }
        	 if(matrix[row][mid]<target) {
        		 cstart = mid+1;
        	 }
        	 else {
        		 cend = mid-1;
        	 }
		}
         return new int [] {-1,-1};
	}
	static int [] binary(int[][] matrix, int target){
		
		int row = matrix.length;
		
		int col = matrix[0].length;
		
		if(col == 0) {
			return new int [] {-1,-1};
		}
		if(row == 1) {
			return search(matrix, 0, 0, col-1, target);
		}
		
		int rstart =0;
		int rend = row-1;
		int cmid = col/2;
		
		while(rstart<(rend-1)) {
			int mid = rstart+(rend-rstart)/2;
			
			if(matrix[mid][cmid]== target) {
				return new int [] {mid,cmid};
			}
			if(matrix[mid][cmid]<target) {
				rstart = mid;
			}else {
				rend = mid;
			}
		}
		// now ewe have to chaeck two rows
		
		if(matrix[rstart] [cmid] ==target) {
			return new int []{rstart,cmid};
		}
		if(matrix[rstart+1][cmid]== target) {
			return new int []{rstart+1,cmid};

		}
	//1st hale
	if(target<=matrix[rstart][cmid-1]) {
		return search(matrix, rstart, 0, cmid-1, target);
	}
	//2nd half
	if(target>=matrix[rstart][cmid-1]&& target<=matrix[rstart][col-1]) {
		return search(matrix, rstart, cmid+1, col-1, target);
	}//3rd half
	if(target<=matrix[rstart+1][cmid-1]) {
		return search(matrix, rstart+1, 0, cmid-1, target);
	}//4th half
	else {
		return search(matrix, rstart+1, cmid+1, col-1, target);
	}
	}
}

