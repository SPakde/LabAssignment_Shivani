/**
		Author : Shivani
		Date  : 23-10-2020
		Description  : Reverse the number in array and sort 
*/	

import java.util.*;
public class ReverseAndSort {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in the array: ");//Get Input from user
        int n = sc.nextInt();
        int temp;
        
        //To get input of the array elements from user
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        //To reverse and sort the array elements
        getSorted(arr);
        System.out.println("Sorted Array list is : "+Arrays.toString(arr));//To print the array elements
	}

	private static void getSorted(int[] arr) {
		ReverseAndSort obj=new ReverseAndSort();
        String s=Arrays.toString(arr);
        Arrays.sort(arr);
	}
}
