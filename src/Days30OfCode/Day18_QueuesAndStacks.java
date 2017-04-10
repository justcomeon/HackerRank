package Days30OfCode;
/*
 * https://www.hackerrank.com/challenges/30-queues-stacks
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18_QueuesAndStacks {

	Stack stack = new Stack();
	Queue<Character> queue = new LinkedList<Character>();

	private void pushCharacter(char c) {
		this.stack.push(c);
	}

	private char popCharacter() {
		return (char)this.stack.pop();
	}

	private void enqueueCharacter(char c) {
		this.queue.offer(c);
	}

	private char dequeueCharacter() {
		return (char)this.queue.poll();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Day18_QueuesAndStacks p = new Day18_QueuesAndStacks();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is "
				+ ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}

}
