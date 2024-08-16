package BinarySearch;

public class Smallest_Element_Greater_Than_Equal_To_Target {

	public static void main(String[] args) {
		
		int arr [] = {1,3,4,6,8,9,11,23,45,56,89};
		int target = 22;
		System.out.println(Binary(arr, target));
		
	}
	private static int Binary(int arr[] , int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<= end) {
			int mid = start + (end - start)/2;
			
			if(target> arr[mid]) {
				start = mid+1;
			}
			else if (target <arr[mid]) {
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return arr[start];
		
	}
}
