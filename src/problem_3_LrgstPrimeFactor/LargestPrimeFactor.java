package problem_3_LrgstPrimeFactor;

import java.util.HashSet;

public class LargestPrimeFactor {

	public static void main(String[] args) {

		 double target = 600851475143d;
		 double tempQuotient = target;
		 
		 HashSet<Double> primeFactors = new HashSet<Double>();
		 
		 for(double i=2; i<=tempQuotient ; i++)
		 {
			 if(tempQuotient%i == 0)
			 {
				 primeFactors.add(i);
				 tempQuotient /= i;
				 i--;
			 }
		 }
		 
		 System.out.println(primeFactors);
		 
		 double maxFactor = 1;
		 for(double factor : primeFactors)
		 {
			 if(factor > maxFactor) maxFactor = factor;
		 }
		 
		 System.out.println(maxFactor);
	}

}
