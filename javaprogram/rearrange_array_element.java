package training;

public class rearrange_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6};
		int arr2[]=arr.clone();
		int n=arr.length;
		int s=0;
		int l=n-1;
		boolean flag=true;
		for(int i=0;i<n;i++)
		{
			if(flag)
			{
				arr[i]=arr2[l--];
			}
			else
			{
				arr[i]=arr2[s++];
			}
			flag=!flag;
		}
	for(int i=0;i<arr2.length;i++)
	{
		System.out.print(arr[i]);
	}
	}

}
