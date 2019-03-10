import java.util.*;
class minandmaxelementinarray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0 ; i < n ; i++) {
				arr[i] = scan.nextInt();
			}
			int min = arr[0];
			int max = 0;
			// System.out.println(Arrays.toString(arr));
			for (int i = 0 ; i< n ; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
				else if (arr[i] < min) {
					min = arr[i];
				}
			}
			System.out.println(min + " " + max);
		}
	}
}

// Arrays.sort(arr) small and large 
