package ks;
import java.util.Scanner;
public class kspass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=0,j;
		String s1=scan.next();
		char c[]=s1.toCharArray();
		int n[]= {'1','2','3','4','5','6','7','8','9','0'};
		System.out.println("length of string:"+s1.length());
		if(s1.length()>25) 
		{
			System.out.println("password more than 25 char");
		}
		else	
		{
			for(i=0;i<c.length;i++)
		    {
				for(j=0;j<n.length;j++)
				{
			      if(c[i]==n[j])		    	  
		      	{
			    	  System.out.println("fail");
		      	}
			      else
			      {
			    	  if(c[i]==c[i+1]&c[i]==c[i+2])
			    	  {
			    		  System.out.println("invalid");
			    	  }		    
			          else
			           { 
			        	  System.out.println("pass");
				
			           }
			
				}
		     }	
		
		}
		
		}
	}
}
		
		



