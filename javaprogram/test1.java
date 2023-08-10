package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		int i;
		char c;
		for(i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			int a;
			a=c;
			if(a%2==0)
			{
				System.out.println("asskey value:"+" "+ a+" "+"prime are:"+c);
			}
			else
			{
				System.out.println("asskey value:"+" "+ a+" "+"not prime:"+c);
			}
//			System.out.println(a);
		}
	}

}
