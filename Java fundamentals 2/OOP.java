public class OOP {
    public static void main(String[] args) {
        // Creating a generic account
        // We create an object of type Account and assign it to the variable "account".
        // The Account class is a superclass that represents a generic bank account.
        Account account = new Account("123456");
        // We deposit 500 dollars into the account.
        account.deposit(500);
        // We withdraw 100 dollars from the account.
        account.withdraw(100);
        // We print the current state of the account.
        System.out.println(account);

        // Creating a savings account
        // We create an object of type SavingsAccount and assign it to the variable "savings".
        // The SavingsAccount class is a subclass of Account that represents a savings account with an interest rate.
        SavingsAccount savings = new SavingsAccount("789101", 2.5);
        // We deposit 1000 dollars into the savings account.
        savings.deposit(1000);
        // We apply the interest rate to the savings account.
        savings.applyInterest();
        // We print the current state of the savings account.
        System.out.println(savings);
    }
}

class Account {
    // Private variables to store the account number and balance.
    private String accountNumber;
    private double balance;

    // Constructor to create a new account with a given account number.
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        // Initialize the balance to 0.
        this.balance = 0.0;
    }

    // Method to get the account number.
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to get the balance.
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account.
    public void deposit(double amount) {
        // Check if the amount is positive.
        if (amount > 0) {
            // Add the amount to the balance.
            balance += amount;
        }
    }

    // Method to withdraw money from the account.
    public boolean withdraw(double amount) {
        // Check if the amount is positive and if the balance is enough to cover the withdrawal.
        if (amount > 0 && balance >= amount) {
            // Subtract the amount from the balance.
            balance -= amount;
            // Return true to indicate a successful withdrawal.
            return true;
        }
        // Return false to indicate an unsuccessful withdrawal.
        return false;
    }

    // Method to convert the object to a string.
    @Override
    public String toString() {
        // Return a string that describes the account.
        return "Account " + accountNumber + ": Balance = " + balance;
    }
}

class SavingsAccount extends Account {
    // Private variable to store the interest rate.
    private double interestRate;

    // Constructor to create a new savings account with a given account number and interest rate.
    public SavingsAccount(String accountNumber, double interestRate) {
        // Call the constructor of the superclass to create a new account.
        super(accountNumber);
        // Set the interest rate.
        this.interestRate = interestRate;
    }

    // Method to apply the interest rate to the account.
    public void applyInterest() {
        // Calculate the interest by multiplying the balance by the interest rate.
        double interest = getBalance() * (interestRate / 100);
        // Deposit the interest into the account.
        deposit(interest);
    }

    // Method to convert the object to a string.
    @Override
    public String toString() {
        // Return a string that describes the savings account.
        return "Savings " + getAccountNumber() + ": Balance = " + getBalance() + ", Interest Rate = " + interestRate;
    }
}


