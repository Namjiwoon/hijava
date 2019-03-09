package hijava.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMain {
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test2() {
		int[] arr = new int[] { 2, 3, 1, 5, 3, 2};
		double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println("avg=" + avg);
		
		Arrays.stream(arr).sorted().forEach(n -> System.out.println("sort=" + n));
		Arrays.stream(arr).distinct().forEach(n -> System.out.println("distinct=" + n));
		
		Arrays.stream(arr).sorted().distinct().forEach(n -> System.out.println("sortDist=" + n));
		
		Arrays.stream(arr).filter(n -> n > 2).forEach(n -> System.out.println(n));
		
		System.out.println("--------------");
		System.out.println(Arrays.stream(arr).reduce(0, (p, n) -> p + n));
	}

	private static void test1() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(100, "Hong100"));
		students.add(new Student(20, "Lim20"));
		students.add(new Student(5, "Lee5"));
		
		students.stream().map(s -> s.getName()).forEach(n -> System.out.println(n));
		students.stream().mapToInt(s -> s.getId()).sum();
		
		System.out.println(students);
		System.out.println("---------------------------------------");
		Collections.sort(students, new Sorting());
		System.out.println(students);
	}
}
