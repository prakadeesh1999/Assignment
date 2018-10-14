import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int i, fact=1;
		int n;
		System.out.println("enter a number:");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of"+n+"is:"+fact);

	}

}
