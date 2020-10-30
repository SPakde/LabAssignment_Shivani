/**
	Author : Shivani
	Date  : 28-10-2020
	Description  : Find the positive string
*/

import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");//Enter any string 
        String str=s.nextLine();
        boolean result=PositiveString(str);
        System.out.println(result);
	}

	private static boolean PositiveString(String str) //method for positive string
	{
		for(int i=0;i<str.length()-1;i++)
        {
	         if(str.charAt(i)<str.charAt(i+1)) //comparison
	         {
	        	 int j=0;
	         }
	         else 
	        	 return false;        
        }
		return true;
	}

}

