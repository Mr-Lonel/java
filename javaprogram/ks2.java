package ks;
import java.util.Scanner;
public class ks2 {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int rem=0;
		System.out.println("enter the value for n1:");
		int n1= scan.nextInt();
		System.out.println("enter the value for n2:");
		int n2=scan.nextInt();
		System.out.println("enter the value for n3:");
		int n3=scan.nextInt();
		System.out.println("enter the value for n4:");
		int n4=scan.nextInt();
		
		if(n4==0)
		{
			rem=n1%10+n2%10+n3%10;
			System.out.println("sum of last three numbers:");
			System.out.println(rem);
		}
		else
		{
			if(n4==1)
			{
				n1=n1/10;
				n2=n2/10;
				n3=n3/10;
				rem=n1%10+n2%10+n3%10;
				System.out.println("sum of middle three numbers:");
				System.out.println(rem);
			}
			else
			{
				if(n4==2)			
			{
					n1=n1/100;
					n2=n2/100;
					n3=n3/100;
				rem=n1%10+n2%10+n3%10;
				
				System.out.println("sum of first three numbers:");
				System.out.println(rem);
			}
		}

	}

}
}
