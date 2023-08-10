package training;

public class t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1="9880127431";
		 String s2="";
		 char c;
		 int w;
		 int sum=0;
		 int arr2[]=new int[s1.length()];
		 int arr1[]=new int[s1.length()];
		 for(int i=0;i<s1.length();i++)
		 {
			 c=s1.charAt(i);
			 w=c-48;
			 arr1[i]=w;
			 System.out.println(arr1[i]);
		 }
		 int a;
		 for(int i=0;i<arr1.length;i++)
		 {
			 sum=arr1[i]+sum;
			 if(sum%2==0)
			 {
			 arr2[i]=sum;
			 }
			 a=i;
		 }	

	}

}
