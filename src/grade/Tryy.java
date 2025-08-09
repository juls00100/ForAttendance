package grade;

import banking.bankApp;
import java.util.Scanner;

public class Tryy {
    static bankApp[] bApp = new bankApp[10];
    static int accountCount = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("HELLO WELCOME TO MY BANKING SYSTEM!");

        int choice;
        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Banking");
            System.out.println("2. Shopping");
            System.out.println("3. Pay Bills");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bankMenu();
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("404! NOT OFUND");
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("404! NOT FOUND");
                    break;
                case 0:
                    System.out.println("");
                    System.out.print("SYSTEM OUT..");
                    break;
                default:
                    System.out.println("");
                    System.out.print("INVALID SELECTION!");
            }
        } while (choice != 0);
    }

    static void bankMenu() {
        int action;
        do {
            System.out.println("\nBANKING MENU:");
            System.out.println("1. Register Account");
            System.out.println("2. Login");
            System.out.println("3. View All Accounts");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter Selection: ");
            action = sc.nextInt();

            switch (action) {
                case 1:
                    registerAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    viewAllAccounts();
                    break;
                case 0:
                    System.out.println("BACKING TO MENU...");
                    break;
                default:
                    System.out.println("");
                    System.out.print("CHOICE IS INVALID");
            }
        } while (action != 0);
    }

    static void registerAccount() {
        char continueRegister;
        do {
            if (accountCount >= bApp.length) {
                System.out.println("LIMIT HAS BEEN REACHED!");
                return;
            }

            bApp[accountCount] = new bankApp();
            System.out.println("\n--- REGISTER YOUR NEW ACCOUNT ---");
                System.out.print("ENTER ACCOUNT NO.: ");
                int accNo = sc.nextInt();
                bApp[accountCount].setAccNo(accNo);
                System.out.println("Your account number is " + accNo); 
    
            System.out.print("SET YOUR PIN: ");
            bApp[accountCount].setPin(sc.nextInt());
            
             float initialDeposit;
        do {
            System.out.print("ENTER INITIAL DEPOSIT (it should not be 0): ");
            initialDeposit = sc.nextFloat();
            if (initialDeposit <= 0) {
                System.out.println("I SAID IT SHOULD NOT BE 0 Hmm...");
                System.out.println("IT IS WHETHER YOU'RE JOKING OR POOR. BUT YOU'RE BOTH HHAAH GOT YOU!");
                System.out.println("JK lmao. Please enter again:");
                System.out.println("");
            }
        } while (initialDeposit <= 0); 
            
            bApp[accountCount].setBalance(initialDeposit);
            accountCount++;
            System.out.println("GOOD,YOUR ACCOUNT IS NOW REGISTERED!");
            System.out.println("");
            System.out.print("WANT TO REGISTER ANOTHER ONE? (y/n): ");
            continueRegister = sc.next().charAt(0);
        } while (Character.toLowerCase(continueRegister) == 'y');
    }

    static void login() {
    if (accountCount == 0) {
        System.out.println("");
        System.out.print("404! No accounts found here.");
        return;
    }

    int pin;
    System.out.println("\n--- LOG IN ---");
    System.out.print("ENTER ACCOUNT NO.: ");
    int accNo = sc.nextInt();
    System.out.print("ENTER PIN: ");
    pin = sc.nextInt();

    bankApp currentAccount = verifyAccount(accNo, pin);
    if (currentAccount != null) {
        System.out.println("SUCCESS!");
        accountOperations(currentAccount);
    } else {
        System.out.println("Invalid account number or pin. Which is which.");
    }
}

static bankApp verifyAccount(int accNo, int pin) {
    for (int i = 0; i < accountCount; i++) {
        if (bApp[i].getAccNo() == accNo && bApp[i].getPin() == pin) {
            return bApp[i];
        }
    }
    return null;
}


    static void accountOperations(bankApp account) {
        int choice;
        do {
            System.out.println("\nAccount Menu:");
            System.out.println("1. View Account Info (not implemented)");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money(not implemented)");
            System.out.println("0. Logout");
            System.out.print("PLEASE ENTER YOUR CHOICE: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("");
                    System.out.print("SKIBIDI");
                    break;
                case 2:
                    depositMoney(account);
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("Nahh");
                    break;
                case 0:
                    System.out.println("");
                    System.out.println("YOU CHOOSE TO LOG OUT. OKSKIBIDI");
                    break;
                default:
                    System.out.println("");
                    System.out.print("YOUR CHOICE IS INVALID!");
            }
        } while (choice != 0);
    }

    static void depositMoney(bankApp account) {
    System.out.println("\n--- DEPOSIT MONEY ---");
    
    double amount;
    do {
        System.out.print("ENTER ANY AMOUNT: ");
        amount = sc.nextDouble();
        
        if (amount <= 0) {
            System.out.println("");
            System.out.println("IT SHOULD NOT BE 0 Hmm...");
            System.out.println("");
            //System.out.println("HAHA YOU'RE FUNNY MAN");
            System.out.println("PLEASE BE SERIOUS BRUHH");
        }
    } while (amount <= 0);

    account.setBalance((float) (account.getBalance() + amount));
        System.out.println("");
    System.out.println("You deposited P " + amount);
        System.out.println("");
    System.out.print("Your new balance: P " + account.getBalance());
}

    static void viewAllAccounts() {
            if (accountCount == 0) {
                System.out.println("Nothing found. 404");
                return;
            }
            System.out.println("\n--- Registered Accounts ---");
            for (int i = 0; i < accountCount; i++) {
                System.out.println((i+1) + ". Account No: " + bApp[i].getAccNo() + 
                                 " | Balance: $" + bApp[i].getBalance());
            }
        }

}
