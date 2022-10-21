package ks;
import java.util.Scanner;

import java.util.ArrayList;
public class ks4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a[]=new int[50];
		int i;
		System.out.println("enter the array size:");
		int n=scan.nextInt();
		System.out.println("enter the array elements:");
		for(i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("array values:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				a[i]+=-a[i]*2;
			}
		}	
		System.out.println("positive numbers:");
		for(i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}

	}

}
