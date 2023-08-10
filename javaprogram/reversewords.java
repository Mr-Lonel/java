package test;

public class reversewords {
	 static void toupper(String s5)
	{
		 String s4="";
		 char m=s5.charAt(0);
		int a=m;
		if(a>=96&&a<=122)
		{
			a=a-32;
			m=(char)a;
			s4+=Character.toUpperCase(m) + s5.substring(1);
			System.out.print(s4+" ");
		}
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String s1="Wipro Technologies Bangalore";
		String s2="";
		char c[]=s1.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			s2+=c[i];
		}
//		System.out.println(s2);
		String s3=s2;
		char c1[]=s3.toCharArray();
		char m;
		String s4="";
//		System.out.println(s3.toUpperCase());
		for(int i=0;i<s3.length();i++)
		{		
				m=s3.charAt(i);
				int a=m;
			    if(a>=96&&a<=122)
				{
			    	a=a-32;
			    	m=(char)a;
			    	s4+=Character.toUpperCase(m);
				}		
			    else
			    {
			    	s4+=Character.toLowerCase(m);
			    }
	
		}
		System.out.println(s1);
		System.out.println(s4);
		String s5[]=s3.toLowerCase().split(" ");
		for(int i=0;i<s5.length;i++)
		{
			toupper(s5[i]); 
		}
	}

}