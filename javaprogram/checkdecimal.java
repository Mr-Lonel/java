package string;
public class checkdecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1001101;
		int count1=0;
		String s1=Integer.toString(a);
		char c[]=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			c[i]=s1.charAt(i);
		}
		char s='0';char d='1';
		int count=0;
		for(int i=0;i<c.length;i++)
		{
		if(c[i]==s)
		{
			count++;
//		
		}
		if(c[i]==d)
		{
			count1++;
		}
		}
		System.out.println("decimal number has 0 and 1 digits - "+s1);
		if(count>0&&count1>0)
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}