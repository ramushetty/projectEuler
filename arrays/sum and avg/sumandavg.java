//finding average and sum of elements in an array.
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for (int j = 0; j < t; j++){
		    int sum = 0;
            int s = scan.nextInt();
            int[] arr = new int[s];
            for (int i = 0; i < s; i++) {
                arr[i] = scan.nextInt();
                sum += arr[i];
            }
            double avgg=(double)sum/s;
            // double avg = (double)Math.round(avgg*100)/100;
            System.out.print(sum + " ");
            System.out.format("%.2f", avgg);
            System.out.println();
            
		}
	}
}