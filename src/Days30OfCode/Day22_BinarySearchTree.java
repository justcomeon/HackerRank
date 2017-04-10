package Days30OfCode;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-binary-search-trees
 */

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class Day22_BinarySearchTree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}

	public static Node insert(Node root, int data) {
		if (root == null )
			return new Node(data);
		else {
			if (data <= root.data) {
				// insert left
				Node cur = insert(root.left, data);
				root.left = cur;
			} else {
				// insert right
				Node cur = insert(root.right, data);
				root.right = cur;
			}
		}
		return root;
	}

	public static int getHeight(Node root) {
		if(root == null||(root.left==null && root.right==null)) {
			return 0;
		}
		return 1+Math.max(getHeight(root.left), getHeight(root.right));
	}

}
