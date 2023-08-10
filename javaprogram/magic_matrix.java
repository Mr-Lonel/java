package test;
import java.util.*;
public class magic_matrix {
static boolean magicsquare(int a[][]) {
	int sd1=0;int sd2=0;
	int n=3;
	for(int i=0;i<n;i++)
	{
		sd1+=a[i][i];
		sd2+=a[i][n-1-i];
	}
	if(sd1!=sd2)
	{
		return false;
	}
	for(int i=0;i<n;i++)
	{
		int rs=0;int cs=0;
		for(int j=0;j<n;j++)
		{
			rs+=a[i][j];
			cs+=a[j][i];
		}
		if(rs!=cs||cs!=rs)
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int x=s.nextInt();
		int a[][]= new int[x][x];
		for(int i=0;i<=x;i++) {
			for(int j=0;j<=x;j++) {
			a[i][j]=s.nextInt();
		}
		}
		if(magicsquare(a)==true)
		{
			System.out.println("magic square");
		}
		else
		{
			System.out.println("not magic square");
		}

	}

}
