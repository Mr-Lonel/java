package pratices;

import java.util.Scanner;

public class matrixofdiaglr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int d1=0,d2=0;
		int n=0,m=2;
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
				if(i==j)
				{
					d1=d1+(arr[i][j]*arr[i][j]);
				}
				if(i==n&&j==m)
				{
					d2+=arr[i][j]*arr[i][j];
					n++;
					m--;
				}
			}
		}
		
		System.out.println(d1+ " "+d2);
		

	}

}
