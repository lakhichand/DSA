package BinarySearch;

public class Order_Argnostics_Array {

	public static void main(String[] args) {
		
		int arr [] = {99,88,77,55,44,33,22,11,1};
	     
		int target  =55;
		
		System.out.println(Binary(arr, target));
	}
	private static int Binary(int arr[] , int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		boolean res = arr[start]<arr[end];
		
		while(start<= end) {
			
			int mid = start + (end-start) /2;
			
			if (target == arr[mid]) {
				return mid;
			}
			if(res) {
				
				if(target> arr[mid]) {
					start = mid+1;
				}
				else if(arr[mid]> target) {
					end = mid-1;
				}
			}
			else {
				if(target> arr[mid]) {
					end  = mid-1;
				}
				else {
					start = mid+1;
				}
			}
		}
	return -1;	
	}
}
