package ks;

import java.util.Scanner;

public class ks15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1--");
		String s1=sc.next();
		System.out.println("enter the string2--");
		String s2=sc.next();
		int i,j;
		int l1=s1.length();
		int l2=s2.length();
		char x,z;
		String res="pass";
		for(i=0;i<l1;i++)
		{
			x=s1.charAt(i);
			for(j=0;j<l2;j++)
			{
				z=s2.charAt(j);
				if(x==z)
				{
					res="pass";
				}
				else {
					res="fail";
				}

			}
			
		}
		if(res=="pass")
		{
			System.out.println("anagram");
		}


	}

}
