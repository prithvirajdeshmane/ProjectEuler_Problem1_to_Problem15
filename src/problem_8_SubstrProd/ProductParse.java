package problem_8_SubstrProd;

public class ProductParse {

	public static void main(String[] args) {
		
		StringBuilder input = createInput();
		int limit = input.length();
		int digits = 13;
		long highestProduct = 1;
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i <= limit-digits; i++)
		{
			long tempProduct = 1;
			String tempStr = input.substring(i, i+digits);
			
			for(int k = 0; k < digits; k++)
			{
				int n = Integer.parseInt("" + tempStr.charAt(k));
				if(n == 0) 
					break;
				tempProduct *= n;
			}
			if(tempProduct > highestProduct)
				highestProduct = tempProduct;
		}
		
		System.out.println(highestProduct);
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+ (endTime - startTime) + " ms");
		
	}
	
	private static StringBuilder createInput() {
		StringBuilder input = new StringBuilder();
		input.append("73167176531330624919225119674426574742355349194934");
		input.append("96983520312774506326239578318016984801869478851843");
		input.append("85861560789112949495459501737958331952853208805511");
		input.append("12540698747158523863050715693290963295227443043557");
		input.append("66896648950445244523161731856403098711121722383113");
		input.append("62229893423380308135336276614282806444486645238749");
		input.append("30358907296290491560440772390713810515859307960866");
		input.append("70172427121883998797908792274921901699720888093776");
		input.append("65727333001053367881220235421809751254540594752243");
		input.append("52584907711670556013604839586446706324415722155397");
		input.append("53697817977846174064955149290862569321978468622482");
		input.append("83972241375657056057490261407972968652414535100474");
		input.append("82166370484403199890008895243450658541227588666881");
		input.append("16427171479924442928230863465674813919123162824586");
		input.append("17866458359124566529476545682848912883142607690042");
		input.append("24219022671055626321111109370544217506941658960408");
		input.append("07198403850962455444362981230987879927244284909188");
		input.append("84580156166097919133875499200524063689912560717606");
		input.append("05886116467109405077541002256983155200055935729725");
		input.append("71636269561882670428252483600823257530420752963450");
		return input;
	}

}
