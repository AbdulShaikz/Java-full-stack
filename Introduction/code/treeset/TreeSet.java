public class TreeSet {
	public static void main(String[] args) {
		java.util.TreeSet<Integer> numbers = new java.util.TreeSet<>();
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);

		System.out.println("Sorted integers: " + numbers);

		java.util.TreeSet<Student> students = new java.util.TreeSet<>();
		students.add(new Student(3, "Charlie"));
		students.add(new Student(1, "Alice"));
		students.add(new Student(2, "Bob"));

		System.out.println("Sorted students: " + students);
	}

	static class Student implements Comparable<Student> {
		private final int rollNumber;
		private final String name;

		Student(int rollNumber, String name) {
			this.rollNumber = rollNumber;
			this.name = name;
		}

		@Override
		public int compareTo(Student other) {
			return Integer.compare(rollNumber, other.rollNumber);
		}

		@Override
		public String toString() {
			return rollNumber + " - " + name;
		}
	}
}

// Learning points:
// 1. TreeSet stores elements in sorted order.
// 2. TreeSet does not allow duplicate elements.
// 3. Custom objects must implement Comparable or use a Comparator.
// 4. compareTo determines the ordering of Student objects.
