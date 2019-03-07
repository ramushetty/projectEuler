import java.util.*;

class Thirdlargestelement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();  
			}
			Arrays.sort(arr);
			// System.out.println(arr[n-3]);// possibility of indexout od error
			int count = 0;
			// System.out.println(arr[arr.length]);
			for (int i = arr.length-1; i >= 0; i--) {
				if (count == 2) {
					System.out.println(arr[i]);
					break;
				}
				count++;
			}
		}	
	}
	
}