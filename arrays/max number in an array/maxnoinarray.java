/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < t; i++){
		    int si = Integer.parseInt(scan.nextLine());
		    int[] arr = new int[si];
		    int max =0;
		    String[] arrs = scan.nextLine().split(" ");
		    for (int j = 0 ; j < si; j++) {
		        arr[j] = Integer.parseInt(arrs[j]);
		        if (j == 0) {
		            max = arr[j];
		        }
		        if (arr[j] > max) {
		            max = arr[j];
		        } 
		    }
		    System.out.println(max);
		}
	}
}