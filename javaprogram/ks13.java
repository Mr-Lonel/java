package ks;

import java.util.Scanner;

public class ks13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string--");
		String s=sc.next();
		int l=s.length();
		String num="";
		char c;
		//upper------
		System.out.println("after removing char:");
		for (int i = 0; i < l; i++) {
			c=s.charAt(i);
			int a=c;
			 if(c>=48&&c<=57) {				 		
				num+=c;			
			}					
		}
		System.out.print(num);
	}

}
