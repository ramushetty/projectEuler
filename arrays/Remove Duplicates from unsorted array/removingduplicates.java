import java.util.*;
class removingduplicates {
	// public static void main(String[] args) {
	// 	Scanner scan = new Scanner(System.in);
	// 	int t = scan.nextInt();
	// 	while(t-- > 0) {
	// 		int n = scan.nextInt();
	// 		int[] arr = new int[n];
	// 		HashSet<Integer> s = new HashSet<Integer>();
	// 		for(int i = 0 ; i < n; i++) {
	// 			int temp =  scan.nextInt();
	// 			if (!s.contains(temp)) {
	// 				s.add(temp);
	// 			}
	// 		}
	// 	 Iterator<Integer> i=s.iterator();  
 //           while(i.hasNext())  
 //           {  
 //           System.out.print(i.next() + " ");  
 //           } 
 //           System.out.println();
	// 	}
	// }
	 	// public static void main(String[] args) {
	 	// 	Scanner scan = new Scanner(System.in);
	 	// 	int t = scan.nextInt();
	 	// 	while(t-- > 0) {
	 	// 		int n = scan.nextInt();
	 	// 		int[] arr = new int[n];
	 	// 		for (int i = 0; i < n; i++) {
	 	// 			arr[i] = scan.nextInt();
	 	// 		}
	 	// 		// List<Integer> s = new ArrayList<Integer>();
	 	// 		int[] outarr = new int[n];
	 	// 		int currentposition= 0 ;
	 	// 		for(int i = 0; i < n; i++) {
	 	// 			int count = 0;
	 	// 			for(int j = 0; j< n; j++) {
	 	// 				if (arr[i] == outarr[j]) {
	 	// 					count++;
	 	// 					break;
	 	// 				}
	 	// 			}
	 	// 			if (count == 0) {
	 	// 				outarr[currentposition] = arr[i];
	 	// 				currentposition++;
	 	// 			}
	 	// 		}
	 	// 		int[] uniquearr = new int[currentposition];
	 	// 		for (int i = 0 ; i < uniquearr.length;i++) {
	 	// 			uniquearr[i] = outarr[i];
	 	// 			System.out.print(outarr[i] + " ");
	 	// 		}
	 	// 		System.out.println();
	 	// 		// int count = 0;
	 	// 		// while(s.size() > count) {
	 	// 		// 	System.out.print(s.get(count) + " ");
	 	// 		// 	count++;
	 	// 		// }
	 	// 	}
	 	// }
	// public static void main(String[] args) {
	// 	Scanner scan = new Scanner(System.in);
	// 	int t = scan.nextInt();
	// 	while(t-- > 0) {
	// 		int n = scan.nextInt();
	// 		int[] arr = new int[n];
	// 		HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();
	// 		for (int i = 0 ; i < n; i++) {
	// 			int temp = scan.nextInt();
	// 			if (s.containsKey(temp)) {
	// 				// s.put(temp)=s.get(temp) + 1;
	// 				s.put(temp, s.get(temp) + 1);
	// 			} else {
	// 				s.put(temp , 1);
	// 			}
	// 		}
	// 		System.out.println(s.keySet());
	// 	}
	// }
	// 
	// 
		// public static void main (String[] args)
	 // {
	 
		//  Scanner sc = new Scanner(System.in);
		//  int T = sc.nextInt();
		//  for(int i = 0;i<T;i++)
		//  {
		//      int n = sc.nextInt();
		//      Integer a[] = new Integer[n];
		//      for(int x = 0;x<n;x++)
		//      {
		//          a[x] = sc.nextInt();
		//      }
		//      LinkedHashSet<Integer> ln = new LinkedHashSet<>(Arrays.asList(a));
		//      System.out.println(Arrays.asList(a));
	 //        for(Integer x : ln)
	 //        {
	 //            System.out.print(x+" ");
	 //        }
	 //        System.out.println();
		//  }
	 // }
		public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
			int t = scan.nextInt();
			while(t-- > 0) {
				int n = scan.nextInt();
				List<Integer> al = new ArrayList<Integer>();
				for(int i = 0; i < n ; i++) {
					int temp = scan.nextInt();
					if(!al.contains(temp)) {
						al.add(temp);
					}
				}
				for(int i = 0;i < al.size(); i++) {
					System.out.print(al.get(i) + " ");
				}
			}
		}
}