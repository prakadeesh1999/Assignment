
public class Factors {
	static int countfact(int low,int high)
	{
		int fact=1,x=1;
		while(fact<low)
		{
			fact=fact*x;
			x++;
		}
		int res=0;
		while(fact<=high)
		{
			res++;
			fact=fact*x;
			x++;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(countfact(2,720));
		

	}

}
