package pratices;

import java.util.Arrays;

public class log1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=192;
		final String KEY = "123456789";
		int arr[]=new int[4];
		String s1="";
		for(int i=1;i<=3;i++)
		{
			int mult=0;
			mult=n*i;
			s1+=mult;
		}
		System.out.println(s1);
		char c1[]=s1.toCharArray();
		Arrays.sort(c1);
		System.out.println(String.valueOf(c1));
//		if(KEY.equals(String.valueOf(c1))) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//			
//		}
		int k=1;
		for(int i=0;i<c1.length;i++)
		{
			System.out.println(k+" "+c1[i]);
			if(k==Integer.parseInt(c1[i]+""))
			{
				System.out.println("true");
				k++;
			}else {
				System.out.println("not formed");
				break;
				
			}
		}
	}

}
