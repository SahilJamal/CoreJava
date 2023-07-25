package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		q.offer(3);
		q.offer(4);
		
		System.out.println(q);
		
		q.poll();
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
	}
	
}
