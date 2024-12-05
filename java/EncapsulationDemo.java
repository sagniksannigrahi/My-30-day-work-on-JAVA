class Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(500.0);
        System.out.println("Account balance: " + account.getBalance());
    }
}
