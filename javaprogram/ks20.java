package ks;

import java.util.Scanner;

public class ks20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s1[]=new String[100];
		System.out.print("enter the n names :");
		int n=scan.nextInt();
		System.out.println("enter the names");
		for(int i=0;i<n;i++)
		{
			s1[i]=scan.next();	
		}
		String temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(s1[i].compareTo(s1[j])>0)
				{
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
				
		}
		System.out.println("after sorting:");
		for(int i=0;i<n;i++)
		{
				System.out.println(s1[i]);
		}
		

	}

}
