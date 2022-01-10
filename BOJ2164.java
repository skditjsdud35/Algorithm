import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ2164 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		Deque<Integer> deque = new LinkedList<>();
		
		int N = sc.nextInt();
		int card = N;
		int count = 0;
		
		while(card > 0) {
			deque.addLast(card--);
		}
		
		while(deque.size() != 1) {		
				
			if(count%2 == 0) {
				deque.pollLast();
			}
			else {
				deque.addFirst(deque.pollLast());
			}
			count++;
		}	
		
		System.out.println(deque.peekLast());
	}

}
