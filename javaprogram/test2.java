package test;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="atrung";
		int l=s1.length();
		int i,j,sum=0;
		int sum2=0;
		int sum3=0;
		int arr[]=new int[l];
		int a2[]=new int[l];
		for(i=0;i<l;i++)
		{
			char c=s1.charAt(i);
			int w=c;
			a2[i]=w;
			sum2+=a2[i];
			
			if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')
			{
				a2[i]=w;
				sum3+=a2[i];
			}
			else
				if(w>=97&&w<=122)
				{
					arr[i]=w;
					System.out.println(arr[i]);
					sum+=arr[i];
					
					
				}
		}
		System.out.println("without vowels sum- "+sum);
		System.out.println("with vowels sum2- "+sum2);
		System.out.println("vewols sum3- "+sum3);
		

	}

}
