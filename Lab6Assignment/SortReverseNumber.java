/**
		Author : Shivani
		Date  : 5-11-2020
		Description  : Reversing the numbers in the array and returning the resulting array in sorted order


*/
package Lab6;

import java.util.*;

public class SortReverseNumber {
	public static void main(String[] args) {
		
		//Integer array to store the elements
		List<Integer> result=new ArrayList<>(Arrays.asList(74,85,21,93,14));
		
		//Calling the getsorted method
		List<Integer> reverse = getSorted(result);

		System.out.println("Sorted Reverse Array\n "+reverse);//printing the reverse sorted array
	}
	
	private static List<Integer> getSorted(List<Integer> result) {
		
		//creating reverseSorted for storing the array elements into list
		List<Integer> reverseSorted=new ArrayList<Integer>(result);
		
		Collections.reverse(reverseSorted);//Collections.reverse to reverse 
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i);
		 }
		 System.out.println("Reverse Sorted Array\n "+reverseSorted);
		 Collections.sort(reverseSorted);//Collections.sort to sort
		 for(int i=0;i>result.size();i++) {
			 reverseSorted.add(i); //printing the sorted elements
		 }
		 return reverseSorted;
	}

	
	

}