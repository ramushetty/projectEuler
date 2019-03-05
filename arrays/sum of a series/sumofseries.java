
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int test = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < test;i++){
		    int num = Integer.parseInt(scan.nextLine());
		    int sum = num *(num+1)/2;
		    System.out.println(sum);
		}
	}
}