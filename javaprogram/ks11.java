package ks;
import java.util.Scanner;
public class ks11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("enter a string:");
		String s=scan.next();
		String r="";
		int i,j;
		int length=s.length();
		char c[]=s.toCharArray();
		for(i=length-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if(s.equals(r))
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.print("not palindrome");
		}
	

	}

}
