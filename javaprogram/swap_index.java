package pratices;

public class swap_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="bbg";
		String s2="";
		int l=s1.length();
		for(int i=l-1;i>=0;i--)
			s2+=s1.charAt(i);
		
		System.out.println(s2);
		
	}
	

}
