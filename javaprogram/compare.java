package demo;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		String s="ssaetrrrjsdfhj";
		char c[]=s.toCharArray();
		for (int j = 0; j < s.length()-2; j++) {
			
			if(c[j]!=c[j+1]&&c[j]!=c[j+2])
			{
				System.out.print("passs");
				break;
			}
		}

	

	

	}

}
