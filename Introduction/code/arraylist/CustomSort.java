import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class CustomSort {
	public static void sort(List<Student> list) {
		Collections.sort(list, Comparator.comparingInt(Student::getRollNo));
	}

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(103, "Ravi"));
		students.add(new Student(101, "Asha"));
		students.add(new Student(102, "Kiran"));

		sort(students);

		for (Student student : students) {
			System.out.println(student.getRollNo() + " - " + student.getName());
		}
	}
}

class Student {
	private final int rollNo;
	private final String name;

	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
}
