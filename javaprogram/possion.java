package demo;

public class possion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="downloab";
		int i;
		String s2=s1.toLowerCase();
		char c;
		int count=0;
		int d=96;
		int f[]=new int[s1.length()];
		for(i=0;i<s1.length();i++) 
		{
			c=s2.charAt(i);
			int w=c;
			if(w>=97&w<=122)
			{		
				f[i]=w-d;
			}
		}
	for(i=0;i<s1.length();i++)
	{
		for(int j=2;j<f[i];j++)
		{
			if(f[i]%j==0)
			{
				count++;
			}		
		}
		if(count==0)
		{
			System.out.println(s2.charAt(i));
		}
		count=0;
	}
	}
}
