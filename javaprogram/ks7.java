package ks;
import java.util.Scanner;
public class ks7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	 Scanner scan=new Scanner (System.in);
	 int a[][]=new int[50][50];
	 int r,c,i,j;
	 System.out.println("Enter the number of rows:");
	 r=scan.nextInt();
	 System.out.println("Enter the number of colums:");
	 c=scan.nextInt();
	 System.out.println("Enter the matrix elements:");
	 for(i=1;i<=r;i++)
	 {
		 System.out.println("Enter the number of row "+i+":");
		 for(j=1;j<=c;j++)
		 {
			 a[i][j]=scan.nextInt();
		 }
	 }	 
	 System.out.println("matrix of "+r+"*"+c);
	 for(i=1;i<=r;i++)
	 {
		 System.out.println("");
		 for(j=1;j<=c;j++)
		 {
			 System.out.print(a[i][j]+" ");
		 }
	 }
	 System.out.println();
	 System.out.println("Transpose matrix:");
	 for(i=1;i<=c;i++)
	 {
		 System.out.println("");
		 for(j=1;j<=r;j++)
		 {
			 System.out.print(a[j][i]+" ");
		 }
	 }
	
	 
	}

}
