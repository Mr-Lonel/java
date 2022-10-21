package demo;
import java.util.Scanner;
public class dm2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s= scan.next();
		
		int i,j;
		String s1=s.toUpperCase();
		int l=s.length();
		char c[]=s.toCharArray();
		for(i=0;i<c.length;i++) 
		{
				if(Character.isUpperCase(c[i]))
				{
					s=new String(c);
				for(i=0;i<c.length;i++) 
				{
				 if(Character.isLowerCase(c[i]))
				 {
					s=new String(c);
					for(i=0;i<c.length;i++) 
					{
						if(Character.isDigit(c[i]))
						{
							
						}
					}
				 }
				
				}
			
				}
						
		}
	
	}

}
