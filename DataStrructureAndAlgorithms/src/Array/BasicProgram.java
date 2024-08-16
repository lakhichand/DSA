package Array;
import java.util.Scanner;

public class BasicProgram {
// storing and reversing the name by user input ----------BASIC PROGRAM
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Size of array");
		int size = s.nextInt();
		String s1 [] = new String[size];
		
		System.out.println(s1.length);
		System.out.println("Enter the country name");
		
		for(int i  = 0;i<s1.length;i++) {
			s1[i] = s.next();
		}
		System.out.println("named stored sucessfully");
		for(int i = s1.length-1;i>=0;i--){
			System.out.println(s1[i]);
		}
	}
}
