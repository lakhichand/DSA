package LinearSearch;

public class Finding_The_Minimun_Number {

	public static void main(String[] args) {
		
	
	int arr[] = {45,78,89,45,76,63,42,41};
	System.out.println(search(arr));
	}
	static int search(int arr[]) {
		
		 int  ans = arr[0];
		 
		 for(int i =0;i<arr.length;i++) {
			 
			 if (arr[i]<ans) {
				// for finding biggest element in the array just change
				 //< this to > this
				 ans = arr[i];
			}
		 }
		return ans;
		
	}
	
}
