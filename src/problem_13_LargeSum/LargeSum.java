package problem_13_LargeSum;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class LargeSum {
	
	
	public static void main(String[] args) 
	{
		int rows = 100;
		int cols = 50;
		int[][] input = createInput(rows, cols);
		
		//StringBuilder res = new StringBuilder();
		String res = "";
		
//		for (int i = 0; i < rows; i++) {
//			
//			for (int j = 0; j < cols; j++) {
//				System.out.print(input[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int carryOver = 0;
		
		for (int j = cols-1; j >= 0; j--) {
			int sum = 0;
			for (int i = 0; i < rows; i++) {
				sum += input[i][j];
			}
			sum += carryOver;
			int digit = sum%10;
			carryOver = sum/10;
			res = "" + digit + res;
		}
		res = "" + carryOver + res;
		System.out.println(res);
		System.out.println(res.substring(0, 10));
	}

	private static int[][] createInput(int rows, int cols) 
	{
		String filepath = "/Users/pdeshmane/Documents/workspace/ProjectEuler/src/problem_13_LargeSum/input.txt";
		
		int[][] input = new int[rows][cols];
		
		try {
			Scanner sc = new Scanner(Paths.get(filepath));
			
			
			for (int i = 0; i < rows; i++) {
				String line = sc.nextLine();
				for (int j = 0; j < cols; j++) {
					input[i][j] = Integer.parseInt(""+line.charAt(j));
				}
			}
			sc.close();
			return input;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return input;
	}

}
