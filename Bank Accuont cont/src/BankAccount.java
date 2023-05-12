import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class BankAccount {
    public String name;
    public double balance;

    public int aNumber;

    public BankAccount(String name, double balance, int aNumber){
        this.name       =       name;
        this.balance    =       balance;
        this.aNumber    =       aNumber;
    }

    public BankAccount(){
        ArrayList<BankAccount>    accountList  = new ArrayList<>();

        System.out.println("Let's make a new account!");
        Scanner     accountName     =       new Scanner(System.in);
        System.out.println("What is the name for the Account? : ");
        this.name     =        accountName.nextLine();

        Scanner     newBalance     =       new Scanner(System.in);
        System.out.println("What is the beginning balance for the account?");
        this.balance     =        newBalance.nextDouble();


        int lowerBound = 1;
        int upperBound = 5;

        Random random = new Random();
        this.aNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;



    }
    public double deposit(double inTake){
        this.balance = this.balance + inTake;
        System.out.println(this.name + "'s account balance: " + this.balance);
        System.out.println("");

        return this.balance;
    }
    public double withdrawal(double outTake){
        this.balance = this.balance - outTake;
        System.out.println(this.name + "'s account balance: " + this.balance);
        System.out.println("");

        return this.balance;
    }

    public void bankStatement() {
        System.out.println(this.name + "'s account balance: " + this.balance);
        System.out.println("");

    }

    public double bankTransfer(BankAccount ac1, BankAccount ac2, double amountTransfer) {
        ac1.balance     =       ac1.balance     -       amountTransfer;
        ac2.balance     =       ac2.balance     +       amountTransfer;
        System.out.println( ac1.name + "'s account balance: " + ac1.balance);
        System.out.println( ac2.name + "'s account balance: " + ac2.balance);
        System.out.println("");

        return balance;
    }

    public int getaNumber() {
        return aNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", aNumber=" + aNumber +
                '}';
    }
}