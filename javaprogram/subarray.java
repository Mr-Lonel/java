package string;

import java.util.Scanner;

public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in) ;
		int a[]= { 3 , -6  , 7 , -10,  6  ,-8};
		int b[]= new int[a.length];
		int sum=0;
		System.out.print("enter the position - ");
		int index=scan.nextInt();
		int range=scan.nextInt();
		for(int i=index;i<=range;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
//			System.out.println(b[i]);
		}
		System.out.println("sum- "+sum);

	}

}
