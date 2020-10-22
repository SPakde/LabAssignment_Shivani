import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer");
		int number=sc.nextInt();
		int flag=0;
		for(int i=1;i<=number;i++)
	   {
	    for(int j=2;j<i;j++)
	   {
	   if(i%j==0)
	   {
	   flag++;
       }
	   }
	   if(flag==0)
	   {
	   if(i!=1)
	   {
	   System.out.print(i+" ");
	   }
	   }
       flag=0;
	   }
	}
	
}
