package pratices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    ArrayList <Integer>a=new ArrayList<>();
	    for(int i=0;i<n;i++)
	    {
	      a.add(sc.nextInt());
	    }
	    Collections.sort(a);
	    for(int i=0;i<n;i++)
	    {
	    	if(a.get(i)!=i)
	    		a.add(i,-1);
	    }

	    for(int i=0;i<n;i++)
	    {
		    System.out.print(a.get(i));

	    }
	}

}
