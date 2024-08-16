package LinearSearch;

import java.util.Scanner;

public class Find_The_Number_With_Even_Number_Of_Digit {

	public static void main(String[] args) {
	
		int arr[] = {12,35,546,45,2,121,454,522,54545};
		System.out.println(num(arr));
	}
	public static int num(int arr[]) {
		int count = 0;
		for(int i =0; i< arr.length;i++) {
			if(even(arr[i])) {
				count++;
			}
		}
		return count;
	}
	 static boolean even(int arr) {
		int check = digit(arr);
		
		return check %2 == 0;
	}
	 static int digit(int arr) {
		 int count = 0;
		 while(arr>0) {
			 count++;
			 arr =arr/10;
		 }
		 return count;
	 }
}