import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount>    accountList  = new ArrayList<>();
        BankAccount account1 = new BankAccount("TummmyBoy", 10000, 6);
        BankAccount account2 = new BankAccount("ButterBoy", 10000, 7);
        accountList.add(account1);
        accountList.add(account2);
        Scanner userInput        =       new Scanner(System.in);
        System.out.println("Are you an existing cutsomer? (-1 to exit) ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int      choice          =       userInput.nextInt();

        while(true){
            if (choice == 1) {
                userInput = new Scanner(System.in);
                System.out.println("Enter the account number: {Your choices are 6 or 7 for grading purposes}");
                int accountNumber = userInput.nextInt();

                for (int i = 0; i < accountList.size(); i++) {
                    BankAccount account = accountList.get(i);
                    int num = account.aNumber;
                    if (num == accountNumber) {
                        mainMenu(account,account.aNumber,accountList);
                        break;
                    }
                }
                break;

            } else if (choice == 2) {
                BankAccount newAccount = new BankAccount();
                accountList.add(newAccount);
                System.out.println("");
                mainMenu(newAccount, newAccount.aNumber, accountList);
                break;
            } else if (choice == -1) {
                System.out.print("Have a nice day!! Goodbye!");
                break;
            } else {
                System.out.print("Invalid choice");
                choice          =       userInput.nextInt();
            }
        }
    }

    public static void mainMenu(BankAccount account, int newAccountNum, List<BankAccount> accountList){
        System.out.println("Welcome " + account.name + "!");
        while (true){
            Scanner userInput        =       new Scanner(System.in);
            System.out.println("Welcome to the Main Menu, what would you like to do today?");
            System.out.println("1. Account Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Make a Transfer to an another account");
            System.out.println("0. Exit");
            int     choice          =       userInput.nextInt();
            if (choice == 1) {
                account.bankStatement();

            } else if (choice == 2) {
                Scanner prompt = new Scanner(System.in);
                System.out.println("How much would you like to withdraw?");
                double amount = prompt.nextDouble();
                account.withdrawal(amount);

            } else if (choice == 3) {
                Scanner prompt = new Scanner(System.in);
                System.out.println("How much would you like to deposit?");
                double amount = prompt.nextDouble();
                account.deposit(amount);

            } else if (choice == 4) {
                Scanner prompt = new Scanner(System.in);
                System.out.println("Please enter the account number you would like to transfer to? {Your choices are 6 or 7 for grading purposes}");
                int accountNumber   = prompt.nextInt();

                System.out.println("How much would you like to transfer?");
                double amount = prompt.nextDouble();

                for (int i = 0; i < accountList.size(); i++) {
                    BankAccount accountTo = accountList.get(i);
                    int num = accountTo.aNumber;
                    if (num == accountNumber) {
                        account.bankTransfer(account, accountTo, amount);
                        break;
                    }
                }
            } else if (choice == 0) {
                System.out.print("Have a nice day!! Goodbye!");
                break;
            }else {
            System.out.print("Invalid choice");
            choice          =       userInput.nextInt();
        }
        }


    }
}

