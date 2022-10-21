package ks;
import java.util.Scanner;
public class ks5 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n,i,j;
		System.out.println("enter the array size:");
		n=scan.nextInt();
		int a[][]= new int [50][50];
		System.out.println("enter the array elements:");
		for(i=1;i<=n;i++)
		{
			System.out.println("enter element for row:"+i);
			for(j=1;j<=n;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("two dimensional array:");
		for(i=1;i<=n;i++)
		{
			System.out.println(" ");
			for(j=1;j<=n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}

	}

}
