package test;

public class Lexicographic_rank {
	static int fact(int a)
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
		}
		return f;
		
	
	}
	static int findrank(String s1)
	{
//		if(s1==null)
//		{
//			return 0;
//		}
		int r=1;
		for (int i = 0; i < s1.length() - 1; i++)
        {
           
            int count = 0;
            for (int j = i + 1; j < s1.length(); j++)
            {
                if (s1.charAt(i) > s1.charAt(j)) {
                    count++;
                }
            }
            r += count * fact(s1.length() - 1 - i);
        }
 
        return r;
	}
	public static void main(String[] args) {
		String s1="cba";
		System.out.println("string is "+s1);
		System.out.println("Lexicographic rank = "+findrank(s1));
	}

}
