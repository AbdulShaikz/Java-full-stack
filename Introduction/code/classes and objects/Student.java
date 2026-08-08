import java.util.Scanner;

public class Student {
    String name;
    int age;
    int rollNo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        System.out.print("Enter name for student 1: ");
        s1.name = scanner.nextLine();
        System.out.print("Enter age for student 1: ");
        s1.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter roll number for student 1: ");
        s1.rollNo = Integer.parseInt(scanner.nextLine());

        Student s2 = new Student();
        System.out.print("Enter name for student 2: ");
        s2.name = scanner.nextLine();
        System.out.print("Enter age for student 2: ");
        s2.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter roll number for student 2: ");
        s2.rollNo = Integer.parseInt(scanner.nextLine());

        Student s3 = new Student();
        System.out.print("Enter name for student 3: ");
        s3.name = scanner.nextLine();
        System.out.print("Enter age for student 3: ");
        s3.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter roll number for student 3: ");
        s3.rollNo = Integer.parseInt(scanner.nextLine());

        scanner.close();

        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age + ", Roll No: " + s1.rollNo);
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age + ", Roll No: " + s2.rollNo);
        System.out.println("Student 3: " + s3.name + ", Age: " + s3.age + ", Roll No: " + s3.rollNo);
    }
}
