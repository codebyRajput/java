abstract class BankAccount {
    abstract double getBalance();
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double balance;

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double balance;

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    void deposit(double amount) {
        balance += amount;
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
    }
}

public class abstractmethod {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        savingsAccount.deposit(1000);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        currentAccount.deposit(2000);
        System.out.println("Current Account Balance: " + currentAccount.getBalance());

        savingsAccount.withdraw(500);
        System.out.println("Savings Account Balance after withdrawal: " + savingsAccount.getBalance());

        currentAccount.withdraw(1500);
        System.out.println("Current Account Balance after withdrawal: " + currentAccount.getBalance());
    }
}
