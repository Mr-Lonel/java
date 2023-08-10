package pratices;

import java.util.Arrays;
import java.util.Scanner;

public class looptest {
	public static int countn(int k ,int n,int g)
	{
		int s1=0;
		
		while(n>0)
		{
        int rem = n%10;
        if(rem == k)
            g++;
        n /= 10;
		}
		return g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s1="";
		String s=Integer.toString(n);
		char c[]=s.toCharArray();
		int k[]=new int[c.length];
		for(int i=0;i<k.length;i++)
			k[i]=(int)c[i];
		Arrays.sort(c);
		int g=0;
		for(int i=0;i<k.length;i++)
		{
			int l=g;
		int h=k[i];
		System.out.println(countn(h,n,l));
		l=0;
		}
//		for(int i=0;i<c.length;i++)
//		System.out.println(c[i]);
	}
	

}
