package ks;

import java.util.Scanner;

public class ks6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n,i,j;
		System.out.println("enter the array size:");
		n=scan.nextInt();
		int a1[][]= new int [50][50];
		int a2[][]= new int [50][50];
		int a3[][]= new int [50][50];
		System.out.println("enter the matrix 1 elements:");
		for(i=1;i<=n;i++)
		{
			System.out.print("enter element for row:"+i);
			System.out.print(" ");
			for(j=1;j<=n;j++)
			{
				a1[i][j]=scan.nextInt();
			}
		}
		System.out.println("enter the matrix 2 elements:");
		for(i=1;i<=n;i++)
		{
			System.out.print("enter element for row:"+i);
			System.out.print(" ");
			for(j=1;j<=n;j++)
			{
				a2[i][j]=scan.nextInt();
			}
		}
		System.out.print("matrix 1 elements");
		for(i=1;i<=n;i++)
		{
			System.out.println("");
			for(j=1;j<=n;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
		}
		System.out.println(" ");
		System.out.print("matrix 2 elements");
		for(i=1;i<=n;i++)
		{
			System.out.println(" ");
			for(j=1;j<=n;j++)
			{
				System.out.print(a2[i][j]+" ");
			}
		}
		for(i=1;i<=n;i++)    //adding of two matrix
		{
			for(j=1;j<=n;j++)
			{
				a3[i][j]=a1[i][j]+a2[i][j];
			}
		}
		System.out.println("");
		System.out.println("sum of two matrix");
		for(i=1;i<=n;i++)
		{
			System.out.println(" ");
			for(j=1;j<=n;j++)
			{
				System.out.print(a3[i][j]+" ");
			}
		}

	}

}
