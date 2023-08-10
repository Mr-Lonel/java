package training;

public class largestPalindromeinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="nitin is a good guy";
		s1.toLowerCase();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
//			System.out.println(s2[i]);
			String str="";
			
			int l=s2[i].length();
			for(int j=0;j<l;j++)
			{
			char c1=s2[i].charAt(j);
			str=c1+str;
			}
//			System.out.println(str);
			if(s2[i]==str)
			{
				System.out.println(s2[i].length());
			}
		}

	}

}
