import java.util.*;
import java.lang.*;
class productofmaxinfaandmininsec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n1 = scan.nextInt();
			int[] arr = new int[n1];
			for (int i = 0 ; i < n1 ; i++) {
				arr[i] = scan.nextInt();
			}
			int max = arr[0];
			for (int i = 0; i < n1 ; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			int n2 = scan.nextInt();
			int[] arr1 = new int[n2];
			for (int i = 0; i < n2; i++) {
				arr1[i] = scan.nextInt();
			}
			int min = arr1[0];
			for (int i = 0; i < n2; i++) {
				if (arr1[i] < min) {
					min = arr1[i];
				}
			}
			System.out.println(max*min);
		}
	}
}

// can use array.sort() use 1 and n-1 to know min and max element . 