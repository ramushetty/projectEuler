/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Checkiftwoarraysareequalornot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			long[] arr1 = new long[n];
			long[] arr2 = new long[n];
			for(int i = 0; i < n; i++) {
				arr1[i] = scan.nextLong();
			}
			for(int i = 0; i < n; i++) {
				arr2[i] = scan.nextLong();
			}
			if(equalarr(arr1,arr2) == 1) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
			
		}
	}
	public static int equalarr(long[] arr1, long[] arr2) {
		if(arr1.length != arr2.length) {
			return 0;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i =0 ; i < arr1.length ; i++) {
				if(arr2[i] != arr1[i]) {
					return 0;
				}
		}
		return 1;
	}
}

//System.out.println(Arrays.equals(data1,data2)?"1":"0")
// import java.util.*; 
// import java.io.*; 
  
// class GFG  
// { 
//     // Returns true if arr1[0..n-1] and arr2[0..m-1] 
//     // contain same elements. 
//     public static boolean areEqual(int arr1[], int arr2[]) 
//     { 
//         int n = arr1.length; 
//         int m = arr2.length; 
          
//         // If lengths of arrays are not equal 
//         if (n != m) 
//             return false; 
   
//         // Store arr1[] elements and their counts in 
//         // hash map 
//         Map<Integer, Integer> map = new HashMap<Integer, Integer>(); 
//         int count = 0; 
//         for (int i = 0; i < n; i++) 
//         { 
//             if(map.get(arr1[i]) == null) 
//                 map.put(arr1[i], 1); 
//             else
//             { 
//                 count = map.get(arr1[i]); 
//                 count ++; 
//                 map.put(arr1[i], count); 
//             }    
//         } 
   
//         // Traverse arr2[] elements and check if all 
//         // elements of arr2[] are present same number 
//         // of times or not. 
//         for (int i = 0; i < n; i++) 
//         { 
//             // If there is an element in arr2[], but 
//             // not in arr1[] 
//             if (!map.containsKey(arr2[i])) 
//                 return false; 
   
//             // If an element of arr2[] appears more  
//             // times than it appears in arr1[] 
//             if (map.get(arr2[i]) == 0) 
//                 return false; 
   
//             count = map.get(arr2[i]); 
//             --count; 
//             map.put(arr2[i], count); 
//         } 
      
//         // again traverse arr2 to ensure that count  
//         // for all elelments become zero. 
//         for(int i = 0; i < n; i++) 
//         { 
//             if(map.get(arr2[i]) > 0) 
//                 return false; 
//         } 
//         return true; 
//     } 
      
//     //Driver code 
//     public static void main (String[] args)  
//     { 
//         int arr1[] = { 3, 5, 2, 5, 2}; 
//         int arr2[] = { 2, 3, 5, 5, 2}; 
          
//         if (areEqual(arr1, arr2)) 
//             System.out.println("Yes"); 
//         else
//             System.out.println("No"); 
  
//     } 
// }