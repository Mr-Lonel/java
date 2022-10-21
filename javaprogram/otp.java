package demo;
import java.util.Scanner;
public class otp {
     static String output1="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("enter the name:");		
		String input1=scan.next();
		System.out.print("enter the accountno:");
		long input2=scan.nextLong();
		System.out.print("enter the account type:");
		String input3=scan.next();
	
		int l1=input1.length();
		int l3=input3.length();
		int l2=0;
		long t1=input2;
		while(t1>0)
		{
			t1=t1/10;
			l2++;
		}
		
		if(l1>=2)
		{
			if(l2==11)
			{
				if(input3.equals("Saving")||input3.equals("Current")||input3.equals("Loan"))
				{
					userMethod(input1,input2,input3);
				}
				else
				{
					System.out.println("enter correct account try:");
				}
			}
			else {
				System.out.println("account anumber should be 11:");
				
			}
	
		}
		else {
			System.out.println("enter name more than 2 char:");
		}
		System.out.println("otp is:"+output1);

	}
	
	public static void userMethod(String input1, long input2, String input3 ) {
		// Code here
		char otp[]=new char[8];
		otp[0]=input3.charAt(0);
		otp[1]=input3.charAt(1);
		long n7=(long) (input2/10000000000L);
		otp[2]=Long.toString(n7).charAt(0);
		int n=(int) (input2/1000000);
		int sum=0;
		int temp=0;
		//System.out.println(n);
		while(n>0||sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			temp=n%10;
			sum=sum+temp;
			n=n/10;
		}

		otp[3]=Integer.toString(sum).charAt(0);
		//System.out.println(otp[3]);
		otp[4]=input1.charAt(0);
		int n1=(int) (input2%1000000)/10;
    	//System.out.println(n1);
		int sum1=0; int temp1=0;
		while(n1>0||sum1>9)
		{
			if(n1==0)
			{
				n1=sum1;
				sum1=0;
			}
			temp1=n1%10;
			sum1=sum1+temp1;
			n1=n1/10;
		}
		//System.out.println(sum1);
		otp[5]=Integer.toString(sum1).charAt(0);
		int l8=input1.length();
		otp[6]=input1.charAt(l8-1);
		long n9=(long)(input2%10000000000L);
		otp[7]=Long.toString(n9).charAt(0);
			
		for(int i=0;i<8;i++)
		{
			output1+=otp[i];
			
		}
		 
		
		}

}
