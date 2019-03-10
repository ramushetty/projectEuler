import java.util.*;
class sumofdistele {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			HashSet<Integer> s = new HashSet<Integer>();
			for(int i = 0; i < n ; i++) {
				arr[i] = scan.nextInt();
			}
			int sum = 0;
			for (int i = 0 ; i < n ; i++) {
				if (!s.contains(arr[i]) && arr[i] <= n) {
					s.add(arr[i]);
					sum += arr[i];
				}
			}
			System.out.println(sum);

		}
	}
}