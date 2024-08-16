package BinarySearch;

public class SmalletsLetter {

	public static void main(String[] args) {
		char arr[] = {'c','d','g','l'};
		
		char target = 'c';
		
		System.out.println(search(arr, target));
		
	}
	static char search(char arr[],char target) {
		
		        boolean[] seen = new boolean[26];
		        for (char c: arr)
		            seen[c - 'a'] = true;

		        while (true) {
		            target++;
		            if (target > 'z') target = 'a';
		            if (seen[target - 'a']) return target;
		        }
	    }
	}