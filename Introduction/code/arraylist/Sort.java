import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 22));
		students.add(new Student("Bob", 19));
		students.add(new Student("Charlie", 21));

		Comparator<Student> byAge = (first, second) ->
				Integer.compare(first.getAge(), second.getAge());
		Collections.sort(students, byAge);

		for (Student student : students) {
			System.out.println(student);
		}
	}
}

class Student {
	private final String name;
	private final int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " - " + age;
	}
}
