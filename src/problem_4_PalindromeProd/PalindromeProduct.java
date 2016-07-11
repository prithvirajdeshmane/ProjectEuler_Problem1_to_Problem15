package problem_4_PalindromeProd;

import java.util.TreeSet;

public class PalindromeProduct {

	public static void main(String[] args) {
		TreeSet<Long> resultSet = new TreeSet<Long>();
		for(long i = 999; i > 99; i--)
		{
			for (long j = 999; j > 99; j--)
			{
				long res = i * j;
				if(palindromeCheck(res))
				{
					resultSet.add(res);
				}
			}
		}

		System.out.println(resultSet.last());
	}

	private static boolean palindromeCheck(long n)
	{
		long num = n;
		long rev = 0;

		while (num > 0)
		{
			long digit = num % 10;
			rev = (rev * 10) + digit;
			num = num/10;
		}

		if (rev == n) return true;

		return false;
	}

}
