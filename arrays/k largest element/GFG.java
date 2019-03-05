// *package whatever //do not write package name here */

// import java.util.*;
// import java.lang.*;
// import java.io.*;
// import java.util.Collections;

// class GFG {
// 	public static void main (String[] args) {
// 		//code
// 		Scanner scan = new Scanner(System.in);
// 		int t = scan.nextInt();
// 		for (int j =0; j <t;j++) {
// 		    String[] hh = scan.nextLine().split(" ");
		    
//     		int n = Integer.parseInt(hh[0]);
//     		int k = Integer.parseInt(hh[1]);
//     		int[] arr = new int[n];
//     		String[] as = scan.nextLine().split(" ");
//     		for (int i = 0; i < n ; i++) {
//     		    arr[i] = Integer.parseInt(as[i]);
//     		}
//     		Arrays.sort(arr);
//     // 		System.out.println(Arrays.toString(arr));
//     		int count = 0;
//     		for (int l = n-1; l >= 0;l--) {
//     		    if (l == k) {
//     		        break;
//     		    }
//     		    count++;
//     		    System.out.print(arr[l] + " ");
//     		}
    		
//     		System.out.println();
// 	    }
// 	}
// }
// 
// 
import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

class GFG {
    public static void main (String[] args) {
        //code
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int j =0; j <t;j++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
         // System.out.println(Arrays.toString(arr));
            int count = 0;
            for (int l = n-1; l >= 0;l--) {

                if (count == k) {
                    // System.out.println("ramu");

                    break;
                }
                count++;
                System.out.print(arr[l] + " ");
            }
            
            System.out.println();
        }
    }
}