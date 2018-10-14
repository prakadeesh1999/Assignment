import java.util.Scanner;
public class Big {

	public static void main(String[] args) {
		int n;
		int bigger=0;
		int smaller=0;
		int num;
		System.out.println("enter the number:");
		Scanner a=new Scanner (System.in);
		n=a.nextInt();
		for(int i=0;i<n;i++)
		{
			num=a.nextInt();
			if(num>bigger)
			{
				bigger=num;
			}
			System.out.println("the largest among n number is:"+bigger);
		}

	}

}
