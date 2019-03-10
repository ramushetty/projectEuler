import java.util.*;

class balancedarray {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t ; i++) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for(int j = 0 ; j < n; j++) {
				arr[j] = scan.nextInt();
			}
			int leftarrsum = 0;
			int rightarrsum = 0;
			for (int j = 0 ; j < n; j++) {
				if (j < n/2) {
					leftarrsum += arr[j];
				} else {
					rightarrsum += arr[j];
				}
			}
			int result = 0;
			if (leftarrsum == rightarrsum) {
				result = 0;
			} else {
				if (leftarrsum < rightarrsum) {
					result = rightarrsum -leftarrsum;
				} else {
					result = leftarrsum - rightarrsum;
				}
			}
			System.out.println(result);
		}
	}
}