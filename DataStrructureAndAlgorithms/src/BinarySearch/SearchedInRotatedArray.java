package BinarySearch;

public class SearchedInRotatedArray {

	public static void main(String[] args) {
		
		int arr[]  = {4,5,6,7,0,1,2};
		
		int target   = 6;
		System.out.println(result(arr,target));
		
		
	}
	static int result(int arr[], int target) {
		int pivot = pivot(arr);
		if (-1 == pivot) {
			
			return binary(arr, target, 0, arr.length-1);
		}
		if (target == arr[pivot]) {
			return pivot;
		}
		if (target >= arr[0]) {
		   return binary(arr, target, 0, pivot-1);
		}
		return binary(arr, target, pivot+1, arr.length-1);
	}
	static int pivot(int arr[]) {
		
		int start = 0;
		int end = arr.length;
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if (arr[mid]>arr[mid+1]) {
				return mid;
			}
			if (arr[mid]<arr[mid-1]) {
				return mid;
			}
			if(arr[start]>=arr[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}return -1;
	}
	static int binary(int arr[],int target,int start,int end) {
		
		while(start<=end) {
			int mid =start+(end-start)/2;
			
			if (target>arr[mid]) {
				start = mid+1;
				}
			else if(target<arr[mid]) {
				end = mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
