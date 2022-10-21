package ks;

import java.util.Scanner;

public class ks19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string:");
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		int l=s1.length();
		String num="";
		String ab="";
		char c;
		int i;
		for(i=0;i<l;i++)
		{
			c=s1.charAt(i);
					int a=c;
					if(c>=48&&c<=57)
					{
					
					num+=c;
					}			
		}
		int nl=num.length();

		int a[]=new int[nl];
		char c1;
		if(nl==0)
		{
			System.out.println("the is no number in string:"+s1);
		}
		else
		{
		for(i=0;i<nl;i++)
		{
			c1=num.charAt(i);
			a[i]=a[i]+c1;
		}

		int t[]=new int[nl];
		for(i=0;i<nl;i++)
		{
			 t[i]=(a[i]-47)-1;
		}
	
		int sum1=0;
		for(i=0;i<nl;i++)
		{
			sum1+=t[i];
		}
		System.out.print("sum of digits in string:"+sum1);
		}


	}

}
