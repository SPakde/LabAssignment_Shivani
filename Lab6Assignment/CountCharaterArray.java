/**
		Author : Shivani
		Date  : 5-11-2020
		Description  :Accepting a character array and counting the number of times each character is present in the array.
*/

package Lab6;

import java.util.*;

public class CountCharaterArray {
	public static void main(String[] args) {
		
		// creating character array for storing character values in it
		char[] character= {'d','e','a','r','w','a','d'};
		
		Map<Character,Integer> charOccurence=countChars(character);
		
		//Displaying the Hashmap
		System.out.println(charOccurence);
	}
     
	//countChars method to accept characters array and return the characters and their count as map
	private static Map<Character, Integer> countChars(char[] character) {
		Map<Character,Integer> countChar=new HashMap<Character,Integer>();
		for(char ch:character)  {  
			if(countChar.containsKey(ch)) {// checking each character occurence
				countChar.put(ch,countChar.get(ch)+1);
			}
			else {
				countChar.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer> entry: countChar.entrySet()) {
			countChar.put(entry.getKey(),entry.getValue());
		}
		return countChar; // return the count of the character
	}

}