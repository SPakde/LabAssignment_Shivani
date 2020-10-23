import java.util.*;
public class PowerofTwo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		boolean result=powerOf2(n);
		System.out.println(result);

	}

	private static boolean powerOf2(int n) {
		
		while(n!=1)
	    {
	        if(n%2!=0)
	            return false;
	        n=n/2;
	    }
		return true;
	}

}