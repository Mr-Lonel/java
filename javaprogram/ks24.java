package ks;

import java.util.Scanner;

public class ks24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan=new Scanner(System.in);
	    System.out.println("enter the string:");
		String s1=scan.next();
		String s2="";
		char c;
		char ch=s1.charAt(0);
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			if(ch==c)
			{
				s2+=c;
			}
		}
		if(s1.length()==s2.length())
		{
			System.out.println("the string is same:"+" "+s2);
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");		
		}

	}

}
