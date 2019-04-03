import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt()-1;
            // int sum = 0;
            //  for(int i = 0 ; i < n; i++) {
            //      if(i % 3 == 0 || i % 5 == 0) {
            //          sum += i;
            //      }
            //     //  else if(i% 3 == 0) {
            //     //      sum += i;
            //     //  }
            //     //  else if(i % 5 == 0) {
            //     //      sum += i;
            //     //  }
            //  }
            long a = n/3;
            long b = n/5;
            long c = n/15;
            long sum = 3*a*(a+1)/2 + 5 *b*(b+1)/2 - 15*c*(c+1)/2;
             System.out.println(sum);
        }
    }
}