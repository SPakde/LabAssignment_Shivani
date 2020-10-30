
/**
		Author : Shivani
		Date  : 28-10-2020
		Description  : To find the mirror image of entered string 
*/
import java.util.*;

public class MirrorImage {

	public static void main(String[] args) {
		System.out.println("Enter a string :");//user input
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String r = getImage(str);

	}

	public static String getImage(String r)

	{
		int k = r.length();// Storing the length of the string

		for (int i = 0; i < k; i++) {
			System.out.print(r.charAt(i));// Storing the char reference with index number
		}
		System.out.print("||");

		for (int i = (k - 1); i >= 0; i--)// condition for reverse of the String
		{
			System.out.print(r.charAt(i));
		}

		return r;
	}



}


