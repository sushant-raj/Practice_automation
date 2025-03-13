//package mypackage;
//
//import java.util.Scanner;
//
//class BankAccount {
//    private String accountHolderName;
//    private String userAccountNumber;
//    private double userAccountBalance;
//
//    // Default constructor
//    public BankAccount() {
//        this.accountHolderName = "Unknown";
//        this.userAccountNumber = "0000000000";
//        this.userAccountBalance = 0.0;
//    }
//
//    // Constructor overloading
//    public BankAccount(String accountHolderName, String userAccountNumber) {
//        this.accountHolderName = accountHolderName;
//        this.userAccountNumber = userAccountNumber;
//        this.userAccountBalance = 0.0;
//    }
//
//    public BankAccount(String accountHolderName, String userAccountNumber, double initialBalance) {
//        this.accountHolderName = accountHolderName;
//        this.userAccountNumber = userAccountNumber;
//        this.userAccountBalance = initialBalance;
//    }
//
//    // Getters and setters (Access Modifiers example)
//    public String getAccountHolderName() {
//        return accountHolderName;
//    }
//
//    public void setAccountHolderName(String accountHolderName) {
//        this.accountHolderName = accountHolderName;
//    }
//
//    public String getAccountNumber() {
//        return userAccountNumber;
//    }
//
//    public double getBalance() {
//        return userAccountBalance;
//    }
//
//    // Method Overloading
//    public void deposit(double amount) {
//        if (amount > 0) {
//            userAccountBalance += amount;
//            System.out.println(amount + " deposited successfully.");
//        } else {
//            System.out.println("Deposit amount must be positive.");
//        }
//    }
//
//    public void deposit(double amount, String message) {
//        deposit(amount);
//        System.out.println("Note: " + message);
//    }
//
//    public void withdraw(double amount) {
//        if (amount > 0 && amount <= userAccountBalance) {
//            userAccountBalance -= amount;
//            System.out.println(amount + " withdrawn successfully.");
//        } else {
//            System.out.println("InsufficientBalance or invalid amount.");
//        }
//    }
//
//    public void displayAccountDetails() {
//        System.out.println("Account Holder: " + accountHolderName);
//        System.out.println("Account Number: " + userAccountNumber);
//        System.out.println("Balance: " + userAccountBalance);
//    }
//}
//
//
//
//
//
//// Derived class to demonstrate method overriding
//class SavingsAccount extends BankAccount {
//    private double interestRate;
//
//    public SavingsAccount(String accountHolderName, String userAccountNumber, double initialBalance, double interestRate) {
//        super(accountHolderName, userAccountNumber, initialBalance);
//        this.interestRate = interestRate;
//    }
//
//    public void applyInterest() {
//        double interest = getBalance() * (interestRate / 100);
//        deposit(interest);
//        System.out.println("Interest of " + interest + " applied.");
//    }
//
//    // Method Overriding
//    @Override
//    public void displayAccountDetails() {
//        super.displayAccountDetails();
//        System.out.println("Interest Rate: " + interestRate + "%");
//    }
//}
//
//
//
//
//
//
//
//
//public class BankingApplication {
//    public static void main(String[] args) {
//
//        System.out.println("Welcome to the Banking Application!");
//        startBankingApplication();
//
//    }
//
//
//    public BankAccount account;
//    public static SavingsAccount savingaccount;
//    public static Scanner scanner;
//
//
//    public static void displayUserOptions() {
//        System.out.println("\nChoose an option:");
//        System.out.println("Enter 1 to Display Account Details");
//        System.out.println("Enter 2 to Deposit Amount");
//        System.out.println("Enter 3 to Withdraw Amount");
//        System.out.println("Enter 4 to Exit");
//    }
//
//    public static void takeUserChoicesForCurrentAccount() {
//        scanner = new Scanner(System.in);
//        boolean exit = false;
//        while (!exit) {
//            displayUserOptions();
//
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    account.displayAccountDetails();
//                    break;
//                case 2:
//                    System.out.print("Enter amount to deposit: ");
//                    double depositAmount = scanner.nextDouble();
//                    account.deposit(depositAmount);
//                    break;
//                case 3:
//                    System.out.print("Enter amount to withdraw: ");
//                    double withdrawAmount = scanner.nextDouble();
//                    account.withdraw(withdrawAmount);
//                    break;
//                case 4:
//                    exit = true;
//                    System.out.println("Exiting application. Thank you!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//
//        scanner.close();
//
//    }
//    public static void takeUserDetailsForCurrentAccount() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Create a new account:");
//
//        System.out.print("Enter account holder Name: ");
//        String userName = scanner.nextLine();
//
//        System.out.print("Enter account number: ");
//        String userAccountNumber = scanner.nextLine();
//
//        System.out.print("Enter initial Balance: ");
//        double initialBalance = scanner.nextDouble();
//
//
//        account = new BankAccount(userName, userAccountNumber, initialBalance);
//
//    }
//    public static void currentAccountUser() {
//        takeUserDetailsForCurrentAccount();
//        takeUserChoicesForCurrentAccount();
//    }
//
//    public static void takeUserDetailsForSavingsAccount() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("-------------Enter details to create a new account------------");
//
//        System.out.print("Enter account holder Name: ");
//        String userName = scanner.nextLine();
//
//        System.out.print("Enter account number: ");
//        String userAccountNumber = scanner.nextLine();
//
//        System.out.print("Enter initial Balance: ");
//        double initialBalance = scanner.nextDouble();
//
//        System.out.print("Enter initial interestRate: ");
//        double interestRate = scanner.nextDouble();
//
//        savingaccount = new SavingsAccount(userName, userAccountNumber, initialBalance, interestRate);
//    }
//
//    public static void takeUserChoicesForSavingsAccount() {
//        Scanner scanner = new Scanner(System.in);
//        boolean exit = false;
//        while (!exit) {
//            displayUserOptions();
//            System.out.println("Enter 5 to Apply Interest");
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    savingaccount.displayAccountDetails();
//                    break;
//                case 2:
//                    System.out.print("Enter amount to deposit: ");
//                    double depositAmount = scanner.nextDouble();
//                    savingaccount.deposit(depositAmount);
//                    break;
//                case 3:
//                    System.out.print("Enter amount to withdraw: ");
//                    double withdrawAmount = scanner.nextDouble();
//                    savingaccount.withdraw(withdrawAmount);
//                    break;
//                case 5:
//                    savingaccount.applyInterest();
//                    break;
//                case 4:
//                    exit = true;
//                    System.out.println("Exiting application. Thank you!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//
//        scanner.close();
//    }
//
//    public static void savingsAccountUser() {
//        takeUserDetailsForSavingsAccount();
//        takeUserChoicesForSavingsAccount();
//
//    }
//
//    public static void startBankingApplication() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose 1 for Savings account \nChoose 2 for Current account ");
//
//        System.out.print("Enter your choice: ");
//        int choice = scanner.nextInt();
//
//        switch (choice) {
//            case 1:
//                savingsAccountUser();
//                break;
//            case 2:
//                currentAccountUser();
//                break;
//        }
//
//    }
//}
