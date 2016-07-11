package problem_6_SumSqrDiff;

public class SumSqrDiff {

	public static void main(String[] args) {
		
//		long sumOfSquares = 0;
//		long squareOfSums = 0;
//		long sum = 0;
//		
//		for(int i = 1; i<= 100; i++)
//		{
//			sumOfSquares += i*i;
//			sum += i;
//		}
//		
//		squareOfSums = sum * sum;
		
		int n = 100;
		long sumOfSquares = n*(n+1)*(2*n + 1)/6;
		long sum = n*(n+1)/2;
		long squareOfSums = sum * sum;
		
		
		System.out.println(squareOfSums - sumOfSquares);
		
	}

}
