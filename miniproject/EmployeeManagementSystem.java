interface Payable {
	void generatePayslip();
}

abstract class Employee implements Payable {
	private final String name;
	private final int id;

	protected Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public abstract double calculateSalary();

	@Override
	public void generatePayslip() {
		System.out.printf("Payslip - ID: %d, Name: %s, Salary: $%.2f%n",
				id, name, calculateSalary());
	}
}

class FullTimeEmployee extends Employee {
	private final double monthlySalary;

	FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}
}

class Contractor extends Employee {
	private final double hourlyRate;
	private final int hoursWorked;

	Contractor(String name, int id, double hourlyRate, int hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}
}

class Intern extends Employee {
	private final double stipend;

	Intern(String name, int id, double stipend) {
		super(name, id);
		this.stipend = stipend;
	}

	@Override
	public double calculateSalary() {
		return stipend;
	}
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Employee[] employees = {
				new FullTimeEmployee("Alice", 101, 5000),
				new Contractor("Bob", 102, 40, 160),
				new Intern("Charlie", 103, 1200)
		};

		for (Employee employee : employees) {
			System.out.printf("Salary: $%.2f%n", employee.calculateSalary());
			employee.generatePayslip();
		}
	}
}
