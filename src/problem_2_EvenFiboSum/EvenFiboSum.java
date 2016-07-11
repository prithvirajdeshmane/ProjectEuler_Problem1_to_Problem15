package problem_2_EvenFiboSum;

public class EvenFiboSum {

	public static void main(String[] args) {
	
		double target = 4000000;
		double k = 0, sum = 2, i=1, j=2;
		
		while(true)
		{
			k = 0;
			k = i + j;
			if (k >= target) break; 
			if(k%2 == 0) sum += k;
			i = j;
			j = k;
		}
		
		
//		while(k<target)
//		{
//			k = i+j;
//			System.out.print(k + " ");
//			i=j;j=k;
//		}
		
		System.out.println(sum);
		
	}
	
	

}
