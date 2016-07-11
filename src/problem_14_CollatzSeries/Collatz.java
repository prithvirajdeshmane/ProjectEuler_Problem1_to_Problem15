package problem_14_CollatzSeries;

public class Collatz {
	
	public static void main(String[] args) {
		
		long currentCount = 0;
		long maxCount = 0;
		long maxSequenceForNumber = 0;
		for(long i = 1; i < 1000000; i++)
		//for(int i = 1; i <=25; i++)
		{
			currentCount = 0;
			long n = i;
			//System.out.println();
			while(true)
			{
				
				if(n==1) 
				{
					currentCount++;
					//System.out.print("1");
					break;
				}
				else
				{
					currentCount++;
					//System.out.print(n + " -> ");
					if(n%2 == 0)
					{
						n = n/2;
					}
					else {
						n = 3*n + 1;
					}
				}
			}
			if(currentCount > maxCount)
			{
				maxCount = currentCount;
				maxSequenceForNumber = i;
			}
		}
		System.out.println("\n" + maxSequenceForNumber + " : " +maxCount);
		
	}
	

}
