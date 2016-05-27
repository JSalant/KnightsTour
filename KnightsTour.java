//=====================================================================
// Program to recursively solve Knights Tour using Warnsdorff method
// in Java
// CS280-101 Prof. Kapleau
// Project 1
// author: Jeremy Salant
// created:  9/12/2012
//=====================================================================

public class KnightsTour
{
	public static void main(String args[])
	{
		for(int i = 0; i < 8; ++i)
		{
			for(int j = 0; j < 8; ++j)
			{
				int moves = 1;
				int row = 0;
				int col = 0; 
				int[][] warnsdorffBoard = { {2,3,4,4,4,4,3,2},
											{3,4,6,6,6,6,4,3},
											{4,6,8,8,8,8,6,4},
											{4,6,8,8,8,8,6,4},
											{4,6,8,8,8,8,6,4},
											{4,6,8,8,8,8,6,4},
											{3,4,6,6,6,6,4,3},
											{2,3,4,4,4,4,3,2} };
				int[][] solutionBoard = { {0,0,0,0,0,0,0,0},
										  {0,0,0,0,0,0,0,0},
										  {0,0,0,0,0,0,0,0},
										  {0,0,0,0,0,0,0,0},
										  {0,0,0,0,0,0,0,0},
										  {0,0,0,0,0,0,0,0},
										  {0,0,0,0,0,0,0,0},
										  {0,0,0,0,0,0,0,0} };

		//solutionBoard[row][col] = 1;

		
				solutionBoard[i][j] = 1;
				System.out.println(i+", "+j);
				knightsTour(warnsdorffBoard, solutionBoard, i, j, moves);
			}
		}

		//knightsTour(warnsdorffBoard, solutionBoard, row, col, moves);

		System.out.println("\nEnd of program");
	}

