package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-linked-list
 */

public class Day15_LinkedList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node1 head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
	public static Node1 insert(Node1 head, int data) {
		Node1 start = head;
		Node1 now = null;
		// Complete this method
		now = head;
		if (now == null)
			return new Node1(data);
		while (now.next != null)
			now = now.next;
		Node1 newNode1 = new Node1(data);
		now.next = newNode1;
		return start;
	}
	public static void display(Node1 head) {
        Node1 start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

}

class Node1 {
	int data;
	Node1 next;

	Node1(int d) {
		data = d;
		next = null;
	}
}

