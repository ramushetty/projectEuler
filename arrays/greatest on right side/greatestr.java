import java.util.*;
import java.lang.*;

// class greatestr {
// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		int t = scan.nextInt();
// 		for (int i = 0; i < t ; i++) {
// 			int n = scan.nextInt();
// 			int[] arr = new int[n];
// 			for (int j = 0; j < n; j++) {
// 				arr[j] = scan.nextInt();
// 			}
// 			for ( int e = 0; e < n; e++) {
// 				int temp = arr[e];
// 				int temp1 = 0;
// 				if (e == n-1) {
// 					arr[n-1] = -1;
// 					break;
// 				}
// 				for(int e1 = e+1; e1 <n ; e1++) {
// 					if (arr[e1] > temp1) {
// 						temp1 = arr[e1]; 
// 					}
// 				}
// 				arr[e] = temp1;
// 			}
// 			System.out.println(Arrays.toString(arr));

// 		}
// 	}
// }
// 


// doing it only in one traversal 

class greatestr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n ; i++) {
			arr[i] = scan.nextInt();
		}
		greatestfromright(arr);
	}
	public static void greatestfromright(int[] arr) {
		int l = arr.length;
		int maxfromright = arr[l-1];
		arr[l-1] = -1;
		for (int i = l -2; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = maxfromright;
			if (maxfromright < temp) {
				maxfromright = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}