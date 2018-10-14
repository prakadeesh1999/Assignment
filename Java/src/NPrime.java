
public class NPrime {

	public static void main(String[] args) {
		int i,number,count;
		System.out.println("print the prime numbers from 2 to 100:");
		for(number=2;number<=100;number++)
		{
			count=0;
			for(i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && number !=1)
			{
				System.out.println(number+"");
			}
			
		}
		

	}

}


