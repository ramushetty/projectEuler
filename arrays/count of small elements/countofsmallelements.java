/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0 ; i < t; i++) {
		    int s = scan.nextInt();
		    int[] arr = new int[s];
		    for(int j =0; j < s;j++) {
		        arr[i] = scan.nextInt();
		      //  System.out.print(arr[i]);
		    }
		    int ele = scan.nextInt();
		    int sum = 0;
		  //   System.out.println(ele);
		    for (int k= 0 ; k < s;k++) {
		        System.out.print(arr[k]);
		        if (arr[k] <= ele) {
		            System.out.print(" "+arr[k] + " " + ele + " ");
		            sum++;
		        }
		    }
		  //  System.out.println(sum);
		}
	}
}