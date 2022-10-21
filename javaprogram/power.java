package string;

public class power {

	public static void main(String[] args) {
		int N=4,p=4;
		System.out.println(pow(N,p));
		System.out.println(Math.pow(N, p));
	}
	static int pow(int N,int p) {
		int a=N;
		int b=N;
		for(int j=1;j<p;j++) {
			for(int i=1;i<N;i++) {
				 a+=b;
			}
		 b=a;
		}
		return a;
	}	
}