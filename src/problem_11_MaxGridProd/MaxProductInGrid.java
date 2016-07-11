package problem_11_MaxGridProd;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MaxProductInGrid {

	public static void main(String[] args)
	{
		int dimensions = 20;
		int[][] grid = createInputGrid(dimensions);
		//displayGrid(grid, dimensions);
		int highestProduct = 1;
		
		//Horizontal
		for (int i = 0; i < dimensions; i++) 
		{
			for(int j = 0; j <= (dimensions - 4); j++) 
			{
				
				int tempProduct = grid[i][j] * grid[i][j+1] * grid [i][j+2] * grid[i][j+3];
				if(tempProduct > highestProduct)
				{
					highestProduct = tempProduct;
				}
			}
		}
		
		//Vertical
		for (int j = 0; j < dimensions; j++) 
		{
			for(int i = 0; i <= (dimensions - 4); i++) 
			{
				
				int tempProduct = grid[i][j] * grid[i+1][j] * grid [i+2][j] * grid[i+3][j];
				if(tempProduct > highestProduct)
				{
					highestProduct = tempProduct;
				}
			}
		}
		
		//Diagonal
		for (int i = 0; i <= (dimensions - 4); i++) 
		{
			for(int j = 0; j <= (dimensions - 4); j++) 
			{
				
				int tempProduct = grid[i][j] * grid[i+1][j+1] * grid [i+2][j+2] * grid[i+3][j+3];
				if(tempProduct > highestProduct)
				{
					highestProduct = tempProduct;
				}
			}
		}
		
		for (int i = 0; i <= (dimensions - 4); i++) 
		{
			for(int j = (dimensions-1); j >= (4-1); j--) 
			{
				
				int tempProduct = grid[i][j] * grid[i+1][j-1] * grid [i+2][j-2] * grid[i+3][j-3];
				if(tempProduct > highestProduct)
				{
					highestProduct = tempProduct;
				}
			}
		}
		System.out.println(highestProduct);
		
	}

	private static int[][] createInputGrid(int dimensions)
	{
		int[][] grid = new int[dimensions][dimensions];
		try 
		{
			Path filePath = Paths.get("/Users/pdeshmane/Documents/workspace/ProjectEuler/src/problem_11_MaxGridProd/inputGrid.txt");
			Scanner sc = new Scanner(filePath);

			for(int i = 0; i < dimensions; i++) 
			{
				String line = sc.nextLine();
				//System.out.println(line);
				String[] res = line.split("\\s+");
				
				if(res.length != dimensions)
				{
					System.out.println("Error in input. Exiting.");
					System.exit(1);
				}
				
				for(int j = 0; j < dimensions; j++)
				{
					grid[i][j] = Integer.parseInt(res[j]);
				}
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return grid;
	}

	private static void displayGrid(int[][] grid, int dimensions) {
		for (int i = 0; i < dimensions; i++) {
			System.out.println();
			for (int j = 0; j < dimensions; j++) {
				System.out.print(grid[i][j] + "\t");
			}
		}
	}

}
