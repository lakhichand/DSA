package BinarySearch;

public class MountainArray {

	public static void main(String[] args) {
		int arr[] = {1,3,5,6,4,2};
		System.out.println(Array(arr));
	}
	 public static int Array(int[] arr) {
	        
	        int start = 0;
	        int end = arr.length-1;
	        
	        while(start<end){
	            
	            int mid  =  start+(end-start)/2;
	            
	            if(arr[mid]>arr[mid+1]){
	                end = mid;
	            }
	            else{
	                start = mid+1;
	            }
	        }
	        return start;
	    }
	}

