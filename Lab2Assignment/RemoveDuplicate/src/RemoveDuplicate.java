/**
		Author : Shivani
		Date  : 23-10-2020
		Description  : Remove duplicate and sorting of the array
*/	

import java.util.*;
public class RemoveDuplicate 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in the array: ");//Get Input from user
        int n = sc.nextInt();
        int temp;
        
        //To input  the array elements from user
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
   n = modifyArray(n, arr);
    //Sorting of array in descending order    
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] < arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
     //Printing the array
        System.out.println("The elements of array are:");
        for(int a = 0;a < n; a++) {
        System.out.println(+arr[a]);	
    	}

	}

	private static int modifyArray(int n, int[] arr) {
		//Place the duplicates at last of array and decrease the side of array
        for(int i = 0;i < n; i++) {
        	for(int j = i+1;j < n; j++) {
        	if(arr[i]==arr[j]) {
        		arr[j]=arr[n-1];
        		n--;
        	}
        }
     }
		return n;
	}
}
