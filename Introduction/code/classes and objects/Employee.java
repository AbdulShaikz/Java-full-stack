public class Employee {
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String toString() {
        return "Employee{name='" + name + "', basicSalary=" + basicSalary + "}";
    }

    public static void main(String[] args) {
        Employee e = new Employee("Alice", 50000);
        System.out.println(e);
        System.out.println("Net Salary: " + e.calculateNetSalary());
        System.out.println("toStrinng: " + e.toStrinng());
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateNetSalary() {
        double hra = basicSalary * 0.20;
        double grossSalary = basicSalary + hra;
        double tax = grossSalary * 0.10;
        return grossSalary - tax;
    }
    
    public String toStrinng() {
        return toString();
    }
}
