package ks;
import java.util.Scanner;
public class ks9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i,j,r;
		int n=1;
		System.out.println("enter the row");
		r=scan.nextInt();
		for(i=0;i<r;i++) {
			System.out.println("");
			for(j=0;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
	
			
		}
		

	}

}
