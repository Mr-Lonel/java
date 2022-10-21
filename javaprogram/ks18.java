package ks;

import java.util.Scanner;

public class ks18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int a[]=new int[25];
		System.out.print("enter the array size:");
		int n=scan.nextInt();
		System.out.print("enter the target:");
		int t=scan.nextInt();
		int i,j,sum=0;
		System.out.print("enter the array elements:");

		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n+1;j++)
			{
			  sum=a[i]+a[j];
			
			if(sum==t)
			{
				System.out.println("index"+i+"="+a[i]+" "+"index"+j+"="+a[j]+" "+"->"+"sum"+"="+sum);
			}
			}
		}
		
	}

}
