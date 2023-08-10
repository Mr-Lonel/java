package pratices;

public class count2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12332245;
		int c=0;
		int g=2;
		while(n>0)
		{
			int tem=n%10;
			if(tem==g)
				c++;
			n/=10;
		}
System.out.println(c);
	}

}
