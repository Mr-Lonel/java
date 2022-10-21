package demo;
import java.util.Scanner;
public class dm3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string--");
		String s=sc.next();
		int l=s.length();
		char b=s.charAt(0);
		int b1=b;
		char c=s.charAt(l-1);
		char d[]=s.toCharArray();
				
		String upp="",low="",num="",sym="";
		char w;
		//upper------
		for (int i = 0; i < l; i++) {
			w=s.charAt(i);
			int a=w;
			if(a>=65&&a<=90) {
				upp=upp+w;
			}
			else if(w>=97&&w<=122) {
				low+=w;
			}
			else if(w>=48&&w<=57) {
				num+=w;
			}
			else if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')') {
				sym+=w;
			}
		}
		int l1=upp.length();
		int l2=low.length();
		int l3=num.length();
		int l4=sym.length();
		
		String res="pass";
	
		if(l>=8&&l<=28) {
		if(b1>=65&&b1<=90) {
			if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'){
				if(l1>=1) {
					if(l2>=2) {
						if(l3>=2) {
							if(l4>=1) {
								for (int j = 0; j < s.length()-2; j++) {
									
									if(d[j]!=d[j+1]&&d[j]!=d[j+2])
									{
										res="pass";
									}else {
										res="fail";
										break;	
									}
								}
							}
							else {
								res="fail";		
							}
						}
						else {
							res="fail";
						}
							}
					else {
						res="fail";		
					}
				}
				else {
					res="fail";					
				}
			}
			else {
				res="fail";	
			}
		}
		else {
			res="fail";
		}
		}
		else {
			res="fail";
		}
		if(res=="pass") {
			System.out.println("valid");
		}
		else
			System.out.println("notvalid");
		sc.close();
	}
}
