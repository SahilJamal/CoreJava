package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		List<Integer> res = list.stream().map((data) -> {
			return data * 2;
		}).filter((data) -> {
			return data <= 6;
		}).collect(Collectors.toList());

		System.out.println(res);

		list.parallelStream().forEach((data) -> {
			System.out.println(data);
		});

		List<Integer> list1 = list.stream().map((data) -> {
			return data * 2;
		}).collect(Collectors.toList());

		System.out.println(list1);

		List<Integer> odds = list.stream().filter((data) -> {
			return data % 2 != 0;
		}).collect(Collectors.toList());

		System.out.println(odds);

		Integer s = list.stream().reduce((data, sum) -> {
			return sum = sum + data;
		}).get();

		System.out.println(s);

	}
}
