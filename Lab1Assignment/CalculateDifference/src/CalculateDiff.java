import java.util.Scanner;
public class CalculateDiff {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n :");
		int n=sc.nextInt();
		int Sum=0;
		sc.close();
		Sum=calculateDifference(n);
		System.out.println(+Sum);

	}

	private static int calculateDifference(int n) {
		
		int sumSq=0,sum=0;
		for(int i=1;i<=n;i++)
		{
		     sumSq+=i*i;
		     sum+=i;
		}
		int Sum=sumSq-(sum*sum);
		   return Sum;
	}
	
}
