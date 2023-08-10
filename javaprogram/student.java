package test;

import java.util.Scanner;

public class student {
//	int a;
//	int b;

	public int sum(int x,int y)
	{
//		a=x;
//		b=y;
//		int c=a+b;
		
		int c=x+y;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a,b;
		a=scan.nextInt();
		b=scan.nextInt();
		student s=new student();
		s.sum(a,b);
		
		

	}

}
