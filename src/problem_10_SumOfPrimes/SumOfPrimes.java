package problem_10_SumOfPrimes;

public class SumOfPrimes {

	public static void main(String[] args) {
		int target = 2000000;
		int cnt = 2; //for 2 and 3
		long sum = 5; //for 2+3
		
		for(int i = 4; i < target; i++)
		{
			System.out.println("Processing " + i);
			if(isPrime(i))
			{
				cnt++;
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	private static boolean isPrime(int n)
	{
		for(int i = 2; i <= (n+1)/2; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		
		return true;
	}

}
