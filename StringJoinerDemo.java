package NewFeatures;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(",","[","]");
		
		joiner.add("Divyesh");
		joiner.add("Javed");
		joiner.add("Pratiksha");
		
		System.out.println(joiner);
		
		
		StringJoiner joiner2 = new StringJoiner(":");
		joiner2.add("name");
		joiner2.add("Hardik");
		
		joiner.merge(joiner2);
		
		System.out.println(joiner);

		
	}
	
}
