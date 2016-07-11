package problem_9_PythgTriplets;

public class PythagoreanTriplets {
	public static void main(String[] args) {
		int n = 1000;
		long startTime = System.currentTimeMillis();
		
		for(int a = 1; a <= n-2; a++)
		{
			for(int b=a+1; b<=n-1; b++)
			{
				for (int c=b+1; c<=n; c++)
				{
					if(c*c == a*a + b*b)
					{
						int sum = a + b + c;
						
						//This takes about 4ms
						if(n%sum == 0)
						{
							int mult = n/sum;
							a *= mult;
							b *= mult;
							c *= mult;
							System.out.println(a + " " + b + " " + c);
							long prod = a*(b*c);
							System.out.println(prod);
							displayTimeTaken(startTime);
							return;
						}
						
						//The following if loop takes about 45ms
//						if(a+b+c == n)
//						{
//							System.out.println(a + " " + b + " " + c);
//							long prod = a*(b*c);
//							System.out.println(prod);
//							displayTimeTaken(startTime);
//							return;
//						}
					}
				}
			}
		}
		
	}

	private static void displayTimeTaken(long startTime) {
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: " + (endTime - startTime) + " ms");
	}
}
