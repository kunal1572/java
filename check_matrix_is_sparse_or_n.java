// import java.util.*;
// // WAP to check weather a matrix is a sparse matrix or not 
//  public class check_matrix_is_sparse_or_not{
// 	 public static void main (String[] args) {
// 		 Scanner sc= new Scanner (System.in);
// 		 System.out.println("enter the no. of rows of the matrix");
// 		 	int row=sc.nextInt();
// 		 System.out.println("enter the no of column of the matrix");
// 		 	int col=sc.nextInt();
// 		 	int[][] arr= new int[row][col];
// 		 	boolean flag=true;
// 		 System.out.println("enter the elements of the matrix here");
// 		 	for(int i=0;i<row;i++)
// 		 	{
// 		 		for(int j=0;j<col;j++)
// 		 		{
// 		 			arr[i][j]=sc.nextInt();
// 		 		}
// 		 	}
// // checking weather the matrix is a sparse matrix or not
// 		 	for(int i=0;i<row;i++)
// 		 	{
// 		 		for(int j=0;j<col;j++)
// 		 		{
// 		 			if(i==j && arr[i][j]==0)
// 		 			{
// 		 				flag=false;
// 		 				break;
// 		 			}
// 		 		else if(i!=j && arr[i][j]!=0)
// 		 			{
// 		 				flag=false;
// 		 				break;
// 		 			}
// 		 		}
// 		 	}
// 		 if(flag) 
// 		 {
// 			 System.out.println("the entered matrix is a sparse matrix");
// 		 }
// 		 else
// 		 {
// 			 System.out.println("the entered matrix is NOT a sparse matrix");
// 		 }
// 		 	for(int i=0;i<row;i++)
// 		 	{
// 		 		for(int j=0;j<col;j++)
// 		 		{
// 		 			System.out.print(arr[i][j]+" ");
// 		 		}
// 		 			System.out.println(" ");
// 		 	}
// 	 }
//  }