import java.util.*;
//WAP to check weather a matrix is a identity matrix or not.
 class identity{
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no. of rows of the matrix");
			int row = sc.nextInt();
		System.out.println("enter the no. of column of the matrix");
			int col = sc.nextInt();
			int[][] arr = new int[row][col];
			boolean flag=true;
		System.out.println("enter the elements of the matrix ");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}
//checking weather the given matrix is identity matrix or not
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(i==j && arr[i][j]!=1)
					{
						flag=false;
						break;
					}
					else if(i!=j && arr[i][j]!=0)
					{
						flag =false;
						break;
					}
				}
			}
			
		if(flag)
			{
				System.out.println("The matrix you have entered is an identity matrix");
			}
		else
			{
				System.out.println("The matrix you have entered is NOT an identity matrix");
			}
	}
}