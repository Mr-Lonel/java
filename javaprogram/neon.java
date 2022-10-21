package demo;

public class neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int y = 9;
		 int y1=y*y;
		    int sum = 0;
		    while (y1 % 10 != 0) {
		        sum += y1 %10;
		        y1 = y1 / 10;
		        if (0 == y1 && sum >= 10) {
		            y1 = sum;
		            sum = 0;
		        }
		    }
		    System.out.println(sum);

		    if(sum==y)
		    {
		    	System.out.println("true");
		    }
		    else
		    	System.out.println("false");
	}

}
