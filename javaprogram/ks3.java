package ks;
import java.util.Scanner;
public class ks3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n,i=0;
		int b[]=new int[100];
		System.out.println("enter the decimal value:");
		n=scan.nextInt();
		while(n>0)
		{
			b[i]=n%2;
			n=n/2;
			i++;
		}
		System.out.println("binary value of "+n);
		for(i=i-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}

	}

}
