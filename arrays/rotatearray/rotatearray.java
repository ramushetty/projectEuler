
import java.util.*;
import java.lang.*;
import java.io.*;
public class rotatearray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i =0 ; i < t; i++) {
			int n = scan.nextInt();
			int r = scan.nextInt();
			int[] arr = new int[n];
			for (int j = 0 ; j < n ; j++) {
				arr[j] = scan.nextInt();
			}
			rotate(arr, n, r);
			System.out.println(Arrays.toString(arr));
		}
		
	}
	// public static void rotate(int[] arr, int n, int r) {
	// 	for ( int i = 0 ; i < r ; i++) {
	// 		rotate1(arr, n , r);
	// 	}

	// }
	// public static void rotate1(int[] arr, int n, int r) {
	// 	int  temp = arr[0]; 
	// 	for (int i = 0 ;i < n -1; i++) {
	// 		arr[i] = arr[i+1];
	// 	}
	// 	arr[n-1] = temp;
	// }
	public static void rotate(int[] arr, int n , int r) {
		for (int i = 0 ; i < t; i ++) {
			rotate1(arr, n , r);
		}
	}
	public static void rotate1(int[] arr, int n , int r) {
		int temp = arr[n-1];
		for (int i = 0; i < n ) {
			
		}
	}
}