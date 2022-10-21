package ks;

import java.util.Scanner;

public class ks21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s1[]=new String[100];
		String s[]=new String[100];
		String s3[]=new String[100];
		String s2[]=new String[100];
		int i,j;
		
		for(i=0;i<n;i++)
		{
			s1[i]=scan.next();
		}
		for(i=0;i<n;i++)
		{
			System.out.println(s1[i]);
		}
		char ch[]=new char[50];
		char ch1[]=new char[50];
		for(i=0;i<n;i++)
		{
			int l=s1[i].length();
			ch[i]=s1[i].charAt(0);
		    ch1[i]=s1[i].charAt(l-1);

		}
		for(i=0;i<n;i++)
		{
			s[i]=String.valueOf(ch[i]);
			s3[i]=String.valueOf(ch1[i]);
			s2[i]=s[i]+s3[i];
			System.out.println(s2[i]);
		}
	
	}

}
