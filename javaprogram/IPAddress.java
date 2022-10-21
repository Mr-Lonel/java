package string;

public class IPAddress {

	public static void main(String[] args) {
		String a="193.187.111.222";
		int c=0;
//		System.out.println(a);
		for(int i=0;i<a.length();i++) {
			c=(int)a.charAt(i);
			System.out.println(c);
		}
	}
}
