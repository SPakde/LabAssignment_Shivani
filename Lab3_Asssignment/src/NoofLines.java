
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
		int Count=0;
		
		String[] words = name.split(" ");
		 Count = Count + words.length;// to check for words 
		 
		for (int i = 0; i < name.length(); i++) {
			
		if (name.charAt(i) == '.')// to check for line
			{
				line++;
			}
		if (Character.isLetter(name.charAt(i))) //to check for characters
		{
			character++;   
		}
		}
		// Printing no of lines,words,characters in the text
		
		System.out.println("No. of Characters in the string are :" + character);
		System.out.println(" No. of Words in the string are :" +Count);
		System.out.println("No. of Lines in the string are : " + line);
	}
	}

