import java.util.*;
class numberofoccurence {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[] arr = new int[n];
			int count = 0;
			for(int i = 0; i < n; i++) {
				int temp = scan.nextInt();
				if(temp == k) {
					count++;
				}
				arr[i] = temp;
			}
			if(count > 0){
				System.out.println(count);

			}
			else {
				System.out.println("-1");

			}
		}
	}
}