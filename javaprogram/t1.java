package training;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="kalifa";
		char c;
		int l=s1.length();
		int arr[]=new int[s1.length()];
		int n;
 //to get alphabet positions
		for(int i=0;i<l;i++)
		{
			 n=s1.charAt(i)-96;
			 
			 arr[i]=n;
		}
		
		System.out.println();
//to get the sum of all fist and last letter total 
		int arr2[]=new int[l];
		int sum;
		int k=0;
		int m;
       	if(arr.length/2==0) //if total length of string is odd no eg:world=[w-d]+[o-l]+[r]
		{
			for(int j=l-1;j>=l/2;j--)
			{			
				sum=arr[k]-(arr[j]);
				arr2[k]=sum;	
				System.out.println(arr2[k]);
				k=k+1;
			}
			
			int sum2=0;
			m=arr[(arr.length/2)];
			for(int i=0;i<arr2.length;i++)
			{
				if(arr2[i]<0)
				{
					sum2=-(arr2[i])+sum2;
				}
				else
					sum2=arr2[i]+sum2;
			}
			System.out.println(sum2+m);
		}
		
		else //if total length of string is even no eg:worlds=[w-s]+[o-d]+[r-l]
		{
			for(int j=l-1;j>=l/2;j--)
			{			
				sum=arr[k]-(arr[j]);
				arr2[k]=sum;	
				System.out.println(arr2[k]);
				k=k+1;
			}		
//	changing negative number to positive and adding the sum of all elements in a array2		
			int sum2=0;
			for(int i=0;i<arr2.length;i++)
			{
				if(arr2[i]<0)
				{
					sum2=-(arr2[i])+sum2;
				}
				else
					sum2=arr2[i]+sum2;
			}
			System.out.println(sum2);

		}

	}

}
