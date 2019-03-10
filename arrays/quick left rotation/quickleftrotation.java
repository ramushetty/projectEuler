import java.util.*;
class quickleftrotation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n ; i++) {
				arr[i] = scan.nextInt();
			}
			for (int i = 0 ; i < k ; i++) {
				rotateleft(arr);
			}
			for(int i = 0; i <n ;i++) {
				System.out.print(arr[i] + " ");

			}
			System.out.println();
		}
	}
	static void rotateleft(int[] arr) {
		int temp = arr[0];
		for (int  i = 0 ; i < arr.length-1 ; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
}