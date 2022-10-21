package ks;

import java.util.Scanner;

public class ks14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string--");
		String s=sc.next();
		int l=s.length();
		char a;
		int i,j;
		//int count=1;
		char c[]=s.toCharArray();
		for(i=0;i<l;i++)
		{
			int count=1;
			//a=s.charAt(i);
			for(j=i+1;j<l;j++)
			{
			if(c[i]==c[j])
			{
				
				count++;
				i=i+1;
				//c[i]='1';
			}
			}
			if(count>1)
			System.out.println(c[i]+"-"+count);
		
		}

	}

}
