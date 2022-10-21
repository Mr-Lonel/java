package demo;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		String s="comuter";
		char c[]=s.toCharArray();
		char v[]= {'u','o','a','e','i'};
		 System.out.println("string:"+s);
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<v.length;j++)
			{
				if(c[i]==v[j])
				{
					 c[i]='*';
										
				}
			}
			
		}
		System.out.print("string after removing vowels:");
		for(i=0;i<c.length;i++)
		{
			 System.out.print(c[i]);
		}

	}

}
