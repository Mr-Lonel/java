package test;

public class hill_cipper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ACT";
		String s2="GYBNQKURP";
		int l=s1.length();
		int l1=s2.length();
		int a[]=new int [l1];
		int b[]=new int[l];
		int c[]=new int[l];
		int a1[][]=new int[l][l]; 
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s2.charAt(i)-65;
//			System.out.print(" "+a[i]);
		}
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=s1.charAt(i)-65;
//			System.out.print(" \n"+b[i]);
		}
		int k=0;
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				a1[i][j]=a[k];
				k++;
			}
		}
//		for(int i=0;i<l;i++)
//		{
//			System.out.println("");
//			for(int j=0;j<l;j++)
//			{
//				System.out.print(" "+a1[i][j]);
//			}
//		}
		for(int i=0;i<l;i++)
		{
			int sum=0;
			for(int j=0;j<l;j++)
			{
				sum+=a1[i][j]*b[j];
				
			}
		     c[i]=sum;
//		     System.out.println(c[i]);
			
		}
		int m=0;
		char s3;
		int d[]=new int[l];
		for(int i=0;i<l;i++)
		{
				d[i]=(c[m]%26)+65;
				m++;
				s3=(char)d[i];
				System.out.print(s3);
		}
		
	}

}
