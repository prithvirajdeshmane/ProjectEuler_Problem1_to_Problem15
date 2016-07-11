package problem_7_Prime10001st;

public class Prime10001 {

	public static void main(String[] args) {
		int cnt = 2;
		int i= 4;
		while(true)
		{
			if(isPrime(i))
			{
				cnt++;
				if(cnt == 10001)
				{
					System.out.println(i);
					System.exit(0);
				}
			}
			i++;
		}
	}
	
	private static boolean isPrime(int n)
	{
		for(int i = 2; i <= (n+1)/2; i++)
		{
			if(n % i == 0) return false;
		}
		return true;
	}

}
