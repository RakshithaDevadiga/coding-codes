package game;

import java.util.Scanner;
public class NQueens 
{
   static void queens(int gs)
   {
	   if(gs<4)
	   {
		   System.out.println("soln not possible");
	   }
	   else
	   {
		   int board[][]=new int[gs][gs];
		   placeQueen(board,0);
		   printBoard(board);
	   }
   }
   
   static boolean isSafe(int board[][],int row,int col)
   {
	   int i,j;
	   //in row
	   for( i=0;i<col;i++)
	   if(board[row][i]==1)	   
	   return false;
	   
	   //left up-diagonal
	   for( i=row-1, j=col-1;i>=0 && j>=0;i--,j--)
	   if(board[i][j]==1)
	   return false;
			   
	   //left down-diagonal
	   for(i=row+1,j=col-1;i<board.length && j>=0;i++,j--)
	   if(board[i][j]==1) 
	   return false;
			   
	   return true;
   }
   
  static boolean placeQueen(int board[][],int col)
   {
	  if(col>=board.length)
		  return true;
	     for(int i=0;i<board.length;i++)
	     {
	    	 if(isSafe(board,i,col))
	    	 {
	    		 board[i][col]=1;
	    		 if(placeQueen(board,col+1))
	    				 return true;
	    		 board[i][col]=0;
	    	 }
	     }
	  
	  return false;
   }
 static void printBoard(int board[][])
  {
	 for(int row=0;row<board.length;row++)
	 {
		 for(int col=0;col<board.length;col++)
		 {
			 if(board[row][col]==1)
				 System.out.print(" Q ");
			 else
				 System.out.print(" _ ");
		 }
		 System.out.println();
	 }
  }
  
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number of queens: ");
		int q=scn.nextInt();
		scn.close();
		queens(q);
	}

}
