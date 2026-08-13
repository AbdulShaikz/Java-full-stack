import java.util.Scanner;

class Address {
    private String city;
    private int pincode;

    public Address() {
        this("", 0);
    }

    public Address(String city, int pincode) {
        setCity(city);
        setPincode(pincode);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}

public class Student {
    private String name;
    private int age;
    private int rollNo;
    private Address address;

    public Student(String name, int age, int rollNo) {
        this(name, age, rollNo, new Address());
    }

    public Student(String name, int age, int rollNo, Address address) {
        setName(name);
        setAge(age);
        setRollNo(rollNo);
        setAddress(address);
    }

    public Student(String name, int rollNo) {
        this(name, 18, rollNo, new Address());
    }

    public Student() {
        this("", 18, 0, new Address());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            students[i].setName(scanner.nextLine());

            int age = -1;
            while (age < 0) {
                System.out.print("Enter age for student " + (i + 1) + ": ");
                age = Integer.parseInt(scanner.nextLine());
                if (age < 0) {
                    System.out.println("Age cannot be negative. Please enter a valid age.");
                }
            }
            students[i].setAge(age);

            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            students[i].setRollNo(Integer.parseInt(scanner.nextLine()));

            System.out.print("Enter city for student " + (i + 1) + ": ");
            String city = scanner.nextLine();
            System.out.print("Enter pincode for student " + (i + 1) + ": ");
            int pincode = Integer.parseInt(scanner.nextLine());
            students[i].setAddress(new Address(city, pincode));
        }

        scanner.close();

        Student s1 = new Student("Alice", 20, 101, new Address("Delhi", 110001));
        Student s2 = new Student("Bob", 22, 101, new Address("Mumbai", 400001));
        System.out.println("s1 equals s2? " + s1.equals(s2));

        Student oldest = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAge() > oldest.getAge()) {
                oldest = students[i];
            }
        }
        System.out.println("Oldest student: " + oldest);

        System.out.println("All student details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
