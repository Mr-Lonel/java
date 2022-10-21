package ks;
import java.util.Scanner;
public class ks12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=scan.next();
		char s1[]= new char[50];
		char c;
		char c1[]=s.toCharArray();
		int l=s.length();
		int i,j;
		System.out.print("string after removing repeating char:");
		for(i=0;i<l;i++)
		{
			//c=s.charAt(i);
			int count=1;
			for(j=i+1;j<l;j++)
			{
				if(c1[i]==c1[j])
				{				
					count++;	
					i=i+1;
				}
			}
			if(count<=1)
			{
			System.out.print(c1[i]);
			}
		}

	}

}
