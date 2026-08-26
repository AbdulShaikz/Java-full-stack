interface Payable {
    // Use an interface for a "can-do" capability or contract. It is ideal when
    // unrelated classes share behavior requirements, without shared instance state.
    void calculatePayment();
}

// Use an abstract class for an "is-a" relationship when related classes should
// inherit shared code or state, while leaving some behavior for subclasses.

class Employee implements Payable {
    @Override
    public void calculatePayment() {
        System.out.println("Calculating employee payment");
    }

}

class Freelancer implements Payable {
    @Override
    public void calculatePayment() {
        System.out.println("Calculating freelancer payment");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Payable employee = new Employee();
        Payable freelancer = new Freelancer();

        employee.calculatePayment();
        freelancer.calculatePayment();
    }
}