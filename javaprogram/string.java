package demo;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string--");
		String s=sc.next();
		int l=s.length();
		String upp="",low="",num="",sym="";
		char c;
		char d[]=s.toCharArray();
		//upper------
		for (int i = 0; i < l; i++) {
			c=s.charAt(i);
			int a=c;
			if(a>=65&&a<=90) {
				upp=upp+c;
			}
			else if(c>=97&&c<=122) {
				low+=c;
			}
			else if(c>=48&&c<=57) {
				num+=c;
			}
			else
				sym+=c;
		}
		
//		System.out.println(upp);
//		System.out.println(low);
//		System.out.println(num);
//		System.out.println(sym);
	for(char x:d) {
		System.out.println(x);}
	}
}
