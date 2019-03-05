

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t ; i++){
		    int s = scan.nextInt();
		    int[] arr= new int[s];
		    for(int j = 0; j < s; j++){
		        arr[j] = scan.nextInt();
		        
		    }
		    int g = s-1;
		    int ra = 0;
		    for(int k = 0; k < s/2; k++) {
		        if (arr[k]== arr[g]){
		                g--;
		        } else {
		            System.out.println("NOT PERFECT");
		            break;
		        }
		        
		        if(s/2 == g) {
		            System.out.println("PERFECT");
		        }
		        
		    }
		}
	}
}