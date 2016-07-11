package problem_15_LatticePaths;

public class LatticePaths {

	static int rows = 20, cols = 20;
	static long[][] pathCounts = new long[rows+1][cols+1];

	public static void main(String[] args) {

		createDump();
		long cntPaths = findPaths(0,0);
		
		System.out.println(cntPaths);

	}

	private static long findPaths(int i, int j)
	{
		if(i == rows || j == cols) 
		{
			pathCounts[i][j] = 1;
			return 1;
		}
		
		if(pathCounts[i][j+1] != -1 && pathCounts[i+1][j] != -1)
		{
			pathCounts[i][j] = pathCounts[i][j+1] + pathCounts[i+1][j];
		}
		else 
		{
			if(pathCounts[i][j+1] == -1 && pathCounts[i+1][j] == -1)
			{
				pathCounts[i][j] = (findPaths(i, j+1) + findPaths(i+1, j));
			}
			else
			{
				if(pathCounts[i+1][j] == -1)
				{
					pathCounts[i][j] = pathCounts[i][j+1] + findPaths(i+1, j); 
				}
				else
				{
					pathCounts[i][j] = findPaths(i, j+1) + pathCounts[i+1][j];
				}
					
			}
		}
		return pathCounts[i][j];
	}
	
	private static void createDump()
	{
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= cols; j++) {
				pathCounts[i][j] = -1;
				}
		}
		pathCounts[rows][cols] = 0;
	}
}

