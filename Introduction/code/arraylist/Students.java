import java.util.ArrayList;

public class Students {
    private final ArrayList<Student> roster;

    public Students() {
        this.roster = new ArrayList<>();
    }

    public void addStudent(String name, int id, String course) {
        roster.add(new Student(name, id, course));
    }

    public void displayRoster() {
        if (roster.isEmpty()) {
            System.out.println("No students in the roster.");
            return;
        }

        System.out.println("Student Roster:");
        for (Student student : roster) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Students roster = new Students();

        roster.addStudent("Aisha", 101, "Java");
        roster.addStudent("Ben", 102, "Database");
        roster.addStudent("Chloe", 103, "Web Development");
        roster.addStudent("Daniel", 104, "Networking");

        roster.displayRoster();
    }

    static class Student {
        private final String name;
        private final int id;
        private final String course;

        public Student(String name, int id, String course) {
            this.name = name;
            this.id = id;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public String getCourse() {
            return course;
        }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "', course='" + course + "'}";
        }
    }
}
