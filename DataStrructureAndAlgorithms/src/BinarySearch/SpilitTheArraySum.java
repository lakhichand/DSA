package BinarySearch;

public class SpilitTheArraySum {

	public static void main(String[] args) {
		
		int arr []= {7,2,5,10,8};
		
		int m = 2;
		System.out.println(search(arr, m));
	}
	public static int search(int arr[],int m) {
		
		int start = 0;
		int end = 0;
		
		for(int i =0;i<arr.length;i++) {
			
			start = Math.max(start, arr[i]);//10
			
			end = end+arr[i];//32
			
			while
				(start<end) {//10<32
				int mid = start+(end-start)/2;
				
				int sum =0;
				int piece =1;
				
				for(int ar:arr) {
					
					if (sum+ar>mid) {
						
						sum = ar;
						piece ++;
					}
					else {
						sum += ar;
					}
				}
				if(piece>m) {
					start = mid+1;
				}else {
					end = mid;
				}
			}
		}
		return end;
	}
}
