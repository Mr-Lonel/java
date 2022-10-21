package string;
import java.util.*;
public class Second {

	public static void main(String[] args) {
		int k;
		Scanner s=new Scanner(System.in);
		System.out.println("enter k =");
		k=s.nextInt();
		int a[]= {2, 9, 12, 16, 20};
		int l=a.length;
		int a1[]=new int[l];
		for(int i=0;i<l;i++)
		{
			int sum=0;
			if(a[i]<k)
			{
				sum+=a[i]+k;
			}
			else
			{
				sum+=a[i]-k;
			}
			a1[i]=sum;
			
			System.out.println(a1[i]);
		}
		int sum2=(a1[0]-a1[l-1])*-1;
		
		System.out.println("sum--"+sum2);
		s.close();
	}
}
