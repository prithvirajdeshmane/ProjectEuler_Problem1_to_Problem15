package problem_5_LCM;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		long target = 20;
		long res = 1;
		
		for(long i = 2; i <= target; i++)
		{
			if(i>res)
				res = LCM(i, res);
			else
				res = LCM(res,i);
			//System.out.println(i + " : " + res);
		}
		System.out.println("Final res: " + res);
	}
	
	private static long GCD(long a, long b)
	{
		if(b == 0) return a;
		return GCD(b, a%b);
	}
	
	private static long LCM(long a, long b)
	{
		return ((a*b)/GCD(a, b));
	}

}
