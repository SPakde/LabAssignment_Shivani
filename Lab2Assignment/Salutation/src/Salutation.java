/**
		Author : Shivani
		Date  : 23-10-2020
		Description  : Assigning the proper salutation 
*/	

import java.util.*;
public class Salutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Arr[][] = new String[2][];
		Arr[0] = new String[]{"Mr", "Ms", "Mrs"};
		Arr[1] = new String[]{"Pratik", "Aishwarya", "Surya", "Dushyant", "Somesh", "Praveen"};


	
		for(int i=0;i<6;i++)
		{
			if(Arr[1][i] == "Pratik" || Arr[1][i] == "Dushyant" || Arr[1][i] == "Somesh" || 
					Arr[1][i] == "Praveen") //If the names are male add Mr
			{
				System.out.println(Arr[0][0]+". "+Arr[1][i]);
			}
			else if(Arr[1][i] == "Surya") //If the name is female and unmarried add Ms
				System.out.println(Arr[0][1]+". "+Arr[1][i]);
			else 	//If the name is female and married add Mrs
				System.out.println(Arr[0][2]+". "+Arr[1][i]);
		}
      }
	
}


