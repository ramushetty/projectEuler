import java.util.*;
import java.lang.*;
import java.io.*;
//in O(n^3)
// class GFG {
// 	public static void main (String[] args) {
// 		//code
// 		Scanner scan = new Scanner(System.in);
// 		int t = scan.nextInt();
// 		for (int i = 0; i < t; i++) {
// 		    int n = scan.nextInt();
// 		    int[] arr = new int[n];
// 		    for (int j = 0; j < n ; j++) {
// 		        arr[j] = scan.nextInt();
// 		    }
// 		    int sum = 0;
// 		    for (int e = 0; e < n ; e++) {
// 		        int temp = arr[e];
// 		        for (int e1 = e + 1; e1 < n; e1++) {
// 		            if (temp == arr[e1]) {
// 		                arr[e1] = 0;
// 		            }
// 		        }
// 		        sum += temp;
// 		    }
// 		    System.out.println(sum);
// 		}
// 	}
// }
// 
//In O(nlogn)
// class sumofdistele {
// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		int t = scan.nextInt();
// 		for (int i = 0 ; i < t ; i++) {
// 			int n = scan.nextInt();
// 			int[] arr = new int[n];
// 			for(int j = 0; j < n ; j++) {
// 				arr[j] = scan.nextInt();
// 			}
// 			Arrays.sort(arr);
// 			int sum = 0;
// 			sum = arr[0];
// 			for (int k = 0; k < n-1; k++) {
// 				if(arr[k] != arr[k+1]) {
// 					sum += arr[k+1];
// 				}
// 			}
// 			System.out.println(sum);
// 		}	
// 	}
// } 
// 
// In O(n) time
class sumofdistele {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			HashSet<Integer> s = new HashSet<Integer>();
			int sum = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = scan.nextInt();
				if (!s.contains(arr[j])) {
					sum += arr[j];
					s.add(arr[j]);
				}
			}
			System.out.println(sum);
		}
	}
}