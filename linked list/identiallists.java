import java.util.*;
class identiallists {
	static class Node {

		int data;
		Node next;
		Node(int d) {
			data  = d;
			next = null;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			int s = scan.nextInt();
			Node head1= null;
			Node head2 = null;
			Node tail1 = null;
			Node tail2 = null ;
			while(s-- > 0) {
				if(head1 == null) {
					head1 =  new Node(scan.nextInt());
					tail1 = head1;
				} else {
					Node temp = new Node(scan.nextInt());
					temp.next = head1;
					head1 = temp;
				} 

			}
			int s2 = scan.nextInt();
			while(s2-- > 0) {
				if(head2 == null) {
					head2 =  new Node(scan.nextInt());
					tail2 = head2;
				} else {
					Node temp = new Node(scan.nextInt());
					temp.next = head2;
					head2 = temp;
				} 

			}

			// while(head1 != null) {
			// 	System.out.println(head1.data);
			// 	head1 = head1.next;
			// }
			if(identical(head1,head2)) {
				System.out.println("Identical");
			} else {
				System.out.println("Not Identical");
			}

		}
	}
	public static boolean identical(Node head1, Node head2) {
		while(head1 != null && head2 != null) {
			if(head1.data != head2.data) {
				return false;
			} else {
				head1 = head1.next;
				head2 = head2.next;
			}
		}
		return true;
	}
}