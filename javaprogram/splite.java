package string;
import java.util.Arrays;
public class splite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" there was a car";
		String s2[]=new String[s1.length()];
		String[] s3=s1.split(" ");
		for (String string : s3) {
			System.out.println(" ");
			for(int i=0;i<string.length();i++) {
				int x=string.charAt(i);
				System.out.print(x+" ");
			}
		}
		}

	}

////		char d[]=new char[1000];
//char c[]= {};
//for(int i=0;i<s3.length;i++)
//{
//	for (int j = 0; j < c.length; j++) {
//		
//		c[i]=s3[i].charAt(i);
//	}
//	
//}
//for (char i : c) {
//	
//}
////		int w=c[i];
////		if(w>=97&&w<=122)
////		{
////			System.out.println(w);
////		}
////		 System.out.println(Arrays.toString(c));
////		}for(int i=0;i<c.length;i++)
////		{
////		System.out.println(c[i]);
////	}