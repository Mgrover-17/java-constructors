// Parent Class: BankAccount
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountDetails() {
        System.out.println("\nSavings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456789", "Ram", 5000);
        System.out.println("Bank Account Details:");
        acc1.displayAccountDetails();

        acc1.deposit(1500);
        acc1.withdraw(2000);
        System.out.println("\nFinal Account Details:");
        acc1.displayAccountDetails();

        SavingsAccount savAcc1 = new SavingsAccount("987654321", "Sham", 8000, 2.5);
        savAcc1.displaySavingsAccountDetails();
    }
}
