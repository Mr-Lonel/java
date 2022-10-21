package ks;
//reverse the string line
import java.util.Scanner;

public class ks25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
 		String s1=scan.nextLine();
 		String s2="";
 		String[] s3=s2.split(" ");
 		char c[]=s1.toCharArray();
 		for(int i=c.length-1;i>=0;i--)
 		{
 			if(c[i]!=' ')
 				
 			s2+=c[i];
 		}
 			
 		System.out.println(s2);	
 		

	}

}
