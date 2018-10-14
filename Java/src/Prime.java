import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int a;
		int num;
		boolean isPrime=true;
		Scanner b=new Scanner(System.in);
		System.out.println("enter a number:");
		a=b.nextInt();
		for(int i=2;i<a/2;i++)
		{
			num=a%i;
			if(num==0)
			{
				isPrime=false;
			}
		}
		if(isPrime)
		{
			System.out.println(a+":is a prime number");
			
		}
		else
		{
			System.out.println(a+": is not a prime number");
		}

	}

}
