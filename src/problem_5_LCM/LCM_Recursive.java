package problem_5_LCM;

public class LCM_Recursive {

	public static void main(String[] args) {
		
		long[] list = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		long res = ArrayLCM(list);
		System.out.println(res);
	}
	
	private static long ArrayLCM(long[] list)
	{
		if(list[0] == 2)
		{
			return LCM(2,1);
		}
		else
		{
			long b = list[0];
			long[] newList = new long[list.length-1];
			for(int i=1; i<list.length; i++)
			{
				newList[i-1] = list[i];
			}
			return LCM(ArrayLCM(newList), b);
		}
	}
	
	private static long LCM(long a, long b)
	{
		return (a*b/GCD(a,b));
	}
	
	private static long GCD(long a, long b)
	{
		if (b==0) return a;
		return GCD(b, a%b);
	}
}
