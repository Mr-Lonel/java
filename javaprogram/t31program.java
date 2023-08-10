package training;

public class t31program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="4325043";
		int n=3;
		int l=s1.length()-n;
		String s3[]=new String[100];
		String s2=s1.substring(0,l);
		
//		for(int i=0;i++)
		String s4="";
		System.out.println(s2);
		int k=1;
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<s1.length();j++);
			{
			char c1=s2.charAt(i);
			s4=c1+s1.substring(k, l-1);
			k++;
			}
			System.out.println(s4);
		}

	}

}
