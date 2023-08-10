package training;

import java.util.Scanner;

public class t3string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s1="hello";
		String s2="welcome";
		System.out.println("enter 0 to print in lowercase");
		System.out.println("enter 1 to print in uppercase");
		int n=scan.nextInt();
		String s3="";
		String s4="";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		char c3[]=s1.toCharArray();
		char c4[]=s2.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(c1[i]==c2[j])
				{
					s3+=c1[i];
					c1[i]='0';
				}
			}
		}
//		for(int i=0;i<s1.length();i++)
//		{
//			System.out.println(c1[i]);
//		}
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(c4[i]==c3[j])
				{
					s4+=c4[i];
					c4[j]='0';
				}
			}
		}
		String s5=s3+s4;
		if(n==0)
		System.out.println(s5.toLowerCase());
		if(n==1)
		System.out.println(s5.toUpperCase());

	}

}
	
