/*
 * @Author:Shivani
 * Date: 3 nov
 * Description:Exception handling based on first name and Last name
 */
package Lab5;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name:");//user input
		String first_name = sc.nextLine();
		System.out.println("Enter the last name:");//user input
		String last_name = sc.nextLine();
		try {
			if (first_name.length() == 0 || last_name.length() == 0) {// checking the condition length of the name
				throw new InvalidNameException("Provide a valid Input");// throws exception
			} else
				System.out.println(first_name+" "+last_name);//printing the names
		} catch (InvalidNameException e) {// handling the exception
			System.out.println(e.getMessage());
		}
	}

}