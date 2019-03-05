
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class missingnumber {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t  = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int[] arr = new int[n-1];
			int total = (n * (n+1))/2;
			for (int j = 0; j< n-1 ; j++) {
				arr[j] = scan.nextInt();
				total -= arr[j];
			}
			System.out.println(total);
		}

	}
}