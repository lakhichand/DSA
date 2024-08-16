package LinearSearch;

import java.io.Serial;

public class LinearSearchReccursion {

	public static void main(String[] args) {
		
		int arr[] = {1,5,4,8,7,9,1,2,45,87,9,85,6,1};
		
		int target = 8;
		
		System.out.println(Search(arr, target, 1, 5));
	}
	static int Search(int arr[],int target,int start,int end) {
		
		if (arr.length == 0) {
			return -1;
			
		}
		
		for(int i  = start;i<end;i++)
		{
			if (target == arr[i]) {
				return i;
			}
			
		}
		return -1;
	}
}
