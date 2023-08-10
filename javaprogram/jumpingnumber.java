package training;

public class jumpingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		int k=1;
		int arr[]=new int[n];
		int ans=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=k;
			k++;
		}
		for(int i=0;i<=8;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=10)
			{
				int r=arr[i];
				int s=r%10;
				r=r/10;
				int c=s-r;
				if(c==-1)
				{
					System.out.println(arr[i]);
					ans=arr[i];
				}
				else
					if(c==1)
					{
						System.out.println(arr[i]);
						ans=arr[i];
					}
			}
		}
		System.out.println(ans+" is the largest Jumping Number possible for X = "+n);
	

	}

}
