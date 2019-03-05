/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class minmax {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < test; i++) {
		    int arrs = Integer.parseInt(scan.nextLine());
		    int[] arr = new int[arrs];
		    String[] arrss = scan.nextLine().split(" ");
		    for (int j = 0; j < arrs;j++){
		        arr[j] = Integer.parseInt(arrss[j]);
		        
		    }
		    int maxim = arr[0];
		    int min = arr[0];
		    for(int k = 0; k<arrs;k++) {
		        if (arr[k] >= maxim) {
		            maxim = arr[k];
		        }
		        if (arr[k] <= min){
		            min = arr[k];
		        }
		    }
		    // Arrays.sort(Arr);
      //    	System.out.println(Arr[sizeOfArr-1]+" "+Arr[0]);
		    System.out.println(maxim + " " + min);
		}
		
		
	}
}