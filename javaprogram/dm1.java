package demo;

public class dm1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="ks@";
		String up="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lw="abcdefghijklmnopqrstuvwxyz";
		int i,j,k;
		char c[]=s.toCharArray();
		char up1[]=up.toCharArray();
		char lw1[]=lw.toCharArray();
		int n[]= {'1','2','3','4','5','6','7','8','9','0'};
		char sp[]= {'!','@','#','%','$','^','&','*','(',')'};
			
		for(i=0;i<c.length;i++)
		{
			if(c.length<25)
			{		
			for(j=0;j<n.length;j++)
			{
			if(c[i]==n[j])
			{
				System.out.print("pass");
				break;
			}
			else
				System.out.print("not valid");
			}
			}
			else
				System.out.print("size excide");
			
			for(k=0;k<up1.length;k++)
				{
					if(c[i]==up1[k])
					{
						System.out.print("pass");
					}
					
				}
					
			
			
			
		}
		
		

	}

}
