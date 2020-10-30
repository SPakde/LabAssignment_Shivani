/**
	Author : Shivani
	Date  : 28-10-2020
	Description  : Java program that reads a line of integers and then displays each integer and the sum of all integers
*/

import java.util.*;

public class SumofInteger {

	public static void main(String[] args) {

		int number;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer : ");// user input for integer
		String str = sc.nextLine();

		StringTokenizer st = new StringTokenizer(str, " ");
		
		while (st.hasMoreTokens()) {// method checkes availability of token
			
			String temp = st.nextToken(); //storing token in the temp 
			number = Integer.parseInt(temp); //converts string to integer
			System.out.println(number); //prinths the number 
			sum = sum + number;
		}
		System.out.println("sum:" +sum);//printing the sum of the intergers

	}

}