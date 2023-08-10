package training;

public class arrayinteger_to_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,54,76,23,178};
		char c[]=new char[arr.length];
		String s1="";
		for(int i=0;i<arr.length;i++)
		{
			s1+=String.valueOf(arr[i]);
		}
		System.out.println(s1);
	}

}
