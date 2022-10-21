package ks;

import java.util.Scanner;

public class ks26 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		char c[]=s1.toCharArray();
		char ch[]=new char[s1.length()];
//		char c1[]=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			int count=0;
			ch[i]=s1.charAt(i);
			for(int j=0;j<s1.length();j++)
			{
				if(ch[i]==c[j])
				{
					count+=1;
					
				}
			}
			System.out.println("c[i]"+c[i]+" "+count);
		}
	scan.close();
	}

}
