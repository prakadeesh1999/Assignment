import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int r,sum=0,b;
		int n;
		System.out.println("enter a number:");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		b=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(b==sum)
		{
			System.out.println("palindrome number");
			
		}
		else
		{
			System.out.println("It is not a palindrome number");
		}

	}

}
