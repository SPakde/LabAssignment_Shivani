/**
		Author : Shivani
		Date  : 23-10-2020
		Description  : Second Smallest Element in list of Array
*/	

import java.util.Scanner;
public class SmallestElement 
{
    public static void main(String[] args) 
    {
    	
    	
    	//To input the array size
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in the array: ");
        int n = sc.nextInt();
        int temp;
        
        //To input the array elements
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        getSecondSmallest(n, arr);//To get the sort the array in increasing order
        
        System.out.print("Second Smallest Array element is: "+arr[1]);//Display the second smallest element
    }

	private static void getSecondSmallest(int n, int[] arr) {
		int temp;
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
	}
}
