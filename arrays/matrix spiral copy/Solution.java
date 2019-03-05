import java.io.*;
import java.util.*;

class Solution {

  static int[] spiralCopy(int[][] inputmatrix) {
    // your code goes here

    int numrows = inputmatrix.length;
    int numcols = inputmatrix[0].length;
    int toprow = 0;
    int btmrow = numrows - 1;
    int leftcol  = 0;
    int rightcol = numcols - 1;
    List<String> result = new ArrayList<String>();
    while (toprow <= btmrow && leftcol <= rightcol) {
      for (int i = leftcol; i <= rightcol; i++) {
        String mat = inputmatrix[toprow][i]+"";
        result.add(mat);
          
      }
      toprow++;
      for (int j = toprow; j <= btmrow;j++){
        String mat1 = inputmatrix[j][rightcol]+"";
        result.add(mat1);
      }
      rightcol--;
      if(toprow <= btmrow) {
        for(int i = rightcol;i>=leftcol;i--) {
          result.add(inputmatrix[btmrow][i] + "");
        }
        btmrow--;
      }
      if(leftcol <= rightcol) {
        for(int i = btmrow; i>= toprow;i--) {
          result.add(inputmatrix[i][leftcol] + "");
        }
        leftcol++;
      }
    }
    int[] re = new int[result.size()];
    for(int i =0; i<result.size();i++) {
      re[i] = Integer.parseInt(result.get(i));
    }
    return re;
  }

  public static void main(String[] args) {
  }

}