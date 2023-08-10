package test;

import java.util.Scanner;

public class snakematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr1[][]=new int [r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			if(i%2==0)
			{
			  System.out.print("");
			  for(int j=0;j<c;j++)
			  {
				  System.out.print(" "+arr1[i][j]);
			  }
			}
			else
			{
				for(int j=c-1;j>=0;j--)
				{
					System.out.print(" "+arr1[i][j]);
				}
			}
			
		}
		
		{
			
		}
		
	}

}
