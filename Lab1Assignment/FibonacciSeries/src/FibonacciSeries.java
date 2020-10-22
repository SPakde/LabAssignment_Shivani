import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,a=1,b=1,c=0,num;
		System.out.println("Enter a number");
		num=sc.nextInt();
		System.out.println(a);
		System.out.println(" "+b);
		for(i=0;i<num-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(" "+c);
		}
		System.out.println();
		
	}

}
