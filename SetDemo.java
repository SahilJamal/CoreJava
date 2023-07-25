package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> myset = new TreeSet();
		myset.add(1);
		myset.add(4);
		myset.add(2);
		myset.add(1);
		myset.add(1);
//		System.out.println(myset);
		
//		Object[] array =  myset.toArray();
//		for(int i=0;i <array.length; i++) {
//			System.out.println(array[i]);
//		}
		
//		for(Integer data : myset) {
//			System.out.println(data);
//		}
		
		Iterator<Integer> iterator= myset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		myset.remove(4);
		System.out.println(myset);
		
		myset.clear();
		System.out.println(myset);
		
		System.out.println(myset.isEmpty());
		
		
	}
	
}
