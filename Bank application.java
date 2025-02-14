// Base class
abstract class BankAccount {
    protected double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Abstract withdraw method to be implemented by subclasses
    public abstract void withdraw(double amount);

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " | New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of $100 must be maintained.");
        }
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + 1; // Adding $1 transaction fee
        if (balance >= totalAmount) {
            balance -= totalAmount;
            System.out.println("Withdrew: $" + amount + " | Transaction Fee: $1 | New Balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied! Insufficient funds.");
        }
    }
}

// Main class to test the functionality
public class BankApplication {
    public static void main(String[] args) {
        // Creating a SavingsAccount with an initial balance of $500
        SavingsAccount savings = new SavingsAccount(500);
        savings.displayBalance();
        savings.withdraw(350); // Allowed
        savings.withdraw(50);  // Denied (balance would drop below $100)

        // Creating a CheckingAccount with an initial balance of $200
        CheckingAccount checking = new CheckingAccount(200);
        checking.displayBalance();
        checking.withdraw(50);  // Allowed (Fee deducted)
        checking.withdraw(150); // Denied (Insufficient balance)
    }
}
