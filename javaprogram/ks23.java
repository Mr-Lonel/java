package ks;

import java.util.Scanner;

public class ks23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count1=0;int count2=0;
		System.out.println("enter the string : ");
		String s1=scan.next();
		char c;
		s1=s1.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			int w=c;
			if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')
			{
				count1+=1;
			}
			else
				if(w>=97&&w<=122)
				{
//					System.out.print(c);
					count2+=1;
				}
		}
		System.out.print("vowels in a string-"+count1 +"\n");
		System.out.print("consonant in a string-"+count2);

	}

}
