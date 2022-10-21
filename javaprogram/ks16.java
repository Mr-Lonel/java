package ks;
import java.util.Scanner;
public class ks16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the string:");
		String s="kalifa ";//scan.nextLine();
		int count=0;
		String num="";
		int l=s.length();
		int l2=num.length();
		//char c[]=new char[l];
		char c;
		for(int i=0;i<l;i++)
		{
			
		    c=s.charAt(i);
		   int w=c;
			if(c==' ')
			{
				count+=1;
				
			}
			else
			if(w>=48&&w<=57)
			{		
			 num+=c;
			}
		}
//		System.out.println(count);
//		System.out.println(l2);
//		System.out.println(c);

		if(l>=5&&15>=l)
		{
		if(l2==0)
		{
			if(count==0)
			{
				System.out.println("valid string");
			}
			else
			{
			System.out.println("not valid");
			}
		}
		else {
			System.out.print("not valis");
		}
		}
		else {
			System.out.print("not valid:");

		}
		

	}

}
