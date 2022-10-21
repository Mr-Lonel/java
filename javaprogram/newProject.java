package string;

public class newProject {
	static int newArr[];
	public static void main(String arg[]) {
		
		int arr[] = new int[5];
		tryCatch(arr);
//		try {
//			for(int i=0;i<10;i++) {
//				arr[i] = i+1;
//			}
//		}
//		catch(Exception exp){
//			upgradeArr(arr);
//		}
		for (int i : newArr) {
			System.out.println(i);
		}
		
	}
	public static void upgradeArr(int arr[]){
		newArr = new int[(arr.length)*2];
		for (int i=0;i<arr.length;i++) {
			newArr[i] = arr[i];
		}
		for(int i=5;i<10;i++) {
			newArr[i] = i+1;
		}
		
	}
	
	public static void tryCatch(int arr[]) {
		try {
			for(int i=0;i<10;i++) {
				arr[i] = i+1;
			}
		}
		catch(Exception exp){
			upgradeArr(arr);
		}
	}
}
