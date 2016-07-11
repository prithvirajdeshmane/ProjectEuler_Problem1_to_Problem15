package problem_12_500Factors;

public class FactorsOptimized {

	public static void main(String[] args) {
		
		int i = 1;
		int num = 0;
		while(true)
		{
			num += i;
			
			//System.out.println("\nNext triangular number: " + num);
			
			int n = getNumberOfFactors(num);
			
			//System.out.print("\tNumber of factors: " + n);
			
			if(n >= 500)
			{
				System.out.println("Answer : " + num);
				return;
			}
			i++;
		}
		
	}

	private static int getNumberOfFactors(int num) {
		
		int cnt = 0;
		
		for (int n = 1; n < (Math.sqrt(num)); n++) {
			if(num % n == 0)
			{
				if (num/n == n) cnt++;
				else cnt += 2;
			}
		}
		
		return cnt;
	}

}
