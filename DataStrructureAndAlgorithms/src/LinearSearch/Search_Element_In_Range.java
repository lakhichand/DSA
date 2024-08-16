package LinearSearch;

import java.util.Scanner;

// searched element in range of index 3 to 7 

public class Search_Element_In_Range {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int arr[]= {18,22,12,-78,89,45,25,65,84,75};
		
		System.out.println("Enter the Element you want to search");
		int target = s.nextInt();
		SearchInRange(arr, target, 1, 5);
		
	}
	private static int SearchInRange(int arr [], int target, int start, int end) {
		
		for(int i = start;i<end;i++ ) {
			if(arr[i] == target) {
				System.out.println("your Element is at Index of -> " + i);
			}
		}
		return -1;
		
	}
}
