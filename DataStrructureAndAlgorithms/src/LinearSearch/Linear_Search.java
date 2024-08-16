package LinearSearch;

public class Linear_Search {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int target = 7;
		System.out.println(linear(arr, target));
		
	}
	static int linear(int arr[],int target) {
		for(int i = 0;i<arr.length;i++) {
		if (target ==arr[i]) {
			return i;
		}
		
		}
		return -1;
	}
}
