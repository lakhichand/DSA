package BinarySearch;

public class Find_In_Mountain_Array {

	public static void main(String[] args) {
		int arr []= {1,3,5,9,10,7,4,2};
		
		int target = 5;
		System.out.println(binary(arr, target, target, target));
	}
	static int search(int arr[], int target, int start, int end) {
		
		
		while(start<end) {
			
			int mid = start+(end-start)/2;
			
			if (arr[mid]>arr[mid+1]) {
				
				end = mid;
			}
			else {
				start = mid+1;
			}
		}
		return start;
	}
	static int binary(int arr[], int target,int start, int end) {
		
		int start1 = 0;
		int end1 = start;
		
            while(start<=end) {
            int mid = start+(end-start)/2;
            if(target == arr[mid]) {
        		return mid;
        	}
			if(start<end) {
			if (target>arr[mid]) {		
				start = mid+1;
			}
			else {
				end = mid-1;
			}
			}
			else
			{
				if (target>arr[mid]) {		
					end = mid-1;
				}
				else {
					start = mid+1;				}
				
			}
		
			
	}
			return -1;
}
}
