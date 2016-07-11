package problem_12_500Factors;

import java.util.HashSet;

public class FactorsOfTriangularNumbers {

	public static void main(String[] args) {

		int target = 500;
		int i = 1;
		long num = 0;
		while(true)
		{
			num += i;
			System.out.println("\nNext triangular number: " + num);
			int n = getFactorCount(num);
			System.out.print("\tNumber of factors: " + n);
			if(n > target)
			{
				System.out.println("\n\nTHE ANSWER IS: " + num);
				return;
			}
			i++;
		}
		
	}
	
	private static int getFactorCount(long n)
	{
		HashSet<Long> factors = findFactors(n);
		return factors.size();
	}
	
	private static HashSet<Long> findFactors(long n)
	{
		HashSet<Long> factors = new HashSet<Long>();
		
		for(long i=1; i <= n; i++)
		{
			if(n%i == 0)
			{
				factors.add(i);
			}
		}
		
		return factors;
	}

}
