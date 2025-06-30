import java.util.Scanner;
class Bank {
    int act;
    String name;
    int bal;
    public Bank(int act, String name, int bal) {
        this.act = act;
        this.name = name;
        this.bal = bal;
    }
    public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + act);
        System.out.println("Current Balance: ₹" + bal);
    }
    public void deposit(int amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(int amount) {
        if (amount <= bal) {
            bal -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Bank System!");
        System.out.print("Enter Account Number: ");
        int act = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        int bal = sc.nextInt();
        Bank account = new Bank(act, name, bal);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    account.display();
                    break;
                case 2:
                    System.out.print("Enter Amount to Deposit: ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter Amount to Withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}