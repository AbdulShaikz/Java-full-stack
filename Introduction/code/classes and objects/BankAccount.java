import java.util.Scanner;

public class BankAccount{
    private double balance;

    public BankAccount(){
        this.balance = 0.0;
    }

    public BankAccount(double initial){
        this.balance = Math.max(0.0, initial);
    }

    public void deposit(double amount){
        if(amount > 0) this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount <= 0) return false;
        if(amount > this.balance) return false;
        this.balance -= amount;
        return true;
    }

    public double checkBalance(){
        return this.balance;
    }

    public static void main(String[] args){
        BankAccount acct = new BankAccount(100.0);
        System.out.println("Initial balance: " + acct.checkBalance());

        acct.deposit(50.0);
        System.out.println("After depositing 50: " + acct.checkBalance());

        boolean ok = acct.withdraw(30.0);
        System.out.println("Withdraw 30 successful: " + ok + ", balance: " + acct.checkBalance());

        ok = acct.withdraw(200.0);
        System.out.println("Attempt withdraw 200 successful: " + ok + ", balance: " + acct.checkBalance());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double d = sc.nextDouble();
        acct.deposit(d);
        System.out.println("Balance: " + acct.checkBalance());
        sc.close();
    }
}