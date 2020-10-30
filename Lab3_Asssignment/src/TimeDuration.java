/**
		Author : Shivani
		Date  : 28-10-2020
		Description  : Display Duration from present date and entered date 
*/

import java.time.*;
import java.util.*;

public class TimeDuration {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");// Enter the year
		int year = sc.nextInt();
		
		System.out.println("Enter the month");// Enter the month
		int month = sc.nextInt();
		
		System.out.println("Enter the day");// Enter the day
		int date = sc.nextInt();
		
		LocalDate pdate = LocalDate.of(year, month, date);
		LocalDate now = LocalDate.now();
		Period diff = Period.between(now, pdate);
        
		//Printing the difference between entered date and present date
		
		System.out.printf("\nDifference between " + pdate + " and " + now + " %d years, %d months and %d days\n\n",
				diff.getYears(), diff.getMonths(), diff.getDays());
	}

}


