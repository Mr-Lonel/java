package training;

public class Encrypt_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString 
		String s1="EngIneering";
		String s2="";
		char k='g';
		int kc=k-96;
		int dc='n'-97;
		
					System.out.println(dc);
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int e=0;
			int a=c[i];
			if(a>=65&&a<=90)
			{
				e=(a-64)-kc;
				
				if(e<0)
				{
					int m=26+e;
					s2+=(char)(m+64);
				}
				else
					s2+=(char)(e+65);
			}
			else
			{
				if(a>=97&&a<=122)
				{
					e=(a-97)-kc;
					if(e<0)
					{
						int j=27+e;
						s2+=(char)(j+96);
					}
					else
						s2+=(char)(e+97);
					
				}
			}
		}
		System.out.println(s2);

	}

}
