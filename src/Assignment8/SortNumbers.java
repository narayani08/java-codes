package Assignment8;

import java.util.Arrays;

public class SortNumbers {
	
	public static void displaySortedNumber(int ar[]) {
		Arrays.sort(ar);
		for(int i = 0; i < ar.length; i++) { 
			System.out.println(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] ar = new int[] {12, 34, 45, 56, 23, 21};
		displaySortedNumber(ar);
	}
}
