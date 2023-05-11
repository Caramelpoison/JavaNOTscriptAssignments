public class BankAccount {
    public String customer;
    public double balance;

    public BankAccount(String customer, double balance){
        this.customer   = customer;
        this.balance    = balance;
    }
    public double deposit(double inTake){
        this.balance = this.balance + inTake;
        return this.balance;
    }
    public double withdrawal(double outTake){
        this.balance = this.balance + outTake;
        return this.balance;
    }

    public void bankStatement() {
        System.out.println(this.customer + "'s account balance: " + this.balance);
        System.out.println("");
    }

    public double bankTransfer(BankAccount ac1, BankAccount ac2, double amountTransfer) {
        ac1.balance     =       ac1.balance     -       amountTransfer;
        ac2.balance     =       ac2.balance     +       amountTransfer;
        System.out.println( ac1.customer + "'s account balance: " + this.balance);
        System.out.println( ac2.customer + "'s account balance: " + this.balance);
        System.out.println("");

        return balance;
    }

}
