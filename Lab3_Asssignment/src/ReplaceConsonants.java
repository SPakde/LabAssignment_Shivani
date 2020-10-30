/**
		Author : Shivani
		Date  : 28-10-2020
		Description  : Replace all the consonents with the next alphabet  
*/

import java.util.*;

public class ReplaceConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");// Input the string
		String name = sc.nextLine();

		int length = name.length();//length of the entered string
		alterString(name, length);
	}

	private static void alterString(String name, int length) {
		for (int i = 0; i < length; i++)

		{
			char j = name.charAt(i);// storing string at character index

			if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u') {// Checking if char is vowel

				System.out.print(j);
			} else {
				char ch = name.charAt(i);
				ch++;
				System.out.print(ch);// Printing the altered string

			}
		}
	}

}
