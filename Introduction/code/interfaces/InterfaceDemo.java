interface Payable {
    void calculatePayment();
}

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