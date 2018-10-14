import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int c,n;
		System.out.println("enter a number:");
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		System.out.println("multiplication table of:"+n);
		for(c=1;c<10;c++)
		{
			System.out.println(n+"*"+c+"="+(n*c));
		}

	}

}
