package training;

public class stringcontainallalphobit {

	static void letter(String str)
	{
		str=str.toLowerCase();
		boolean letterpresent=true;
		for(char c='a';c<='z';c++)
		{
			if(!str.contains(String.valueOf(c)))
			{
				letterpresent=false;
				break;
			}
		}
		if(letterpresent)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String str = "Abcdefghijklmnopqrstuvwxyz";
		  letter(str);
	}

}
