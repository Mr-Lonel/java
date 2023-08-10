package test;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "kalifa".toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0; i < input.length(); i++){
		    System.out.println(alphabet.indexOf(input.charAt(i))+1);
		}
	}

}
