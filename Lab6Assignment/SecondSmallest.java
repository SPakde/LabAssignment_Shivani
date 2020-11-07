/**
		Author : Shivani
		Date  : 5-11-2020
		Description  :Accepting an array of integer elements and returning the second smallest element in the array
*/

package Lab6;

import java.util.*;

public class SecondSmallest {
	public static void main(String[] args) {
		
		//Integer array to store the numbers
		Integer numArray[]= {52,72,12,59,36,57};
		
		int secondSmallestElement=getSecondSmallest(numArray);
		System.out.println("Second Smallest element is : "+secondSmallestElement);//printing the second smallest element
	}

	private static int getSecondSmallest(Integer[] numArray) {
		
		//creating elementList for storing the array elements into list
		List<Integer> elementList=Arrays.asList(numArray);
		
		Collections.sort(elementList);//sorting the elements
		
		System.out.println("Sorting Array\n"+elementList);
		Integer secondSmallest=elementList.get(1);//getting secondsmallest at index 1
		return secondSmallest;//returning the seconsmallestt element
	}

}