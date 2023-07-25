package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q  = new PriorityQueue<>(Comparator.reverseOrder());
		q.offer(3);
		q.offer(4);
		q.offer(1);
		
		System.out.println(q);
		
		q.poll();
		
		System.out.println(q);
		
		q.poll();
		
		System.out.println(q);
		
	}
	
}
