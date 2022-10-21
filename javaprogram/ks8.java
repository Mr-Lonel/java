package ks;
import java.util.Scanner;
public class ks8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the string:");
		String s1=scan.next();
		
		//String s1upper=s1.toUpperCase();  
		//System.out.println(s1upper);  
		System.out.println(s1.length());
		if(s1.length()<6)
		{
			System.out.println("invalid");
		}

	}

}
