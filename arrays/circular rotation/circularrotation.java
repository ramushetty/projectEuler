import java.util.*;
class circularrotation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i <n;i++) {
				arr[i] = scan.nextInt();
			}
			int temp = arr[n-1];
			for (int i = n-1 ; i >0 ; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
		}
	}
}