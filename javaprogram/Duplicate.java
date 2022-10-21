package string;

public class Duplicate {

	public static void main(String[] args) {
		String a="abbbccdeefkf";
		char[]b=a.toCharArray();
		int c[]=new int[b.length];
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
			    if(b[i]==b[j]) {
			    	c[i]=c[j]=-1;
				 }
			}
			if(c[i]!=-1) {
				    System.out.println(b[i]);
			}
		}
	}
}

//char b[]=a.toCharArray();
//System.out.println(b);
//char c[]=a.toCharArray();
//System.out.println(c);
//for(int i=0;i<a.length();i++) {
//	for(int j=i+1;i<a.length();j++){
//		if(c[i]!=c[j]) {
//			System.out.println(c[i]);
//			System.out.println(c[j]);
//			break;
//		}
//	}
//}