	public static void knightsTour (int[][] wb, int[][] sb, int r, int c, int m)
	{
		boolean moveCheck = false;
		int nmX = 0;
		int nmY = 0;
		int or = r;
		int oc = c;

/*1*/	if (((r + 1) <= 7) && ((c - 2) >= 0)) //check to see if move is in bounds
		{
			if (sb[r + 1][c - 2] == 0) //check to see if position has already been moved to
			{
				if(moveCheck == false) //check if first candidate for next move
				{	
					moveCheck = true;
					nmX = r + 1;				
					nmY = c - 2;
			    }
			    else if (wb[r + 1][c - 2] < wb[nmX][nmY]) // if not first candidate, check if this position has fewer moves
			    {
			    	nmX = r + 1;
			    	nmY = c - 2;
			    }
			}
		}

/*2*/	if (((r + 2) <= 7) && ((c - 1) >= 0))
		{
			if (sb[r + 2][c - 1] == 0)
			{
				if(moveCheck == false)
				{	
					moveCheck = true;
					nmX = r + 2;				
					nmY = c - 1;
			    }
			    else if (wb[r + 2][c - 1] < wb[nmX][nmY])
			    {
			    	nmX = r + 2;
			    	nmY = c - 1;
			    }
			}
		}

/*3*/	if (((r + 2) <= 7) && ((c + 1) <= 7))
		{
			if (sb[r + 2][c + 1] == 0)
			{
				if(moveCheck == false)
				{	
					moveCheck = true;
					nmX = r + 2;				
					nmY = c + 1;
			    }
			    else if (wb[r + 2][c + 1] < wb[nmX][nmY])
			    {
			    	nmX = r + 2;
			    	nmY = c + 1;
			    }
			}
		}

/*4*/	if (((r + 1) <= 7) && ((c + 2) <= 7))
		{
			if (sb[r + 1][c + 2] == 0)
			{
				if(moveCheck == false)
				{	
					moveCheck = true;
					nmX = r + 1;				
					nmY = c + 2;
			    }
			    else if (wb[r + 1][c + 2] < wb[nmX][nmY])
			    {
			    	nmX = r + 1;
			    	nmY = c + 2;
			    }
			}
		}

/*5*/	if (((r - 1) >= 0) && ((c + 2) <= 7))
		{
			if (sb[r - 1][c + 2] == 0)
			{
				if(moveCheck == false)
				{	
					moveCheck = true;
					nmX = r - 1;				
					nmY = c + 2;
			    }
			    else if (wb[r - 1][c + 2] < wb[nmX][nmY])
			    {
			    	nmX = r - 1;
			    	nmY = c + 2;
			    }
			}
		}

/*6*/	if (((r - 2) >= 0) && ((c + 1) <= 7))
		{
			if (sb[r - 2][c + 1] == 0)
			{
				if(moveCheck == false)
				{	
					moveCheck = true;
					nmX = r - 2;				
					nmY = c + 1;
			    }
			    else if (wb[r - 2][c + 1] < wb[nmX][nmY])
			    {
			    	nmX = r - 2;
			    	nmY = c + 1;
			    }
			}
		}

/*7*/	if (((r - 2) >= 0) && ((c - 1) >= 0))
		{
			if (sb[r - 2][c - 1] == 0)
			{
				if(moveCheck == false)
				{	
					moveCheck = true;
					nmX = r - 2;				
					nmY = c - 1;
			    }
			    else if (wb[r - 2][c - 1] < wb[nmX][nmY])
			    {
			    	nmX = r - 2;
			    	nmY = c - 1;
			    }
			}
		}

/*8*/	if (((r - 1) >= 0) && ((c - 2) >= 0))
		{
			if (sb[r - 1][c - 2] == 0)
			{
				if(moveCheck == false)
				{	
					moveCheck = true;
					nmX = r - 1;				
					nmY = c - 2;
			    }
			    else if (wb[r - 1][c - 2] < wb[nmX][nmY])
			    {
			    	nmX = r - 1;
			    	nmY = c - 2;
			    }
			}
		}

		// check if a successful move was found, and if not finished, update boards
		if ((moveCheck == true) && (m != 64))
		{
			++m;

			r = nmX;
			c = nmY;
			sb[r][c] = m;

			// if a successful move is found, update the Warnsdorff Board for the new position
/*wb1*/		if (((r + 1) <= 7) && ((c - 2) >= 0))
			{
				--wb[r + 1][c - 2];
			}

/*wb2*/		if (((r + 2) <= 7) && ((c - 1) >= 0))
			{
				--wb[r + 2][c - 1];
			}

/*wb3*/		if (((r +2 ) <= 7) && ((c + 1) <= 7))
			{
				--wb[r + 2][c + 1];
			}

/*wb4*/		if (((r + 1) <= 7) && ((c + 2) <= 0))
			{
				--wb[r + 1][c + 2];
			}

/*wb5*/		if (((r - 1) >= 0) && ((c + 2) <= 7))
			{
				--wb[r - 1][c + 2];
			}

/*wb6*/		if (((r - 2) >= 0) && ((c + 1) <= 7))
			{
				--wb[r - 2][c + 1];
			}

/*wb7*/		if (((r - 2) >= 0) && ((c - 1) >= 0))
			{
				--wb[r - 2][c - 1];
			}

/*wb8*/		if (((r - 1) >= 0) && ((c - 2) >= 0))
			{
				--wb[r - 1][c - 2];
			}
			//after move is made, if program did not find a solution, call it again to make next move
			if (m != 64)
			{
				knightsTour(wb, sb, r, c, m);
			}
			//after move is made, if program is finished print the results
			else if (m == 64)
			{
				System.out.println("\nSolution found\n");

				for (int x = 0; x < 8; x++)
				{
					for (int y = 0; y < 8; y++)
					{
						if (y == 7)
						{
							System.out.println(sb[x][y]);
						}
						else if (sb[x][y] < 10)
						{
							System.out.print(sb[x][y] + "  ");
						}
						else if (sb[x][y] >= 10)
						{
							System.out.print(sb[x][y] + " ");
						}
					}
				}

				return;
			}
		}
		//if there are no possible moves that have not been checked, exit program after alerting user
		else if (moveCheck == false)
		{
			System.out.println("\nNo solution, program failed at move"+m);
			return;
		}
	}
}
