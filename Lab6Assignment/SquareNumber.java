/**
		Author : Shivani
		Date  : 5-11-2020
		Description  : Accepting an array of numbers and returning the numbers and their squares in Hashmap
*/
package Lab6;

import java.util.*;

public class SquareNumber {
	public static void main(String[] args) {
		
		//Integer array to store the numbers
		int sqNum[]= {3,7,2,5,4,8};
		
		//Calling getSquares method
		Map<Integer,Integer> squareNum=getSquares(sqNum);
		System.out.println(squareNum); //printing the squares
		
	}

	private static Map<Integer, Integer> getSquares(int[] sqNum) {
		
		// HashMap to store the numbers and their squares
		Map<Integer,Integer> squareMap=new HashMap<>();
		
		for(int square:sqNum) {
			squareMap.put(square,square*square);//squaring the number and putting in Hashmap
		}
		return squareMap; //returning squareMap
	}

}