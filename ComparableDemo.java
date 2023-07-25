package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "id="+id+" name="+name;
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(3,"Divyesh"));
		list.add(new Student(1,"Hardik"));
		list.add(new Student(2,"Sahil"));
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.id-o2.id;
			}
		});
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		
		System.out.println(list);
		
	}
	
}
