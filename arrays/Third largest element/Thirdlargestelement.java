import java.util.*;

class Thirdlargestelement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();  
			}
			Arrays.sort(arr);
			// System.out.println(arr[n-3]);// possibility of indexout od error
			int count = 0;
			// System.out.println(arr[arr.length]);
			for (int i = arr.length-1; i >= 0; i--) {
				if (count == 2) {
					System.out.println(arr[i]);
					break;
				}
				count++;
			}
			 //  	int len;

				// len = a.length;
				// len = len-3;
				// if (a.length<3)
				// return -1;
				// else
				//     return a[len];
			 //    }
				//    if(a.length<3)
		 //        return -1;
		 //        long max1=0,max2=0,max3=0;
		 //        for(int i=0;i<a.length;i++){
		 //            if(a[i]>max1)
		 //         {   max3=max2;
		 //            max2=max1;
		 //            max1=a[i];
		 //        }
		 //        else if(a[i]>max2)
		 //        {
		 //            max3=max2;
		 //            max2=a[i];
		 //        }
		 //        else if(a[i]>max3){
		 //            max3=a[i];
		 //        }
		 //        }return max3;
			// 	}	
			// }
	
}