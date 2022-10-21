package ks;

public class ks10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="great responsibility";
		char c[]=s.toCharArray();
		int i,j;
		System.out.println("given string:"+s);
		System.out.print("string after removing repeating:");
		
		for(i=0;i<s.length();i++)
		{
			int count=1;
			for(j=i+1;j<s.length();j++)
			{
			if(c[i]==c[j])
			{
				count++;
				//i=i+1;
//				System.out.print(c[i]);
			}
			//System.out.print(" "+c[i]+"-"+count);

			}
			if(count>=2)
			{
			System.out.print(c[i]);
			}	
		}

	}

}
