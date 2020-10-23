/**
		Author : Shivani
		Date  : 23-10-2020
		Description  : Sort elements in alphabetical order
*/

import java.util.Scanner;
import java.util.Arrays;
public class AlphabeticalSort {
	public static void main(String[] args) {
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names: ");//User inputs
		for (int i=0;i<((names.length/2)+1 );i++ ) {
			names[i] = sc.next();
		}
		for(int i=((names.length/2)+1 );i<names.length;i++) {
			names[i]=sc.next();
	    }
		Arrays.sort(names);
		for (int i=0;i<names.length ;i++) {//Alphabetical order sorting
			System.out.println(" " + names[i]);
		}
	}
}
