package BinarySearch;

public class Greatest_Number_Smaller_Than_Equal_to_Target {
 
	public static void main(String[] args) {
		
		int arr[] = {1,3,5,8,11,15,18,20};
		int target = 14;
		
		System.out.println(Binary(arr, target));
	}
	private static int Binary(int arr[] , int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			
			int mid = start + (end-start)/2;
			
			if(target> arr[mid]) {
				start = mid+1;
			}
			else if(target<arr[mid]) {
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return arr[end];
		
	}
	
}
