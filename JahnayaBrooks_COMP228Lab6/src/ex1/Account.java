package ex1;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() +
                "depositing: " + amount);

        balance += amount;

        System.out.println("New balance after the deposit: " + balance);

    }

    public synchronized  void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() +
                "withdrawing: " + amount);

        if (amount <= balance) {
            balance -= amount;
            System.out.println("New balance after withdrawal: " +balance);
        } else {
            System.out.println("Withdrawal failed due to insufficient funds!");

        }
    }

    public double getBalance() {
        return balance;
    }
}
