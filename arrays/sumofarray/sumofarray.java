
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		for (int i = 0; i <t;i++) {
		    int s = Integer.parseInt(scan.nextLine());
		    String[] arrs = scan.nextLine().split(" ");
		    int[] arr = new int[s];
		    int  sum = 0 ;
		    for(int j =0; j <s; j++) {
		      sum += Integer.parseInt(arrs[j]);
		      //sum += scan.nextInt();(usw nextLine() whole program or use nextInt but dont we should not use both)
		    }
		    System.out.println(sum);
		    
		    
		}
	}
}