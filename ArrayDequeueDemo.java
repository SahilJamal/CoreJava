package Collection;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.offerFirst(1);
		ad.offerLast(4);
		ad.offer(3);
		ad.offerFirst(2);
		
		System.out.println(ad);

		ad.pollFirst();
		
		System.out.println(ad);
		
		ad.pollLast();
		
		System.out.println(ad);
		
	}
	
}
