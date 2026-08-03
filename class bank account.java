import java.util.Scanner;

class BankAccount {
    long accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit amount
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();

        account.deposit(amount);

        System.out.println("\nUpdated Account Details:");
        account.displayDetails();

        sc.close();
    }
}
