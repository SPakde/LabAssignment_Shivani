/**
	Author : Shivani
	Date  : 28-10-2020
	Description  : Program that displays the number of characters, lines and words in a text
*/


import java.util.*;

public class NoofLines {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the text");// user input
		String name = sc.nextLine();

		linesWords(name);
	}

	private static void linesWords(String name) {
		int word = 1, character = 0, line = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ' || name.charAt(i) == '.')// To check for space
			{
				word++;
			}
			if (name.charAt(i) == '.')// to check for line
			{
				line++;
			}
			character++;
		}
		//Printing no of lines,words,characters in the text
        
		System.out.println("No. of Characters in the string are :" + character);
		System.out.println(" No. of Words in the string are :" + word);
		System.out.println("No. of Lines in the string are : " + line);
	}

}
