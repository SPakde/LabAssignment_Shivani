/**
		Author : Shivani
		Date  : 28-10-2020
		Description  :To find the difference between two consecutive digits 
*/

import java.util.*;

public class DifferenceofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");// user input

		int num = sc.nextInt();
		int rev = modifyNumber(num);

	}

	public static int modifyNumber(int rev) {
		int sum = 0;
		int h = rev % 10;
		while (rev != 0) { // to reverse the number
			int a = rev % 10;
			sum = sum * 10 + a;
			rev = rev / 10;

		}
		System.out.println(sum);

		while (sum != 0) { // To find the difference of digits
			int k = sum % 10;
			sum = sum / 10;
			int l = sum % 10;

			int result = k - l;
			System.out.print(Math.abs(result));// printing the absolute value of result
		}
		return rev;

	}

}
