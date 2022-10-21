package ks;

import java.util.Scanner;

public class ks22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string :");
		String s1=scan.next();
		String s2="";
		char c;
		System.out.print("enter the key:");
		char n= scan.next().charAt(0);
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			if(c==n)
			{
				c='*';
			}
			s2+=c;
		}
		System.out.println(s2);
				

	}

}
