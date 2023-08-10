package training;

public class stringpermutations {
	static void printpermut(String s,String ans)
	{
	 for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         String ros = s.substring(0, i) + s.substring(i + 1);
         printpermut(ros, ans + ch);
         System.out.println(ros+ans+ch);
     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "abc";
	     printpermut(s, "");
	}

}
