package string;

public class Missing {

	public static void main(String[] args) {
		int n=8;
		int a[]= {2,6,10,4,14,12,0};
		int s=0;
		for(int i=0;i<a.length;i++) {
			//if(a[i]%2==0) {
			s+=a[i];
			}
		
		int suma1=n*(n+1)/2;
		int suma2=s;
		int mnum=suma1-suma2;
		System.out.println("the missing number is : "+ mnum);
	}

}
