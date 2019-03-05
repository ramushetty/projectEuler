import java.util.*;
import java.lang.*;
class Multiplyleftandrightarraysum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  t = scan.nextInt();
		for (int i = 0 ; i < t; i++) {
			int n = scan.nextInt();
			int[] leftarr = new int[n/2];
			int[] rightarr = new int[n-n/2];
			int leftsum = 0;
			int rightsum= 0;
			for (int j = 0 ; j < n/2 ; j++) {
				leftarr[j] = scan.nextInt();
				leftsum += leftarr[j];
			}
			for (int j = 0; j < n-n/2; j++) {
				rightarr[j] = scan.nextInt();
				rightsum += rightarr[j];
			}
			System.out.println(leftsum*rightsum);

		}
	}
}