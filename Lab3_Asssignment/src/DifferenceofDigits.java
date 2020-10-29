/**
		Author : Shivani
		Date  : 28-10-2020
		Description  :To find the difference between two consecutive digits in the original number 
*/

import java.util.*;
public class DifferenceofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");//user input
		
	    int num = sc.nextInt();
		int rev = modifyNumber(num);

	}

	public static int modifyNumber(int rev) {
		int sum = 0;
		int h = rev % 10;
		while (rev != 0) {
			int a = rev % 10;
			sum = sum * 10 + a;
			rev = rev / 10;

		}
		System.out.println(sum);// Reverse of the number

		while (sum != 0) {
			int k = sum % 10;
			sum = sum / 10;
			int l = sum % 10;

			int result = k - l;
			System.out.print(result);
		}
		return rev ;

	}

}
