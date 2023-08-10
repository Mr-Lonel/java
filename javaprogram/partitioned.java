package test;

public class partitioned {

	public static void main(String[] args) {
		int a[]= {1,2,4,7,5,3};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int s=sum/2;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					int sum2=0;
					sum2=a[i]+a[j]+a[k];
					if(s==sum2)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}
}