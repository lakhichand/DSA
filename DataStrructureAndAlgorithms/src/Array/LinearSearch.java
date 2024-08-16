package Array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the elemnt that you you want to search");
		
		int search = s.nextInt();
		for(int i = 0;i<a.length;i++)
		{
			if (search == a[i]) {
				System.out.println("element that you find it will here at index of "+ i);
				break;
			}
			 if (i == a.length) {
				System.out.println("Element not found!");
			}
		}
	}
}
