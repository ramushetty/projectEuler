import java.util.*;
import java.util.HashMap;
import java.util.Map;
class Differencebetweenhighestandlowestoccurrence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int j = 0; j < t ; j++) {
			int n = scan.nextInt();

			HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();
			for(int i = 0; i <n ; i++) {
				int temp = scan.nextInt();
				if(s.containsKey(temp)) {
					s.put(temp, s.get(temp)+1);
				} else{
					s.put(temp , 1);
				}
			}
			// System.out.println(s);
			int max = 0;
			int min = 0;
			int count = 0;
			for(Map.Entry p : s.entrySet()) {
				if(count == 0) {
					count++;
					max = (int)p.getValue();
					min = (int)p.getValue();
				}
				if((int)p.getValue()>max) {
					max = (int)p.getValue();
				} else {
					if ((int)p.getValue()<min) {
						min = (int)p.getValue();
					}
				}
			}
			System.out.println(max - min);
		}
	}
	
}