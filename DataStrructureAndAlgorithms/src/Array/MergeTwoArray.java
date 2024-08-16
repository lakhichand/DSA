package Array;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4};
		
		int b []= {5,6,7,8};
		int ci = 0;
		int x[] = new int [a.length+b.length];
		
		for(int i =0;i<a.length;i++) {
			x[ci] = a[i];
			ci++;
		}
		for (int i= 0;i<b.length;i++) {
			x[ci] = b[i];
			ci++;
		}
		System.out.println("Element store succefully");
		for(int i = 0;i<x.length;i++) {
			System.out.print(x[i]);
		}
	}
}
