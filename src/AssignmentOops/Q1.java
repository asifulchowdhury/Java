package AssignmentOops;

// Abstract class BankAccount
abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount implements Interest {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest calculated and added: $" + interest);
    }
}

// Interface Interest
interface Interest {
    void calculateInterest();
}

// Main class
public class Q1 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        SavingsAccount savingsAccount = new SavingsAccount(2000, 5.0);

        System.out.println("Initial balances:");
        System.out.println("Checking Account: $" + checkingAccount.getBalance());
        System.out.println("Savings Account: $" + savingsAccount.getBalance());

        checkingAccount.deposit(500);
        savingsAccount.deposit(1000);

        checkingAccount.withdraw(200);
        savingsAccount.withdraw(300);

        savingsAccount.calculateInterest();

        System.out.println("Final balances:");
        System.out.println("Checking Account: $" + checkingAccount.getBalance());
        System.out.println("Savings Account: $" + savingsAccount.getBalance());
    }
}


