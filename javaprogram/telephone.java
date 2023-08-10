package training;

public class telephone {

	static boolean Vowel(char c) {
	    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
	 
	static String findstring(String s) {

	    int l= s.length();
	    int index = -1;
	    for (int i = 0; i<l; i++)
	    {
	        if (Vowel(s.charAt(i)))
	        {
	        index = i;
	        System.out.println(s+"yay");
	        break;
	        }
	    }
	    if (index == -1)
	    return "-1";   
	    return s.substring(index)+ s.substring(0, index) + "ay";
	}
	 
	public static void main(String[] args) 
	{
		 String str =  findstring("duck");
//		 char c=str.charAt(0);
//		 if(c=='a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u') 
//		 {
//			 System.out.println(str+"yay");
//		 }
//		
		 System.out.print(str);
		 
	}

}
