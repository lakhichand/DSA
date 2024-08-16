package BinarySearch;

public class Find_Number_In_Infinite_Loop {

	public static void main(String[] args) {
		
		int arr[] = {1,22,23,45,56,78,89,100,112,115};
		int target = 45;
		
		System.out.println(check(arr, target));
	}
	private static int check(int arr[], int target) {
		
		int start = 0;
		int end =1;
		while(target> arr[end]) {
			 
			int newstart = end+1;
			
			end = end+(end-start+1)+2;
			start = newstart;
			
		}
		return serach( arr , target , start , end);
		
	}
	private static int serach(int[] arr, int target, int start, int end) {
		
		
		while(start<=end) {
		
			int mid = start +(end- start)/2;
			
			if(target > arr[mid]) {
				start = mid+1;
				
			}
			else if(target< arr[mid]) {
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
